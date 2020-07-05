package com.example.demo.placeCodeDto;

import java.util.List;

public class PlaceCodeDto {
	/** 図書館情報リスト */
	private List<PlaceCodeDataDto> callback;

	public List<PlaceCodeDataDto> getCallback() {
		return callback;
	}

	public void setCallback(List<PlaceCodeDataDto> callback) {
		this.callback = callback;
	}
}
