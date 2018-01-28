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

    @NotNull
    private int importance;

    public Skill() {
    }

    public Skill(String skillName, int masteryLevel, int importance) {
        this.skillName = skillName;
        this.masteryLevel = masteryLevel;
        this.importance = importance;
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

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
}
