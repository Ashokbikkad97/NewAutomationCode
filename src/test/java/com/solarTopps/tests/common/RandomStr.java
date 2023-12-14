package com.solarTopps.tests.common;

import java.util.Random;

import com.solarTopps.tests.interfaces.CommonUnimplementedMethods;

public class RandomStr implements CommonUnimplementedMethods {

	@Override
	public String randomString(int length) {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(random.nextInt(chars.length())));
		}
		return sb.toString();
	}

	@Override
	public String randomInteger(int length) {
		String chars = "012345678911223344";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(random.nextInt(chars.length())));
		}
		return sb.toString();
	}

}