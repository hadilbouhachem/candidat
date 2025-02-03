package tn.esprit.microservices.candidat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Candidat implements Serializable {
    private static final long serialVersionUID = 6;
    @Id
    @GeneratedValue()
    private Integer id;
    private String nom,prenom,adresse;
    public Candidat(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public Candidat() {}

}
