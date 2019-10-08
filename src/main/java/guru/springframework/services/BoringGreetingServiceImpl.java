package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class BoringGreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hi";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
