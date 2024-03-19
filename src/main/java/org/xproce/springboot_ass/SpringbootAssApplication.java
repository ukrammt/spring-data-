package org.xproce.springboot_ass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.springboot_ass.dao.entities.*;
import org.xproce.springboot_ass.dao.repositiries.*;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringbootAssApplication implements CommandLineRunner {

    @Autowired
    private Personnerepository personnerepository;
    @Autowired
    private Courserepository courserepository;
    @Autowired
    private Sessionrepository sessionrepository;



    public static void main(String[] args) {
        SpringApplication.run(SpringbootAssApplication.class, args);
    }

    public void run(String[] args) throws Exception {
        System.out.println("test");
        Session session=new Session();
        session.setDate(new Date());
        session.setH_debut(new Date());
        session.setH_fin(new Date());
        sessionrepository.save(session);
        //Read
        List<Session> sessionList=sessionrepository.findAll();
        sessionList.forEach(ListFrom-> {System.out.println(ListFrom.toString());});

        //Create
        Course course=new Course();
        course.setTitle("jee");
        course.setDescription("Good");
        courserepository.save(course);
        //Read
        List<Course>courseList=courserepository.findAll();
        courseList.forEach(ListFromCour->{
            System.out.println(ListFromCour.toString());
        });


        //Create
        Student student=new Student();
        student.setMatricule("C1553585");
        student.setName("ikram");
        student.setBirtheDay(new Date());
        personnerepository.save(student);




        Teacher teacher=new Teacher();
        teacher.setD_affectation(new Date());
        teacher.setName("prof");
        teacher.setBirtheDay(new Date());
        personnerepository.save(teacher);





    }

}
