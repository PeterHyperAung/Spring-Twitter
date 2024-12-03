package me.minphoneaung.twitterbackend.controllers;

import lombok.RequiredArgsConstructor;
import me.minphoneaung.twitterbackend.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Min Phone Aung
 */


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserService userService;

}
