package com.urlShortner.in.Url_Shortner.controller;

import com.urlShortner.in.Url_Shortner.dtos.LoginRequest;
import com.urlShortner.in.Url_Shortner.dtos.RegisterRequest;
import com.urlShortner.in.Url_Shortner.modules.User;
import com.urlShortner.in.Url_Shortner.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginContext;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;

    // Spring will automatically inject your UserService
    public AuthController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/public/login")
    public ResponseEntity<?>  loginUser(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(userService.authenticationUser(loginRequest));
    }


    @PostMapping ("/public/register")
    public ResponseEntity<?> registerUser( @RequestBody RegisterRequest registerRequest){
        User user =new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setRole("ROLE_USER");
        userService.registerUser(user);
        return ResponseEntity.ok("User register successfully");


    }


}
