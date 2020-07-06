package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.filteridsDto.FilteridsDto;
import com.example.demo.filteridsDto.PlaceCodeDto;

@Service
public class FilteridsService {

	@Autowired
	@Qualifier("filteridsSearchRestTemplate")
	RestTemplate restTemplate;

	/** 図書館検索API リクエストURL */
	private static final String URL = "https://api.calil.jp/library?appkey=cb88029bcac7faa027f0e070749a2901&systemname={formal}&format=json&limit=1&callback=";

	public PlaceCodeDto service(String formal) {
		System.out.println("service呼び出し成功");
		return restTemplate.getForObject(URL, FilteridsDto.class, filter_ids);
	}

}
