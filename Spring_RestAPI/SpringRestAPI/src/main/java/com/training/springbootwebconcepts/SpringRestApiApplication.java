package com.training.springbootwebconcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.training.springbootwebconcepts.products.Product;

@SpringBootApplication
public class SpringRestApiApplication {

	public static void main(String[] args) throws IOException, ParseException {
		SpringApplication.run(SpringRestApiApplication.class, args);
		
	/*	
		int s1[]={1,2,3};
		int s2[]={4,5,6};
		int s3[]={1,2,3};
		int s4[]={4,5,6};
		int[] arr[][]={{s1,s2},{s3,s4}};
		
		
		URL url=new URL("http://localhost:9092/studytogrow/product/productdetails");
	   HttpURLConnection httpconnection=	(HttpURLConnection) url.openConnection();
	   httpconnection.setRequestMethod("GET");
	   httpconnection.connect();
	  int responseCode= httpconnection.getResponseCode();
	
		if(responseCode!=200)
		{
			throw new RuntimeException("HttpResponseCode: " + responseCode);
		}
		else
		{
			String sline="";
			Scanner sc=new Scanner(url.openStream());
			while(sc.hasNext())
			{
				sline=sline+sc.nextLine();
				System.out.println(sline);
			}
			sc.close();
			System.out.println("URL Line Reading"+sline);
			JSONParser parse = new JSONParser(sline);
			ObjectMapper Obj = new ObjectMapper(); 
		   JsonNode jnode= Obj.readTree(sline);
		  
		   System.out.println(jnode.get("prodName"));
		   System.out.println(jnode.get("prodBrand"));
		   //System.out.println(jnode.get(1));
		  
           // System.out.println("Object Reading"+data_obj.getValue());
            
         
		}
	}
*/
}
}
