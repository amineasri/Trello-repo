package com.example.trello_api.repo;

import com.example.trello_api.entities.Liste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListeRepo extends JpaRepository<Liste,Long> {
}
