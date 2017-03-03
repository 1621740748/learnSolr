package com.lidan.learn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lidan.learn.service.RichTextService;

/**
 * @author lidanmax
 * 2017/03/03
 * */
@Controller
@RequestMapping("/richText")
public class RichTextController {
	
	@Resource
	private RichTextService richTextService;  // 注入Service对象
	
	/**
	 * 用户在输入框输入输入查询关键字，在这里自动匹配常用的fieldName，并给予权重
	 * 
	 * */
	@RequestMapping(value="/toSearch", method=RequestMethod.GET)
	public String queryRichTextDocument(String searchInput, Model model){
		
		return null;
	}
	
}
