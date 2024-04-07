package com.example.trello_api.web;

import com.example.trello_api.entities.Carte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.trello_api.services.CarteService;

import java.util.List;

@RestController
@RequestMapping("/cartes")
public class CarteController {

    @Autowired
    private CarteService carteService;

    @PostMapping
    public Carte creerCarte(@RequestBody Carte carte) {
        return carteService.enregistrerCarte(carte);
    }

    @GetMapping("/{id}")
    public Carte obtenirCarteParId(@PathVariable Long id) {
        return carteService.trouverCarteParId(id);
    }

    @GetMapping
    public List<Carte> obtenirToutesLesCartes() {
        return carteService.obtenirToutesLesCartes();
    }

    @PutMapping("/{id}")
    public Carte mettreAJourCarte(@PathVariable Long id, @RequestBody Carte carte) {
        carte.setId(id);
        return carteService.mettreAJourCarte(carte);
    }

    @DeleteMapping("/{id}")
    public void supprimerCarte(@PathVariable Long id) {
        carteService.supprimerCarteParId(id);
    }
}
