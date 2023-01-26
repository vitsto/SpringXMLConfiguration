package ru.stolyarov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //загрузка конф. файла
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //получение бина из контейнера
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //вызов методов на бине
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());


        //закрыть контекст
        context.close();
    }
}
