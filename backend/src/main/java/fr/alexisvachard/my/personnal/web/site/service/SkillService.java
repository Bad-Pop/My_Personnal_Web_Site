package fr.alexisvachard.my.personnal.web.site.service;

import fr.alexisvachard.my.personnal.web.site.model.homepage.Skill;
import fr.alexisvachard.my.personnal.web.site.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> findAll() {
        return skillRepository.findAll();
    }
}
