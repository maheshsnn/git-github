package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.base.ManageBrowser;

public class ReadMandatoryFields extends ManageBrowser{

	public static Properties prop = new Properties();

	public void getFields() {

		InputStream input = null;

		try {
			System.out.println(System.getProperty("user.dir"));

			input = new FileInputStream(System.getProperty("user.dir") +System.getProperty("file.separator")+pro.Mandatoryfields());

			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static boolean isMandatory(String strFieldName) {
		System.out.println(prop.getProperty(strFieldName));
		return (prop.getProperty(strFieldName) != null);

	}

	}
