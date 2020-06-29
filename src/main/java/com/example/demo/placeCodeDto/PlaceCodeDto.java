package com.example.demo.placeCodeDto;

import java.util.ArrayList;
import java.util.List;

public class PlaceCodeDto {

	/** ステータス */
	int status;

	/** メッセージ */
	String message;

	/** 図書館情報リスト */
	List<PlaceCodeDataDto> results = new ArrayList<>();

	public List<PlaceCodeDataDto> getResults() {
		return results;
	}

}
