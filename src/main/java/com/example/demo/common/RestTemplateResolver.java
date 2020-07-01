package com.example.demo.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateResolver {
	@Bean
	public RestTemplate placeCodeSearchRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();

		List<MediaType> supportedMediaTypes = new ArrayList<>(messageConverter.getSupportedMediaTypes());

		// text/plainのJacksonの処理対象にくわえる
		supportedMediaTypes.add(MediaType.TEXT_PLAIN);
		supportedMediaTypes.add(MediaType.APPLICATION_JSON);
		supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
		messageConverter.setSupportedMediaTypes(supportedMediaTypes);

		// カスタムしたHttpMessageConverterを適用
		restTemplate.setMessageConverters(Collections.singletonList(messageConverter));
//		restTemplate.getMessageConverters().add(new JavaScriptMessageConverter());

		return restTemplate;
	}

}
