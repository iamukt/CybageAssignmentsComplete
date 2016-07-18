package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormMessageController
{
	@RequestMapping(value="/LoadForm", method = RequestMethod.GET)
	public ModelAndView loadForm()
	{
		ModelAndView mav = new ModelAndView("submitform");
		return mav;
	}
	@RequestMapping(value="/showformdetails",method = RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("name") String name,@RequestParam("country") String country)
	{
		ModelAndView mav = new ModelAndView("submitdetails");
		mav.addObject("msg","Name: "+name+"Country: "+country);
		return mav;
	}
}
