package com.darkcrucible.cli.networkstress.commands;

import joptsimple.OptionSpec;
import org.springframework.boot.cli.command.Command;
import org.springframework.boot.cli.command.HelpExample;
import org.springframework.boot.cli.command.OptionParsingCommand;
import org.springframework.boot.cli.command.options.OptionHandler;
import org.springframework.boot.cli.command.options.OptionHelp;
import org.springframework.boot.cli.command.status.ExitStatus;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Arrays.asList;

/**
 * Created by DarkCrucible on 2/1/17.
 */
public class NetworkStressCommand extends OptionParsingCommand {
	public NetworkStressCommand() {
		super("network-stress", "network stress test", new NetworkStressOptionHandler());
	}

}

