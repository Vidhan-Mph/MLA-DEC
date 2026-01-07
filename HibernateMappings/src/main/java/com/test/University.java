
package com.test;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "uni_name", nullable = false, length = 150)
    private String uniName;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "established_year")
    private Integer establishedYear;

    // Bidirectional OneToMany; FK lives in college.university_id
    @OneToMany(
        mappedBy = "university",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<College> colleges = new ArrayList<>();

    // convenience methods to keep both sides in sync
    public void addCollege(College college) {
        colleges.add(college);
        college.setUniversity(this);
    }

    public void removeCollege(College college) {
        colleges.remove(college);
        college.setUniversity(null);
    }

    // getters/setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUniName() { return uniName; }
    public void setUniName(String uniName) { this.uniName = uniName; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public Integer getEstablishedYear() { return establishedYear; }
    public void setEstablishedYear(Integer establishedYear) { this.establishedYear = establishedYear; }

    public List<College> getColleges() { return colleges; }
    public void setColleges(List<College> colleges) {
        this.colleges.clear();
        if (colleges != null) {
            for (College c : colleges) addCollege(c);
        }
    }
}
