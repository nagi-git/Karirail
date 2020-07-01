package com.example.demo.common;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

public class JavaScriptMessageConverter extends AbstractJackson2HttpMessageConverter {

	// Add a new mediatype converter
	public JavaScriptMessageConverter() {
		super(Jackson2ObjectMapperBuilder.json().build(), new MediaType("application", "javascript"));
	}
}
