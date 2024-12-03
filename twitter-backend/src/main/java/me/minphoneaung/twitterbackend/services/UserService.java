package me.minphoneaung.twitterbackend.services;

import lombok.RequiredArgsConstructor;
import me.minphoneaung.twitterbackend.models.Role;
import me.minphoneaung.twitterbackend.models.User;
import me.minphoneaung.twitterbackend.repositories.RoleRepository;
import me.minphoneaung.twitterbackend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Min Phone Aung
 */

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public User registerUser(User user) {
        Set<Role> roles = user.getRoles();
        roles.add(roleRepository.findRoleByAuthority("USER").get());
        user.setRoles(roles);

        return userRepository.save(user);
    }
}
