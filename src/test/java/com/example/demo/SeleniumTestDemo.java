package com.example.demo;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.config.SeleniumConfig;


public class SeleniumTestDemo {
	
	@Autowired
	private static SeleniumConfig config;
     
	@BeforeClass
	public static void setUp() {
		config = new SeleniumConfig();
	}
	
    @Test
    public void testListUser() {
        
        String url = "http://localhost:9080/list_user";
        config.getDriver().get(url);
    }
    
    @Test
    public void testAddUser() {
    	config = new SeleniumConfig();
    	
    }
}
