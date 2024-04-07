package com.example.trello_api.repo;

import com.example.trello_api.entities.Tableau;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableauRepo extends JpaRepository<Tableau,Long> {
}
