package ru.stolyarov.springcourse;

public class BaseballCoach implements Coach{
    //опредеить приватное поле для зависимости
    private final FortuneService fortuneService;

    //определить конструктор для внедрения зависимости
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //используем fortuneService чтобы получить пожелание
        return fortuneService.getFortune();
    }
}
