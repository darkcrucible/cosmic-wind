package com.darkcrucible.cli.networkstress;

import com.darkcrucible.cli.networkstress.commands.NetworkStressCommand;
import org.springframework.boot.cli.command.Command;
import org.springframework.boot.cli.command.CommandFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by DarkCrucible on 2/1/17.
 */
public class NetworkStressTestCommandFactory implements CommandFactory {
	private static final List<Command> NETWORK_STRESS_COMMANDS = Arrays.asList(new NetworkStressCommand());

	@Override
	public Collection<Command> getCommands() {
		return NETWORK_STRESS_COMMANDS;
	}
}
