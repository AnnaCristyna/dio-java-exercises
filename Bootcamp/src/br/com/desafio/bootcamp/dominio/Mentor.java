package br.com.desafio.bootcamp.dominio;

import java.time.LocalDate;
public class Mentor extends StudyProgram {

    private LocalDate date;

    @Override
    public double calculateXP()
    {
        return XP_DEFAULT + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
