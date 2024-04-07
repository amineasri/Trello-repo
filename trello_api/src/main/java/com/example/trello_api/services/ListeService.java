package com.example.trello_api.services;
import com.example.trello_api.entities.Liste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trello_api.repo.ListeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ListeService {

    @Autowired
    private ListeRepo listeRepository;

    public Liste enregistrerListe(Liste liste) {
        return listeRepository.save(liste);
    }

    public Liste trouverListeParId(Long id) {
        Optional<Liste> optionalListe = listeRepository.findById(id);
        return optionalListe.orElse(null);
    }

    public List<Liste> obtenirToutesLesListes() {
        return listeRepository.findAll();
    }

    public Liste mettreAJourListe(Liste liste) {
        return listeRepository.save(liste);
    }

    public void supprimerListeParId(Long id) {
        listeRepository.deleteById(id);
    }
}
