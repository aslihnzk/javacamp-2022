import java.util.List;

public interface LanguageService {
List<Language> getAll();
    public void add(Language language) throws Exception;
    public void delete(int id) throws Exception;
    public void update(Language language,int id) throws Exception;
    Language getById(int id) throws Exception;
}
