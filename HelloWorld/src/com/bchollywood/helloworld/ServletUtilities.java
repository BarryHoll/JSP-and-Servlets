package com.bchollywood.helloworld;

public class ServletUtilities {
	public static String headWithTitle(String title) {
		return("<!DOCTYPE html>\n"
				+ "<html lang=\"en\">\n"
				+ "<head><title>" + title + "</title></head>\n");
	}

}
