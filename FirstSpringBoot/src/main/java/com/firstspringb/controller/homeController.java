package com.firstspringb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.firstspringb.doa.PsychoRepository;
import com.firstspringb.model.Psycho;

@Controller
public class homeController {
	@Autowired
	PsychoRepository rep;
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
//	@RequestMapping("/addpsycho")
//	public ModelAndView addPsycho(Psycho psycho)
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("index.jsp");
//		rep.save(psycho);
//		Psycho p = rep.findById(psycho.getPid()).orElse(new Psycho());
//		mv.addObject("psycho",p);
//		return mv;
//	}
//	@RequestMapping("/deletepsycho")
//	public ModelAndView deletePsycho(@RequestParam int pid)
//	{
//		ModelAndView mv=new ModelAndView("index.jsp");
//		mv.addObject("psycho",rep.findAll());
//		return mv;
//	}
	@RequestMapping(path = "/psychos",produces = {"application/xml"})
	@ResponseBody
	public List<Psycho> psychos()
	{
		
		return rep.findAll();
		
	}
	@RequestMapping(path="/psycho/{pid}", produces = {"application/json"})
	@ResponseBody
	public Optional<Psycho> psychos(@PathVariable("pid")int pid)
	{
		
		return rep.findById(pid);
		
	}
	
	

}
