package br.com.desafio.bootcamp.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate endDate = initialDate.plusDays(45);
    private Set<Student> studentsEnrolled = new HashSet<>();
    private Set<StudyProgram> studyPrograms = new LinkedHashSet<>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getInitialDate() {
        return initialDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public Set<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }
    public void setStudentsEnrolled(Set<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
    public Set<StudyProgram> getStudyPrograms() {
        return studyPrograms;
    }

    public void setStudyPrograms(Set<StudyProgram> studyPrograms) {
        this.studyPrograms = studyPrograms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(studentsEnrolled, bootcamp.studentsEnrolled) && Objects.equals(studyPrograms, bootcamp.studyPrograms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, endDate, studentsEnrolled, studyPrograms);
    }
    
}
