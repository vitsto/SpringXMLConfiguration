package ru.stolyarov.springcourse;

import java.util.Random;

public class CookieFortuneService implements FortuneService {
    private String[] fortunes = {"If you have something good in your life, don't let it go!",
            "You already know the answer to the questions lingering inside your head.",
            "Nothing astonishes men so much as common sense and plain dealing."
    };

    private final Random random = new Random();

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(0, fortunes.length)];
    }
}
