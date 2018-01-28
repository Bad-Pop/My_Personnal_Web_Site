package fr.alexisvachard.my.personnal.web.site.repository;

import fr.alexisvachard.my.personnal.web.site.model.homepage.Skill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkillRepository extends CrudRepository<Skill, String> {

//    @Override
    List<Skill> findAllByOrderByImportanceAsc();

    Skill deleteBySkillName(String skillName);
}
