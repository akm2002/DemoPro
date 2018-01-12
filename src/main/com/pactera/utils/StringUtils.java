package main.com.pactera.utils;

public class StringUtils {

	public static boolean isEmpty(String text) {
		return (text == null || text.trim().length() == 0);
	}
	
}
