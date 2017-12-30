package com.oreilly.jenkins;

public class HelloWorldMavenModule {

	public static void main(String[] args) {
		MessageSource messageSource = new MessageSource();
		System.out.println(messageSource.getMessage());
	}
}
