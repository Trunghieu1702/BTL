package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<>();
		menus.add("Hoang");
		menus.add("Trung");
		menus.add("Hieu");
		return menus;
	}

}
