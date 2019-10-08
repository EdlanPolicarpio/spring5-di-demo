package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class GermanGreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hallo";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
