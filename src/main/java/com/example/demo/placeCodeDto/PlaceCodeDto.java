package com.example.demo.placeCodeDto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PlaceCodeDto {
	/** カテゴリー */
	private String message;

	/** 図書館情報リスト */
	List<PlaceCodeDataDto> callback = new ArrayList<>();

}
