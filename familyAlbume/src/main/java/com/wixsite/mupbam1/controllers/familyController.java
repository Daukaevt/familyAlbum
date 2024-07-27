package com.wixsite.mupbam1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wixsite.mupbam1.dao.FamilyDao;

@Controller
@RequestMapping("/family")
public class familyController {
	FamilyDao familyDao;
	@Autowired
	public familyController(FamilyDao familyDao) {
		super();
		this.familyDao = familyDao;
	}

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("family", familyDao.getIndex());
		return "/family/index";
	}

}
