package org.w3c.css.flute.util;

public class BooleanUtil {

	private static final String CAT = "BOOLEAN_UTIL";

	public static final String TRUE = "true";
	public static final String FALSE = "false";

	private BooleanUtil() {
		super();
	}
	
	public static boolean getBoolean(String systemProperty) {
		String systemPropertyValue = System.getProperty(systemProperty);
		
		return TRUE.equals(systemPropertyValue);
	}
	
}
