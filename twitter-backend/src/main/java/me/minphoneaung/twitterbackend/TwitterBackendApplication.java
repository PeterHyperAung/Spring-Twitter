package me.minphoneaung.twitterbackend;

import me.minphoneaung.twitterbackend.models.Role;
import me.minphoneaung.twitterbackend.models.User;
import me.minphoneaung.twitterbackend.repositories.RoleRepository;
import me.minphoneaung.twitterbackend.repositories.UserRepository;
import me.minphoneaung.twitterbackend.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;

@SpringBootApplication
public class TwitterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwitterBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner run(RoleRepository roleRepository, UserService userService) {
        return args -> {
            roleRepository.save(new Role(1, "USER"));

            User u = new User();
            u.setFirstName("Peter");
            u.setLastName("Aung");
            userService.registerUser(u);
        };
    }
}
