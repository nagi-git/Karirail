package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.filteridsDto.FilteridsDto;

@Service
public class FilteridsService {

	@Autowired
	@Qualifier("filteridsSearchRestTemplate")
	RestTemplate restTemplate;

	/** 図書館検索API リクエストURL */
	private static final String URL = "https://api.annict.com/v1/works?filter_ids={filter_ids}&access_token=6TCOx_Yr4oe0vnENIq01CruyxtHMzh-is19txE8t5kM";

	public FilteridsDto service(String filter_ids) {
		System.out.println("service呼び出し成功");
		return restTemplate.getForObject(URL, FilteridsDto.class, filter_ids);
	}

}
