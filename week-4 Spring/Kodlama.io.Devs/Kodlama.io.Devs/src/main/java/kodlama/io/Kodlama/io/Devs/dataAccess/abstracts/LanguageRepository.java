package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


public interface LanguageRepository {
	public void add(Language language);
	public void delete(int id);
	public void update(int id,String name);
	Language getById(int id);
	List<Language> 	getAll();
	

}
