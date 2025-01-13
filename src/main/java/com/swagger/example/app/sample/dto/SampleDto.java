package com.swagger.example.app.sample.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

public class SampleDto {

	@Getter
	@Setter
	@Schema(name = "SampleDto.Request")
	public static class Request {

		@Size(max = 10, message = "이름은 최대 10자리까지 가능합니다.")
		@Schema(description = "이름", maxLength = 10)
		private String name;

		@Schema(description = "조회 시작일", format = "yyyy-MM-dd", example = "1999-01-01")
		private LocalDate startDt;

		@Schema(description = "조회 종료일", format = "yyyy-MM-dd", example = "2999-01-01")
		private LocalDate endDt;
	}

	@Getter
	@Setter
	@Schema(name = "SampleDto.Response")
	public static class Response {

		@NotNull
		@Schema(description = "고유번호")
		private Long id;

		@NotNull
		@Schema(description = "이름", maxLength = 10)
		private String name;

		@NotNull
		@Schema(description = "생성일시", pattern = "yyyy-MM-dd HH:mm:ss", type = "string")
		private LocalDateTime createdAt;
	}

	@Getter
	@Setter
	@Schema(name = "SampleDto.DetailResponse")
	public static class DetailResponse {

		@NotNull
		@Schema(description = "고유번호")
		private Long id;

		@NotNull
		@Schema(description = "이름", maxLength = 10)
		private String name;

		@NotNull
		@Schema(description = "휴대폰번호", maxLength = 11)
		private String phone;

		@Schema(description = "등급", maximum = "10")
		private Integer rank;

		@Schema(description = "생년월일", pattern = "yyyy-MM-dd")
		private LocalDate birth;

		@Schema(description = "설명")
		private String description;

		@NotNull
		@Schema(description = "생성일시", pattern = "yyyy-MM-dd HH:mm:ss", type = "string")
		private LocalDateTime createdAt;
	}

	@Getter
	@Setter
	@Schema(name = "SampleDto.Create")
	public static class Create {

		@NotBlank(message = "이름을 입력해 주세요.")
		@Size(max = 10, message = "이름은 10자 이하여야 합니다.")
		@Schema(description = "이름", maxLength = 10, example = "레몬케어")
		private String name;

		@NotBlank(message = "휴대폰번호를 입력해 주세요.")
		@Schema(description = "휴대폰번호('-'제외)", maxLength = 11, example = "01012345678")
		private String phone;

		@Schema(description = "생년월일", pattern = "yyyy-MM-dd")
		private LocalDate birth;
	}

	@Getter
	@Setter
	@Schema(name = "SampleDto.Update")
	public static class Update {

		@Size(max = 255, message = "설명은 255자 이하여야 합니다.")
		@Schema(description = "설명", maxLength = 255)
		private String description;
	}
}
