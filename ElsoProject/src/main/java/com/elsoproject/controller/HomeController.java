package com.elsoproject.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elsoproject.domain.Story;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String stories(Model model, Locale locale) {
		model.addAttribute("pageTitle", "Model hozta Title");
		model.addAttribute("stories", getStories());
		System.out.println(String.format("Request reecived. Language: %s, Country: %s %n", locale.getLanguage(), locale.getDisplayCountry()));
		return "stories";
	}
	
	private ArrayList<Story> getStories(){
		ArrayList<Story> stories = new ArrayList<>();
		
		Story story1 = new Story();
		story1.setTitle("Első sztorim");
		story1.setPosted(new Date());
		story1.setAuthor("Zoli");
		story1.setContent("<p>Na ez az adat már éles adat</p>");
		
		Story story2 = new Story();
		story2.setTitle("Második sztorim");
		story2.setPosted(new Date());
		story2.setAuthor("Gyula");
		story2.setContent("<p>Gyula története senkit nem érdekel</p>");

		stories.add(story1);
		stories.add(story2);
		
		return stories;
	
	}
	
	
}
