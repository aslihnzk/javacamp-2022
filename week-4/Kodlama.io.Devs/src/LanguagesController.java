import java.util.List;

public class LanguagesController {
    private final LanguageService languageService

    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    public List<Language>getAll(){
        return languageService.getAll();

    }
}
