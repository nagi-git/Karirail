package com.example.demo.placeCodeDto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PlaceCodeDto {

	/** 図書館情報リスト */
	List<PlaceCodeDataDto> results = new ArrayList<>();

}
