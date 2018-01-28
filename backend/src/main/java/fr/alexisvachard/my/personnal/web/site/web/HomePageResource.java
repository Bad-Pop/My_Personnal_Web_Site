package fr.alexisvachard.my.personnal.web.site.web;

import fr.alexisvachard.my.personnal.web.site.exception.HomePageException;
import fr.alexisvachard.my.personnal.web.site.model.homepage.Diploma;
import fr.alexisvachard.my.personnal.web.site.model.homepage.ProfessionalExperience;
import fr.alexisvachard.my.personnal.web.site.model.homepage.Skill;
import fr.alexisvachard.my.personnal.web.site.model.homepage.dto.HomePage;
import fr.alexisvachard.my.personnal.web.site.service.DiplomaService;
import fr.alexisvachard.my.personnal.web.site.service.ProfessionalExperienceService;
import fr.alexisvachard.my.personnal.web.site.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path = "/api/homepage")
public class HomePageResource {

    private DiplomaService diplomaService;

    private ProfessionalExperienceService professionalExperienceService;

    private SkillService skillService;


    @Autowired
    public HomePageResource(DiplomaService diplomaService, ProfessionalExperienceService professionalExperienceService, SkillService skillService) {
        this.diplomaService = diplomaService;
        this.professionalExperienceService = professionalExperienceService;
        this.skillService = skillService;
    }

    @GetMapping
    public ResponseEntity<HomePage> getHomePage() throws HomePageException, InterruptedException {

        List<Skill> skills = skillService.findAll();
        List<Diploma> diplomas = diplomaService.findAll();
        List<ProfessionalExperience> professionalExperiences = professionalExperienceService.findAll();

        if (skills.isEmpty() && diplomas.isEmpty() && professionalExperiences.isEmpty()) {
            throw new HomePageException("an error occurred while loading the home page. Please try again later");
        }

        return new ResponseEntity<>(new HomePage(skills, diplomas, professionalExperiences), HttpStatus.OK);
    }
}
