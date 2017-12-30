package com.oreilly.jenkins;

public class HelloWorldMaven {

	public static void main(String[] args) {
		MessageSource msgSource = new MessageSource();
		System.out.println(msgSource.getMessage());
	}
	
}
