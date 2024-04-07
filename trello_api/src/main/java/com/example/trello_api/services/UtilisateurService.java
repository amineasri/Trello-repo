package com.example.trello_api.services;

import com.example.trello_api.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trello_api.repo.UtilisateurRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepo utilisateurRepository;

    // Enregistrer un nouvel utilisateur
    public Utilisateur enregistrerUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur trouverUtilisateurParId(Long id) {
        Optional<Utilisateur> optionalUtilisateur = utilisateurRepository.findById(id);
        return optionalUtilisateur.orElse(null);
    }

    public Utilisateur trouverUtilisateurParEmail(String email) {
        return utilisateurRepository.findByEmail(email);
    }

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
