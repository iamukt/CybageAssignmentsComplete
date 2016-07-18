package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController
{
	@RequestMapping("/msg1")
	public ModelAndView helloworldOne()
	{
		ModelAndView mav = new ModelAndView("showmessage1");
		mav.addObject("msg","Welcome to the World of Spring part1");
		return mav;
	}
	@RequestMapping("/msg2")
	public ModelAndView helloworldTwo()
	{
		ModelAndView mav = new ModelAndView("showmessage1");
		mav.addObject("msg","Welcome to the World Spring part2");
		return mav;
	}
}
