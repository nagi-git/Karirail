package com.example.demo.placeCodeDto;

import lombok.Data;

@Data
public class PlaceCodeDataDto {
	/** 都道府県名 */
	private String placecode;

	/** 図書館のシステムID */
	private String systemid;

	/** 図書館名 */
	private String formal;

	/** 図書館URL */
	private String url_pc;

	/** 図書館住所 */
	private String address;
}
