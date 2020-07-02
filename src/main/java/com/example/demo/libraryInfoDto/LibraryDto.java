package com.example.demo.libraryInfoDto;

import lombok.Data;

@Data
public class LibraryDto {
	/** カテゴリー */
	private String category;

	/** 市町村 */
	private String city;

	/** 略称 */
	private String Short;

	/** システム毎の図書館キー */
	private String libkey;

	/** 都道府県名 */
	private String pref;

	/** プライマリーキーか？ */
	private boolean primary;

	/** faid */
	private String faid;

	/** 位置情報 */
	private String geocode;

	/** システムID */
	private String systemid;

	/** 住所 */
	private String address;

	/** 図書館ID */
	private String libid;

	/** 電話番号 */
	private String tel;

	/** システム名称 */
	private String systemname;

	/** isil */
	private String isil;

	/** 郵便番号 */
	private String post;

	/** PC版ウェブサイト */
	private String url_pc;

	/** 正式名称 */
	private String formal;

//	/** 外観写真 */
//	private String image;
//
//	/** パラメータでgeocodeが指定されている場合、その地点からの距離(単位：km) */
//	private String distance;

}
