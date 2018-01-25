package fr.alexisvachard.my.personnal.web.site.model.homepage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ProfessionalExperience")
public class ProfessionalExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(columnDefinition = "varchar(32)")
    private String jobTitle;

    @NotNull
    @Column(columnDefinition = "text")
    private String jobDescription;

    @NotNull
    @Column(columnDefinition = "varchar(64)")
    private String company;

    @NotNull
    @Column(columnDefinition = "varchar(64)")
    private String companyLogo;

    @NotNull
    @Column(columnDefinition = "varchar(32)")
    private String missionPlace;

    @NotNull
    @Column(columnDefinition = "char(10)")
    private String startDate;

    @Column(columnDefinition = "char(10)")
    private String endDate;

    public ProfessionalExperience() {
    }

    public ProfessionalExperience(String jobTitle, String jobDescription, String company, String companyLogo, String missionPlace, String startDate, String endDate) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.company = company;
        this.companyLogo = companyLogo;
        this.missionPlace = missionPlace;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getMissionPlace() {
        return missionPlace;
    }

    public void setMissionPlace(String missionPlace) {
        this.missionPlace = missionPlace;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
