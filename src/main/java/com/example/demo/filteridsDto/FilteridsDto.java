package com.example.demo.filteridsDto;

import java.util.List;

import lombok.Data;

@Data
public class FilteridsDto {

	private String works;

	private int total_count;

	private int next_page;

	private int prev_page;

	/** リスト */
	private List<FilteridsDataDto> callback;

}
