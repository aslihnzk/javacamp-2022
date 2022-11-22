package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Repository

public class InMemoryLanguageRepository implements LanguageRepository{
	
	List<Language>language;
	

	public InMemoryLanguageRepository() {
	language =new ArrayList<Language>();
	LanguageRepository languages = null;
	languages.add(new Language(1, "Java"));
	languages.add(new Language(2, "C#"));
	languages.add(new Language(3, "Phyton"));
	}


	@Override
	public List<Language> getAll() {
		
		return languages;
	}


	@Override
	public void add(Language language) {
	
		
	}


	@Override
	public void delete(int id) {

		
	}


	@Override
	public void update(int id, String name) {

		
	}


	@Override
	public Language getById(int id) {
		
		return null;
	}

	


}
