package com.jackt.languagesTwo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jackt.languagesTwo.models.Language;
import com.jackt.languagesTwo.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	
	public Language updateLanguage(Long id, String name, String creator, String version) {
		Language updateLanguage = this.findLanguage(id);
		updateLanguage.setName(name);
		updateLanguage.setCreator(creator);
		updateLanguage.setVersion(version);
		
		return languageRepository.save(updateLanguage);
	}
	
	public void deleteLanguage(Long id) {
		this.languageRepository.deleteById(id);
	}

}
