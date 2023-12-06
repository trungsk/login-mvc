package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/login")
    public String login() {
        return "login";  // Name of the Thymeleaf template for the login page
    }

    @PostMapping("/perform_login")
    public String performLogin(@RequestParam String username, @RequestParam String password, Model model) {
        try {
            Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            SecurityContextHolder.getContext().setAuthentication(auth);
            return "redirect:/home";  // Redirect to home page on successful login
        } catch (AuthenticationException e) {
            model.addAttribute("errorMessage", "Invalid username or password");
            return "login";  // Stay on the login page and display an error message
        }
    }

    @GetMapping("/home")
    public String home() {
        return "home";  // Name of the Thymeleaf template for the home page
    }


}
