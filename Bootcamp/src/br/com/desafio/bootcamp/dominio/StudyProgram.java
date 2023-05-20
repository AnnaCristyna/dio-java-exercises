package br.com.desafio.bootcamp.dominio;

public abstract class StudyProgram {
    protected static final double XP_DEFAULT = 10d;
    private String title;
    private String description;

    public abstract double calculateXP();

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

}

