package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.SanphamDTO;

public interface ISanphamService {
	List<SanphamDTO> findAll();
}
