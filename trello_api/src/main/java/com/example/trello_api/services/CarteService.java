package com.example.trello_api.services;
import com.example.trello_api.entities.Carte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trello_api.repo.CarteRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CarteService {

    @Autowired
    private CarteRepo carteRepository;

    public Carte enregistrerCarte(Carte carte) {
        return carteRepository.save(carte);
    }

    public Carte trouverCarteParId(Long id) {
        Optional<Carte> optionalCarte = carteRepository.findById(id);
        return optionalCarte.orElse(null);
    }

    public List<Carte> obtenirToutesLesCartes() {
        return carteRepository.findAll();
    }

    public Carte mettreAJourCarte(Carte carte) {
        return carteRepository.save(carte);
    }

    public void supprimerCarteParId(Long id) {
        carteRepository.deleteById(id);
    }
}
