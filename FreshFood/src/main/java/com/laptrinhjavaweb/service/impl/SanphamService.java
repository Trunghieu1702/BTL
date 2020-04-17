package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.SanphamDTO;
import com.laptrinhjavaweb.entity.SanphamEntity;
import com.laptrinhjavaweb.repository.SanphamRepository;
import com.laptrinhjavaweb.service.ISanphamService;

@Service
public class SanphamService implements ISanphamService{

	@Autowired
	private SanphamRepository sanphamRepository;
	@Override
	public List<SanphamDTO> findAll() {
		List<SanphamDTO> models  = new ArrayList<>();
		
		List<SanphamEntity> entities = sanphamRepository.findAll();
		for (SanphamEntity item: entities) {
			SanphamDTO spDTO = new SanphamDTO();
			spDTO.setGia(item.getGia());
			spDTO.setTensp(item.getTenSP());
			models.add(spDTO);
		}
		return models;
	}

}
