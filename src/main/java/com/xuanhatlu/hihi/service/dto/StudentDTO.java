package com.xuanhatlu.hihi.service.dto;


import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Student entity.
 */
public class StudentDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 45)
    private String nameStudent;

    @NotNull
    @Size(max = 45)
    private String ageStudent;

    private Long lopId;

    private Integer lopName;

    public Long getLopId() {
        return lopId;
    }

    public void setLopId(Long lopId) {
        this.lopId = lopId;
    }

    public Integer getLopName() {
        return lopName;
    }

    public void setLopName(Integer lopName) {
        this.lopName = lopName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(String ageStudent) {
        this.ageStudent = ageStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StudentDTO studentDTO = (StudentDTO) o;
        if(studentDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), studentDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
            "id=" + getId() +
            ", nameStudent='" + getNameStudent() + "'" +
            ", ageStudent='" + getAgeStudent() + "'" +
            "}";
    }
}
