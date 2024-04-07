package com.example.trello_api.web;

import com.example.trello_api.entities.Tableau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.trello_api.services.TableauService;

import java.util.List;

@RestController
@RequestMapping("/tableaux")
public class TableauController {

    @Autowired
    private TableauService tableauService;

    @PostMapping
    public Tableau creerTableau(@RequestBody Tableau tableau) {
        return tableauService.enregistrerTableau(tableau);
    }

    @GetMapping("/{id}")
    public Tableau obtenirTableauParId(@PathVariable Long id) {
        return tableauService.trouverTableauParId(id);
    }

    @GetMapping
    public List<Tableau> obtenirTousLesTableaux() {
        return tableauService.obtenirTousLesTableaux();
    }

    @PutMapping("/{id}")
    public Tableau mettreAJourTableau(@PathVariable Long id, @RequestBody Tableau tableau) {
        tableau.setId(id);
        return tableauService.mettreAJourTableau(tableau);
    }

    @DeleteMapping("/{id}")
    public void supprimerTableau(@PathVariable Long id) {
        tableauService.supprimerTableauParId(id);
    }
}
