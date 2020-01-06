package net.slipp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.slipp.domain.QuestionRepository;

@Controller
public class HomeController {

	@Autowired
	private QuestionRepository questionrespository;
	
	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("questions", questionrespository.findAll());
		
		return "/index";
	}
}
