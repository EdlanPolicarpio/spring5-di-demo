package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class CursedGreetingServiceImpl implements GreetingService{

    public static final String HELLO_GWEEB = "Hello Gweeb";

    @Override
    public String sayGreeting() {
        return HELLO_GWEEB;
    }
}
