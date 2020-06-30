package com.example.demo.placeCodeDto;

import lombok.Data;

@Data
public class PlaceCodeDataDto {
	/** 都道府県名 */
	private String pref;

	/** システムID */
	private String systemid;

	/** システム名称 */
	private String systemname;

	/** システム毎の図書館キー */
	private String libkey;

	/** 略称 */
	private String Short;

	/** 正式名称 */
	private String formal;

	/** PC版ウェブサイト */
	private String url_pc;

	/** 住所 */
	private String address;

	/** 市町村 */
	private String city;

	/** 郵便番号 */
	private String post;

	/** 電話番号 */
	private String tel;

	/** 位置情報 */
	private String geocode;

	/** カテゴリー */
	private String category;

	/** 外観写真 */
	private String image;

	/** パラメータでgeocodeが指定されている場合、その地点からの距離(単位：km) */
	private String distance;

}
