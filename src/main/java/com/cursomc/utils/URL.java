package com.cursomc.utils;

import java.net.URLDecoder;

public class URL {
	
	public static String decodeParam(String s) {
		
		try {
			return URLDecoder.decode(s, "UTF-8");
		} catch (Exception e) {
			
			return "";
		}
		
	}

}
