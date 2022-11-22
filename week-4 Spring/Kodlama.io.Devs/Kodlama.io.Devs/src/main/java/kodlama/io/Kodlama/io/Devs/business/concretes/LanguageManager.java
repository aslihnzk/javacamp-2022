package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	
	private LanguageRepository languageRepository;
	
	@Autowired

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;

	}


	@Override
	public List<Language> getAll() {
	
		return languageRepository.getAll();
	}
	

}
