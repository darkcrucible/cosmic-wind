package com.darkcrucible.cli.networkstress.commands;

import org.springframework.boot.cli.command.Command;
import org.springframework.boot.cli.command.HelpExample;
import org.springframework.boot.cli.command.options.OptionHelp;
import org.springframework.boot.cli.command.status.ExitStatus;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by DarkCrucible on 2/1/17.
 */
public class NetworkStressCommand implements Command {
	@Override
	public String getName() {
		return "network-stress";
	}

	@Override
	public String getDescription() {
		return "Network Stress Test";
	}

	@Override
	public String getUsageHelp() {
		return "Network Stress Test";
	}

	@Override
	public String getHelp() {
		return "Network Stress Test";
	}

	@Override
	public Collection<OptionHelp> getOptionsHelp() {
		return new ArrayList<>();
	}

	@Override
	public Collection<HelpExample> getExamples() {
		return new ArrayList<>();
	}

	@Override
	public ExitStatus run(String... args) throws Exception {
		return ExitStatus.OK;
	}
}
