package com.clc.java.mvc.controller;

import com.clc.java.mvc.bean.*;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.clc.java.mvc.service.impl.RegistationServiceImpl;

@Controller("controller")
public class RegistationController {
	@Autowired
	public RegistationServiceImpl regisService;

	static {
		System.out.println("RegistationController loaded");
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("studentbean") StudentBean bean) {
		System.out.println("saveProduct invoked..." + bean);
		if (bean.getStudentId() > 0) {
			regisService.updateStudent(bean);
		} else
			regisService.addStudent(bean);
		return new ModelAndView("redirect:/add");
	}

	@RequestMapping("edit/{studId}")
	public ModelAndView editStudent(@PathVariable("studId") int studId) {
		System.out.println("editProduct invoked");
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("studentbean", regisService.getStudent(studId));

		// service.updateStudent(service.getStudentt(studId));
		model.put("students", regisService.allStudent()); // empty bean
		return new ModelAndView("addStudent", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView navigateToAddStudentPage() {
		System.out.println("navigateToAddStudentPage invoked");
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("studentbean", new StudentBean()); // empty bean
		model.put("students", regisService.allStudent()); // empty bean
		return new ModelAndView("addStudent", model);
	}

	@RequestMapping("delete/{studId}")
	public ModelAndView deleteStudent(@PathVariable("studId") int studId) {
		System.out.println("delete product invoked");
		regisService.deleteStudent(studId);
		return new ModelAndView("redirect:/add");
	}

}
