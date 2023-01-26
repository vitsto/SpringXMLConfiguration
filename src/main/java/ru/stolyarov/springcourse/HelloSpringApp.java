package ru.stolyarov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //загрузка конфигурационного файла спринга
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //получение бина из спринг-контейнера
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // вызов методов на бине
        System.out.println(theCoach.getDailyWorkout());

        //вызовем метод для пожеланий
        System.out.println(theCoach.getDailyFortune());

        //закрыть контекст
        context.close();
    }
}
