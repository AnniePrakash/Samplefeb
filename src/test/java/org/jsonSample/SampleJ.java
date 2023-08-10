package org.jsonSample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class SampleJ {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		//1.File
		
		File file=new File("C:\\Users\\USER\\eclipse-workspace\\FebMavenSample\\src\\test\\resources\\sample.json");
		
		//FileReader
		
		FileReader reader=new FileReader(file);
		
		//3.To read data from JSON ,we need to use class called jsonparse---
		//This class is present on simple json dependency
		
		JSONParser parser=new JSONParser();
		
		//By using method called parse(),we are going to read the json file
		
		Object parse = parser.parse(reader);
		
		//To get data from json ,we need to type object to json object 
		
		JSONObject ob =(JSONObject) parse;
		
		
	Object object = ob.get("employees");
	
	//convert these object into JSONArray
	
	JSONArray arr=(JSONArray)object;
	
	Object object2 = arr.get(0);
	
	//convert these object into JSON object
	
	JSONObject onn=(JSONObject) object2;
	
	String string = onn.get("Name").toString();
	String string2 = onn.get("age").toString();
	
	System.out.println(string+"     "+string2);
		
		
		
		
		
		
		
		
		
		
	}

}
