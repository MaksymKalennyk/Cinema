package com.example.cinema.repo;

import com.example.cinema.models.SessionPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionPlaceRepository extends JpaRepository<SessionPlace, Long> {

}
