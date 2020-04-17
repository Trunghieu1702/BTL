package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.SanphamDTO;
import com.laptrinhjavaweb.service.ISanphamService;

@Controller(value = "sanphamControllerOfAdmin")
public class Sanphamcontroller {

	@Autowired
	private ISanphamService sanphamservice;
	
	@RequestMapping(value = "/quan-tri/san-pham/danh-sach", method = RequestMethod.GET)
	public ModelAndView showList() {
		SanphamDTO model = new SanphamDTO();

		ModelAndView mav = new ModelAndView("admin/sanpham/listNew");
		model.setListResult(sanphamservice.findAll());
		mav.addObject("model", model);
		return mav;
	}
}
