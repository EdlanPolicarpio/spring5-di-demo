package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class BoringGreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hi";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
