package fr.alexisvachard.my.personnal.web.site.model.homepage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Skill")
public class Skill {

    @Id
    @Column(columnDefinition = "varchar(64)")
    private String skillName;

    @NotNull
    private int masteryLevel;

    public Skill() {
    }

    public Skill(String skillName, int masteryLevel) {
        this.skillName = skillName;
        this.masteryLevel = masteryLevel;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getMasteryLevel() {
        return masteryLevel;
    }

    public void setMasteryLevel(int masteryLevel) {
        this.masteryLevel = masteryLevel;
    }
}
