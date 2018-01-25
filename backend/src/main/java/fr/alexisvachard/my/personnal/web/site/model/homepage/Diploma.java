package fr.alexisvachard.my.personnal.web.site.model.homepage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Diploma")
public class Diploma {

    @Id
    @Column(columnDefinition = "varchar(128)")
    private String diplomaName;

    @Column(columnDefinition = "varchar(64)")
    private String option;

    @NotNull
    @Column(columnDefinition = "varchar(64)")
    private String diplomaLevel;

    @NotNull
    @Column(columnDefinition = "char(4)")
    private String yearOfGraduation;

    public Diploma() {
    }

    public Diploma(String diplomaName, String option, String diplomaLevel, String yearOfGraduation) {
        this.diplomaName = diplomaName;
        this.option = option;
        this.diplomaLevel = diplomaLevel;
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getDiplomaName() {
        return diplomaName;
    }

    public void setDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getDiplomaLevel() {
        return diplomaLevel;
    }

    public void setDiplomaLevel(String diplomaLevel) {
        this.diplomaLevel = diplomaLevel;
    }

    public String getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(String yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}
