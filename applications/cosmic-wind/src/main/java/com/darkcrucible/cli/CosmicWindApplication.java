package com.darkcrucible.cli;

import org.springframework.boot.cli.command.CommandFactory;
import org.springframework.boot.cli.command.CommandRunner;
import org.springframework.boot.cli.command.core.HelpCommand;
import org.springframework.boot.cli.command.core.VersionCommand;


import java.util.ServiceLoader;

public class CosmicWindApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CosmicWindApplication.class, args);
		System.setProperty("java.awt.headless", Boolean.toString(true));

		CommandRunner runner = new CommandRunner("cosmic-wind");
		runner.addCommand(new HelpCommand(runner));
		addServiceLoaderCommands(runner);
		runner.setOptionCommands(HelpCommand.class, VersionCommand.class);
		int exitCode = runner.runAndHandleErrors(args);
		if (exitCode != 0) {
			// If successful, leave it to run in case it's a server app
			System.exit(exitCode);
		}
	}


	private static void addServiceLoaderCommands(CommandRunner runner) {
		ServiceLoader<CommandFactory> factories = ServiceLoader
				.load(CommandFactory.class);
		for (CommandFactory factory : factories) {
			runner.addCommands(factory.getCommands());
		}
	}


}

