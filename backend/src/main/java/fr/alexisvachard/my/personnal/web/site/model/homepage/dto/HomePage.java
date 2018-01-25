package fr.alexisvachard.my.personnal.web.site.model.homepage.dto;

import fr.alexisvachard.my.personnal.web.site.model.homepage.Diploma;
import fr.alexisvachard.my.personnal.web.site.model.homepage.ProfessionalExperience;
import fr.alexisvachard.my.personnal.web.site.model.homepage.Skill;

import java.util.List;

public class HomePage {

    private List<Skill> skills;

    private List<Diploma> diplomas;

    private List<ProfessionalExperience> professionalExperiences;

    public HomePage(List<Skill> skills, List<Diploma> diplomas, List<ProfessionalExperience> professionalExperiences) {
        this.skills = skills;
        this.diplomas = diplomas;
        this.professionalExperiences = professionalExperiences;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Diploma> getDiplomas() {
        return diplomas;
    }

    public void setDiplomas(List<Diploma> diplomas) {
        this.diplomas = diplomas;
    }

    public List<ProfessionalExperience> getProfessionalExperiences() {
        return professionalExperiences;
    }

    public void setProfessionalExperiences(List<ProfessionalExperience> professionalExperiences) {
        this.professionalExperiences = professionalExperiences;
    }
}
