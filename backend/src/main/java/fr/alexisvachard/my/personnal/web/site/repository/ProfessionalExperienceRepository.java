package fr.alexisvachard.my.personnal.web.site.repository;

import fr.alexisvachard.my.personnal.web.site.model.homepage.ProfessionalExperience;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfessionalExperienceRepository extends CrudRepository<ProfessionalExperience, Integer> {

    @Override
    List<ProfessionalExperience> findAll();

    ProfessionalExperience deleteById(int id);

}
