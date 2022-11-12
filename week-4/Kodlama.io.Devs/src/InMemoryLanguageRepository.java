import java.util.ArrayList;
import java.util.List;

public class InMemoryLanguageRepository implements LanguageRepository{
    List<Language> languages;
    public InMemoryLanguageRepository(){
        languages=new ArrayList<>(<Language)();
        languages.add(new Language(1,"C#"));
        languages.add(new Language(1,"java"));
        languages.add(new Language(1,"Python"));
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

    @Override
    public List<Language> getAll() {
        return null;
    }
}

