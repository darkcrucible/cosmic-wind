package com.darkcrucible.cli.networkstress.commands;

import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import org.springframework.boot.cli.command.options.OptionHandler;
import org.springframework.boot.cli.command.status.ExitStatus;

import static java.util.Arrays.asList;

public class NetworkStressOptionHandler extends OptionHandler {
	OptionSpec<String> urlOption;
	OptionSpec<String> countOption;
	OptionSpec<String> periodOption;

	@Override
	protected final void options() {
		urlOption = option(asList("url", "u"), "Url to stress test (required)").withRequiredArg();
		countOption = option(asList("count", "c"), "Number of times to call url").withOptionalArg();
		periodOption = option(asList("period", "p"), "Number of milliseconds between calls").withRequiredArg();

		doOptions();
	}

	protected void doOptions() {
	}

	@Override
	protected synchronized ExitStatus run(OptionSet options) throws Exception {
		String url;
		if (options.has(urlOption)) {
			url = options.valueOf(urlOption);

			System.out.println("Stress testing URL: " + url);

			Long count;
			if(options.has(countOption)) {
				String countString = options.valueOf(countOption);
			}

			if

			return ExitStatus.OK;
		} else {
			System.out.println("URL required.");
			return ExitStatus.ERROR;
		}
	}
}
