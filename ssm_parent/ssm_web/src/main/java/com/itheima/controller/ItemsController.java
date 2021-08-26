package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description: No Description
 * User: Eric
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("/findAll")
    public String findByAll(Model model){
		System.out.println("Hello wo刘邦项羽的爱情故事rld");
		System.out.println("九州风云录，海上牧云记");
		System.out.println("三国志不是三国演义");
        // model 数据模型
        List<Items> items = itemsService.findAll();
        // 塞给页面
        model.addAttribute("items",items);
        // modelAndView 数据与视图 基本不用
        return "items";
    }
}
