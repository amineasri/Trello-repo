package com.example.trello_api.web;

import com.example.trello_api.entities.Liste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.trello_api.services.ListeService;

import java.util.List;

@RestController
@RequestMapping("/listes")
public class ListeController {

    @Autowired
    private ListeService listeService;

    @PostMapping
    public Liste creerListe(@RequestBody Liste liste) {
        return listeService.enregistrerListe(liste);
    }

    @GetMapping("/{id}")
    public Liste obtenirListeParId(@PathVariable Long id) {
        return listeService.trouverListeParId(id);
    }

    @GetMapping
    public List<Liste> obtenirToutesLesListes() {
        return listeService.obtenirToutesLesListes();
    }

    @PutMapping("/{id}")
    public Liste mettreAJourListe(@PathVariable Long id, @RequestBody Liste liste) {
        liste.setId(id);
        return listeService.mettreAJourListe(liste);
    }

    @DeleteMapping("/{id}")
    public void supprimerListe(@PathVariable Long id) {
        listeService.supprimerListeParId(id);
    }
}
