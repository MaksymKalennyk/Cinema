package com.example.cinema.controllers;

import com.example.cinema.models.Session;
import com.example.cinema.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {

    private final SessionService sessionService;

    @Autowired
    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping("/find/all")
    public List<Session> findAll(){
        return sessionService.findAll();
    }

    @GetMapping("/find/{id}")
    public Session findById(@PathVariable("id") Long id){
        return sessionService.findById(id);
    }

    @PostMapping("/add")
    public Session save(Session session){
        return sessionService.saveSession(session);
    }

    @PostMapping ("/update")
    public Session update(Session session){
        return sessionService.saveSession(session);
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        sessionService.deleteById(id);
    }
}
