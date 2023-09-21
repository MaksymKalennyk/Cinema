package com.example.cinema.controllers;

import com.example.cinema.models.SessionPlace;
import com.example.cinema.services.SessionPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/session/place")
@CrossOrigin
public class SessionPlaceController {

    private final SessionPlaceService sessionPlaceService;

    @Autowired
    public SessionPlaceController(SessionPlaceService sessionPlaceService) {
        this.sessionPlaceService = sessionPlaceService;
    }

    @GetMapping("/find/all")
    public List<SessionPlace> findAll(){
        return sessionPlaceService.findAll();
    }

    @GetMapping("/find/{id}")
    public SessionPlace findById(@PathVariable("id") Long id){
        return sessionPlaceService.findById(id);
    }

    @PostMapping("/add")
    public SessionPlace save(SessionPlace sessionPlace){
        return sessionPlaceService.saveSession(sessionPlace);
    }

    @PostMapping ("/update")
    public SessionPlace update(SessionPlace sessionPlace){
        return sessionPlaceService.saveSession(sessionPlace);
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        sessionPlaceService.deleteById(id);
    }
}
