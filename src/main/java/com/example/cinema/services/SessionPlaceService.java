package com.example.cinema.services;

import com.example.cinema.models.SessionPlace;
import com.example.cinema.repo.SessionPlaceRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionPlaceService {

    private final SessionPlaceRepository sessionPlaceRepository;

    @Autowired
    public SessionPlaceService(SessionPlaceRepository sessionPlaceRepository) {
        this.sessionPlaceRepository = sessionPlaceRepository;
    }

    public List<SessionPlace> findAll(){
        return sessionPlaceRepository.findAll();
    }

    public SessionPlace findById(Long id){
        Optional<SessionPlace> sessionOptional = sessionPlaceRepository.findById(id);
        if (sessionOptional.isPresent()) {
            return sessionOptional.get();
        } else {
            throw new EntityNotFoundException("Data with this id  " + id + " not found");
        }
    }

    public SessionPlace saveSession(SessionPlace sessionPlace){
        return sessionPlaceRepository.save(sessionPlace);
    }

    public void deleteById(Long id){
        sessionPlaceRepository.deleteById(id);
    }
}
