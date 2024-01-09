package com.aps.jwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aps.jwt.entity.User;
import com.aps.jwt.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "Anil", "pwd012", "aps@gmail.com"),
                new User(102, "Pratap", "pwd123", "pratap@gmail.com"),
                new User(103, "Singh", "pwd456", "singh@gmail.com"),
                new User(104, "Baghel", "pwd789", "baghel@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
