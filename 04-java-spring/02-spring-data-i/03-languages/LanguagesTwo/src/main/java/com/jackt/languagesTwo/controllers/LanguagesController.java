package com.jackt.languagesTwo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jackt.languagesTwo.models.Language;
import com.jackt.languagesTwo.services.LanguageService;

@Controller
public class LanguagesController {
	private final LanguageService languageService;
	
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/languages";
	}
	
	@RequestMapping("/languages")
	public String allLanguages(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "/view/index.jsp";
	}
	
	@RequestMapping("/languages/new")
	public String newLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/view/index.jsp";
		}
		else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "/view/show.jsp";
	}
	
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "/view/edit.jsp";		
	}
	
	@RequestMapping(value="/languages/edit/process", method=RequestMethod.POST)
	public String editProcess(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/view/edit.jsp";
		} else {
			System.out.println(language.getId());
			languageService.updateLanguage(language.getId(), language.getName(), language.getCreator(), language.getVersion());
			return "redirect:/languages/" + language.getId();
		}
	}
	
	@RequestMapping("/languages/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}

}
