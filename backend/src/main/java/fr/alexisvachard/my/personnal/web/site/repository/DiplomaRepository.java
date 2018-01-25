package fr.alexisvachard.my.personnal.web.site.repository;

import fr.alexisvachard.my.personnal.web.site.model.homepage.Diploma;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiplomaRepository extends CrudRepository<Diploma, String> {

    @Override
    List<Diploma> findAll();

    Diploma deleteByDiplomaName(String diplomaName);
}
