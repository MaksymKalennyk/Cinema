package com.example.cinema.services;

import com.example.cinema.models.Session;
import com.example.cinema.repo.SessionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {

    private final SessionRepository sessionRepository;

    @Autowired
    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public List<Session> findAll(){
        return sessionRepository.findAll();
    }

    public Session findById(Long id){
        Optional<Session> sessionOptional = sessionRepository.findById(id);
        if (sessionOptional.isPresent()) {
            return sessionOptional.get();
        } else {
            throw new EntityNotFoundException("Data with this id  " + id + " not found");
        }
    }

    public Session saveSession(Session session){
        return sessionRepository.save(session);
    }

    public void deleteById(Long id){
        sessionRepository.deleteById(id);
    }
}
