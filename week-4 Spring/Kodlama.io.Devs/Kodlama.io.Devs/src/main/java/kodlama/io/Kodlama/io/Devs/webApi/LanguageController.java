package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")

public class LanguageController{
	
private LanguageService languageService ;

@Autowired
public LanguageController(LanguageService languageService) {
	this.languageService =languageService;
}

@GetMapping("/getall")
public List<Language>getAll(){
	return languageService.getAll();
}
@PostMapping("/add")
public void add(@RequestBody Language language)throws Exception{
	languageService.add(language);
}
@PutMapping("/update")
public void update(@RequestBody Language language) throws Exception {
	languageService.update(language, 0);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable(name = "id") int id) throws Exception {
	languageService.delete(id);
}

@DeleteMapping("/delete/{id}")
public void delete1(@PathVariable(name = "id") int id) throws Exception {
	languageService.delete(id);
}
}





