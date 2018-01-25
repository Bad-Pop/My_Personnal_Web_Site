package fr.alexisvachard.my.personnal.web.site.service;

import fr.alexisvachard.my.personnal.web.site.model.homepage.ProfessionalExperience;
import fr.alexisvachard.my.personnal.web.site.repository.ProfessionalExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalExperienceService {

    private ProfessionalExperienceRepository professionalExperienceRepository;

    @Autowired
    public ProfessionalExperienceService(ProfessionalExperienceRepository professionalExperienceRepository) {
        this.professionalExperienceRepository = professionalExperienceRepository;
    }

    public List<ProfessionalExperience> findAll() {
        return professionalExperienceRepository.findAll();
    }
}
