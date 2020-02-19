package com.cts.project.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.bean.IPODetailEntry;
import com.cts.project.dao.IPODetailEntryDAO;

@Controller
public class IPOController {

	@Autowired
	IPODetailEntryDAO ipoEntryDAO;

	@GetMapping("/ipo-home")
	public String IPOPage(Model model) {
		List<IPODetailEntry> ipoDetails = ipoEntryDAO.getAllIPODetails();
		model.addAttribute("ipo", ipoDetails);
		model.addAttribute("ipoDetails", new IPODetailEntry());
		return "ipos";
	}

	@PostMapping("/ipo/save")
	public String addIPO(@ModelAttribute("ipoDetails") IPODetailEntry ipoDetailEntry) {
		ipoEntryDAO.saveOrUpdateIPODeatail(ipoDetailEntry);
		return "redirect:/ipo-home";
	}

	@GetMapping("/remove-ipo/{id}")
	public String removeIPO(@PathVariable("id") int id) {
		IPODetailEntry ipo = ipoEntryDAO.getIPODetailById(id);
		ipoEntryDAO.deleteIPODetail(ipo);
		return "redirect:/ipo-home";
	}

	@GetMapping("/update-ipo/{id}")
	public String updateIPO(@PathVariable("id") int id, Model model) {
		IPODetailEntry ipoDetail = ipoEntryDAO.getIPODetailById(id);
		model.addAttribute("ipoDetails", ipoDetail);
		List<IPODetailEntry> ipoDetails = ipoEntryDAO.getAllIPODetails();
		model.addAttribute("ipo", ipoDetails);
		return "ipos";
	}

}
