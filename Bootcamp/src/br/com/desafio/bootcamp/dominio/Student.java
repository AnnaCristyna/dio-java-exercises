package br.com.desafio.bootcamp.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Student {
    private String name;
    private String id;
    private Set<StudyProgram> concluded = new LinkedHashSet<>();
    private Set<StudyProgram> enrolled = new LinkedHashSet<>();

    public void enroll(Bootcamp bootcamp) {
        this.concluded.addAll(bootcamp.getStudyPrograms());
        bootcamp.getStudentsEnrolled().add(this);
    }

    public void nextStep(){
        Optional<StudyProgram> studyProgram = this.enrolled.stream().findFirst();

        if (studyProgram.isPresent()) {
            this.concluded.add(studyProgram.get());
            this.enrolled.remove(studyProgram.get());
        } else {
            System.err.println("You are not enrolled in any study program");
        }
    }

    public double calculateTotalXP() {
        return this.concluded.stream().mapToDouble(StudyProgram::calculateXP).sum();

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Set<StudyProgram> getConcluded() {
        return concluded;
    }
    public void setConcluded(Set<StudyProgram> concluded) {
        this.concluded = concluded;
    }
    public Set<StudyProgram> getEnrolled() {
        return enrolled;
    }
    public void setEnrolled(Set<StudyProgram> enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(id, student.id) && Objects.equals(concluded, student.concluded) && Objects.equals(enrolled, student.enrolled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, concluded, enrolled);
    }
}
