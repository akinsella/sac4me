/*
 * Copyright (c) 1999 World Wide Web Consortium
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 *
 * $Id: Encoding.java,v 1.1 1999/04/02 13:23:32 plehegar Exp $
 */
package org.w3c.css.flute.util;

import java.io.InputStream;
import org.helyx.basics4me.util.Properties;

/**
 * @version $Revision: 1.1 $
 * @author Philippe Le Hegaret
 */
public class Encoding {
	
	private Encoding() {
	}

	/**
	 * Converts the format encoding information into Java encoding information.
	 */
	public static String getJavaEncoding(String encoding) {
		String _result = encodings.getProperty(encoding);
		if (_result == null) {
			return encoding;
		}
		return _result;
	}

	static Properties encodings;

	static {
		encodings = new Properties();

		try {
			InputStream is = Encoding.class.getResourceAsStream("/org/w3c/flute/util/encoding.properties");
			System.out.println("is: " + is);
			encodings.load(is);

		}
		catch (Exception e) {
			System.err.println(Encoding.class + ": couldn't load encoding properties ");
			e.printStackTrace();
		}
	}
}
