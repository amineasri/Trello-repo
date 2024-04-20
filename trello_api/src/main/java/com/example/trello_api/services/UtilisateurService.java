package com.example.trello_api.services;

import com.example.trello_api.entities.Utilisateur;
import com.example.trello_api.exceptions.RessourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trello_api.repo.UtilisateurRepo;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepo utilisateurRepository;

    public Utilisateur enregistrerUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur trouverUtilisateurParId(Long id) {
        return utilisateurRepository.findById(id).orElseThrow(()->new RessourceNotFound("Utilisateur id= %s not found".formatted(id)));
    }
/*
    public Utilisateur trouverUtilisateurParEmail(String email) {
        return utilisateurRepository.findByEmail(email);
    }
*/
    public List<Utilisateur> obtenirTousLesUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur mettreAJourUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public void supprimerUtilisateurParId(Long id) {
        utilisateurRepository.deleteById(id);
    }
}
