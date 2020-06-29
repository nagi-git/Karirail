package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.placeCodeDto.PlaceCodeDto;

@Service
public class PlaceCodeService {

	@Autowired
	@Qualifier("placeCodeSearchRestTemplate")
	RestTemplate restTemplate;

	/** 図書館検索API リクエストURL */
	private static final String URL = "https://api.calil.jp/library?appkey=${APP_KEY}&systemid={placecode}&format=json&callback=";

	public PlaceCodeDto service(String placecode) {
		return restTemplate.getForObject(URL, PlaceCodeDto.class, placecode);
	}

}
