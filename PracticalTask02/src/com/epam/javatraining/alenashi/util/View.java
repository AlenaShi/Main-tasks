package com.epam.javatraining.alenashi.util;

import org.apache.log4j.Logger;

public class View {
	public static final Logger LOG = Logger.getRootLogger();

	public static void log(Object msg) {
		LOG.info(msg);
	}

	public static void print(Object msg) {
		System.out.println(msg);
	}

}
