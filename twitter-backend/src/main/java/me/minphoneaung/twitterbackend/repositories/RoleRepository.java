package me.minphoneaung.twitterbackend.repositories;

import me.minphoneaung.twitterbackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Min Phone Aung
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByAuthority(String authority);
}
