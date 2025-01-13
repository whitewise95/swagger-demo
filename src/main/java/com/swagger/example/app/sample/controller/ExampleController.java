package com.swagger.example.app.sample.controller;

import com.swagger.example.app.sample.dto.SampleDto;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/samples")
public class ExampleController {

	@GetMapping
	@Operation(summary = "샘플 목록 조회")
	public ResponseEntity<List<SampleDto.Response>> getSamples(@ParameterObject final SampleDto.Request request) {
		return ResponseEntity.ok(new ArrayList<>());
	}

	@GetMapping("/{id}")
	@Operation(summary = "샘플 상세 조회")
	public ResponseEntity<SampleDto.DetailResponse> getSample(@PathVariable final long id) {
		return ResponseEntity.ok(new SampleDto.DetailResponse());
	}

	@PostMapping
	@Operation(summary = "샘플 추가")
	public ResponseEntity<SampleDto.DetailResponse> create(@RequestBody @Valid final SampleDto.Create create) {
		return ResponseEntity.ok(new SampleDto.DetailResponse());
	}

	@PutMapping("/{id}")
	@Operation(summary = "샘플 수정")
	public ResponseEntity<SampleDto.DetailResponse> update(@PathVariable final long id,
														   @RequestBody @Valid final SampleDto.Update update) {
		return ResponseEntity.ok(new SampleDto.DetailResponse());
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "샘플 삭제")
	public ResponseEntity<SampleDto.DetailResponse> delete(@PathVariable final long id) {
		return ResponseEntity.ok(new SampleDto.DetailResponse());
	}
}
