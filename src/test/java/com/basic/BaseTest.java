package com.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class BaseTest 
{
	public static String projectPath = System.getProperty("user.dir");
	
	public static FileInputStream fis;
	public static Properties envprop;
	public static Properties testprop;
	public static Properties instanceprop;
	
  @Test
  public void init() throws IOException 
  {
		
	  //initializing envproperty file 
	  fis = new FileInputStream(projectPath+"\\src\\main\\properties\\environment.properties"); 
	  envprop = new Properties();
	  envprop.load(fis);
	  String envPropFile = envprop.getProperty("env");
	  System.out.println("envpropert file initilized : "+envPropFile);
	  //initialize test module property file
	  fis = new FileInputStream(projectPath+"\\src\\main\\properties\\"+envPropFile+".properties"); 
	  testprop = new Properties(); 
	  testprop.load(fis); 
	  String testEnvProp = testprop.getProperty("amazonurl");
	  System.out.println("test envronment executed : "+testEnvProp);
		 
	  
	 

		
	  
	  
  }
}
