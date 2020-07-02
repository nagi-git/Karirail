package com.example.demo.libraryInfoDto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class LibrariesDto {

	/** 図書館情報リスト */
	private List<LibraryDto> libraries = new ArrayList<>();

}
