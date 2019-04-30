package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import web.mvc.entity.WebOrigin;
import web.mvc.service.OriginService;

@Controller
@RequestMapping("hello")
public class HelloWorld {

	@Autowired
	OriginService originService;

    @ModelAttribute("lists")
    public List<WebOrigin> messages() {
        return  originService.findAll();
    }

	/**
	 * テスト用ページ
	 * @return String
	 */
    @GetMapping("/list")
    public String hello(Model model) {
    	model.addAttribute("lists", originService.findAll());
        return "hello/list";
    }
}