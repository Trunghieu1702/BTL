package com.laptrinhjavaweb.api.admin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.ProDuctDTO;

@RestController(value = "proDuctAPIOfAdmin")
public class ProDuctApi {

	@PostMapping("/api/product")
	public ProDuctDTO createProDuct(@RequestBody ProDuctDTO productDTO)
	{
		return productDTO;
	}
	
	@PutMapping("/api/product")
	public ProDuctDTO updateProDuct(@RequestBody ProDuctDTO productDTO)
	{
		return productDTO;
	}
	
	@DeleteMapping("/api/product")
	public void deleteProDuct(@RequestBody ProDuctDTO productDTO)
	{
		
	}
}
