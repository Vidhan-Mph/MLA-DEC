
package com.test;

import jakarta.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL AUTO_INCREMENT
    private int id;

    @Column(name = "project_name", nullable = false, unique = true, length = 150)
    private String name;

    public Project() {}

    public Project(String name) {
        this.name = name;
    }

    // getters/setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + "]";
    }
}
