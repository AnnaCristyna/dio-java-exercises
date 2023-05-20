package br.com.desafio.bootcamp.dominio;

public class Course extends StudyProgram {
    private int totalHours;

    @Override
    public double calculateXP()
    {
        return XP_DEFAULT * totalHours;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public String toString() {
        return "Course [totalHours=" + totalHours + " , Title = " + getTitle() + ", description =" +  getDescription() + "]";
    }   

    

}
