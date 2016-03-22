package com.platform.toolbox.util;

import java.util.ResourceBundle;

public class ResourceHolder {

	public static ResourceBundle resource = ResourceBundle.getBundle("global");

	public static String getValue(String key) {
		return resource.getString(key);
	}
}
