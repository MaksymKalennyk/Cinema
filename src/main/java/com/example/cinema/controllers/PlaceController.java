package com.example.cinema.controllers;

import com.example.cinema.models.Place;
import com.example.cinema.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place")
@CrossOrigin
public class PlaceController {

    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/find/all")
    public List<Place> findAll(){
        return placeService.findAll();
    }

    @GetMapping("/find/{id}")
    public Place findById(@PathVariable("id") Long id){
        return placeService.findById(id);
    }

    @PostMapping("/add")
    public Place save(Place place){
        return placeService.savePlace(place);
    }

    @PostMapping ("/update")
    public Place update(Place place){
        return placeService.savePlace(place);
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        placeService.deleteById(id);
    }
}
