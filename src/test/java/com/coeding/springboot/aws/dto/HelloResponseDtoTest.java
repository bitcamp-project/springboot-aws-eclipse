package com.coeding.springboot.aws.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

	@Test
	public void getDto() {
		String name = "helloResponseDto";
		HelloResponseDto dto = new HelloResponseDto(name, 0);
		
		// 검사
		assertThat(dto.getName()).isEqualTo(name);
		assertThat(dto.getCount()).isEqualTo(0);
		
	}
}
