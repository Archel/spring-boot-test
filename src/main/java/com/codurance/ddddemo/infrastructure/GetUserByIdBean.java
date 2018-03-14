package com.codurance.ddddemo.infrastructure;

import com.codurance.ddddemo.application.user.GetUserById;
import com.codurance.ddddemo.infrastructure.user.InMemoryUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetUserByIdBean {
    @Bean
    public static GetUserById getUserById() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();
        return new GetUserById(inMemoryUserRepository);
    }
}
