package com.example.cinema.services;

import com.example.cinema.models.Place;
import com.example.cinema.repo.PlaceRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;

    @Autowired
    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public List<Place> findAll(){
        return placeRepository.findAll();
    }

    public Place findById(Long id){
        Optional<Place> placeOptional = placeRepository.findById(id);
        if (placeOptional.isPresent()) {
            return placeOptional.get();
        } else {
            throw new EntityNotFoundException("Data with this id  " + id + " not found");
        }
    }

    public Place savePlace(Place place){
        return placeRepository.save(place);
    }

    public void deleteById(Long id){
        placeRepository.deleteById(id);
    }
}
