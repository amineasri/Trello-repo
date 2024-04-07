package com.example.trello_api.repo;

import com.example.trello_api.entities.Carte;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarteRepo extends JpaRepository<Carte,Long> {
}
