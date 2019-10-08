package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class BlessedGreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hello Friend";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
