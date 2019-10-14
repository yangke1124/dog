package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Goods;
import com.example.demo.service.GoodsServiceDao;

@Controller
public class GoodsController {
	@Resource
	private GoodsServiceDao serviceDao;

	@RequestMapping("list.do")
	public String list(Model model) {
		List<Goods> goodlist = serviceDao.getGoodsList();
		model.addAttribute("goodlist", goodlist);
		return "list";
	}
}
