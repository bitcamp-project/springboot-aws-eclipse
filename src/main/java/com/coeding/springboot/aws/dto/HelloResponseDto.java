package com.coeding.springboot.aws.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*
 * 응답 data 변환
 * feat. Lombok
 */
@Getter
@RequiredArgsConstructor	// final memeber
public class HelloResponseDto {
	
	private final String name;
	private final int count;
	

}
