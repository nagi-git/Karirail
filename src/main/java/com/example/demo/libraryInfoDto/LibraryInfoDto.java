package com.example.demo.libraryInfoDto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LibraryInfoDto {
	@JsonProperty("Libraries")
	/** 図書館情報リスト */
//	private List<LibrariesDto> libraryInfo = new ArrayList<>();
	private List<LibraryDto> libraryInfo;

	public List<LibraryDto> getLibraryInfo() {
		return libraryInfo;
	}
}
