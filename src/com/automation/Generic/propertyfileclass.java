package com.automation.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfileclass implements Framework_constants
{
	public static FileInputStream fis;
	
	public static String propertyfile(String key)
	{
		try
		{
			 fis=new FileInputStream(propertyfile);
		}
		catch (FileNotFoundException e) 
		{

			e.printStackTrace();
		}
		
		Properties prop=new Properties();
		try
		{
			prop.load(fis);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
		
	}

}
