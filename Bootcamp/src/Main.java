import br.com.desafio.bootcamp.dominio.Bootcamp;
import br.com.desafio.bootcamp.dominio.Course;
import br.com.desafio.bootcamp.dominio.Student;
import br.com.desafio.bootcamp.dominio.Mentor;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        Course course1 = new Course();
        course1.setTitle("course java");
        course1.setDescription("descrição course java");
        course1.setTotalHours(8);

        Course course2 = new Course();
        course2.setTitle("course js");
        course2.setDescription("descrição course js");
        course2.setTotalHours(4);

        Mentor mentoria = new Mentor();
        mentoria.setTitle("mentoria de java");
        mentoria.setDescription("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Studenteloper");
        bootcamp.setDescription("Descrição Bootcamp Java Studenteloper");
        bootcamp.getStudyPrograms().add(course1);
        bootcamp.getStudyPrograms().add(course2);
        bootcamp.getStudyPrograms().add(mentoria);

        Student devCamila = new Student();
        devCamila.setName("Camila");
        devCamila.enroll(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getEnrolled());
        devCamila.nextStep();
        devCamila.nextStep();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getEnrolled());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConcluded());
        System.out.println("XP:" + devCamila.calculateTotalXP());

        System.out.println("-------");

        Student devJoao = new Student();
        devJoao.setName("Joao");
        devJoao.enroll(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getEnrolled());
        devJoao.nextStep();
        devJoao.nextStep();
        devJoao.nextStep();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getEnrolled());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConcluded());
        System.out.println("XP:" + devJoao.calculateTotalXP());
    }

}
