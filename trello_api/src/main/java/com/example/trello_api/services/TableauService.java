package com.example.trello_api.services;
import com.example.trello_api.entities.Tableau;
import com.example.trello_api.exceptions.RessourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trello_api.repo.TableauRepo;

import java.util.List;

@Service
public class TableauService {

    @Autowired
    private TableauRepo tableauRepository;

    public Tableau enregistrerTableau(Tableau tableau) {
        return tableauRepository.save(tableau);
    }

    public Tableau trouverTableauParId(Long id) {
       return tableauRepository.findById(id).orElseThrow(()->new RessourceNotFound("Tableau id= %s not found".formatted(id)));

    }

    public List<Tableau> obtenirTousLesTableaux() {
        return tableauRepository.findAll();
    }

    public Tableau mettreAJourTableau(Tableau tableau) {
        return tableauRepository.save(tableau);
    }

    public void supprimerTableauParId(Long id) {
        tableauRepository.deleteById(id);
    }
}

