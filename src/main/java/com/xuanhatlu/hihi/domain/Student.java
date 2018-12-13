package com.xuanhatlu.hihi.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Student.
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 45)
    @Column(name = "name_student", length = 45, nullable = false)
    private String nameStudent;

    @NotNull
    @Size(max = 45)
    @Column(name = "age_student", length = 45, nullable = false)
    private String ageStudent;

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Lop lop;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public Student nameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
        return this;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAgeStudent() {
        return ageStudent;
    }

    public Student ageStudent(String ageStudent) {
        this.ageStudent = ageStudent;
        return this;
    }

    public void setAgeStudent(String ageStudent) {
        this.ageStudent = ageStudent;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove




    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        if (student.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + getId() +
            ", nameStudent='" + getNameStudent() + "'" +
            ", ageStudent='" + getAgeStudent() + "'" +
            "}";
    }
}
