package tn.esprit.microservices.candidat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Job implements Serializable {
    private static final long serialVersionUID = 6;
    @Id
    @GeneratedValue()
    private Integer id;
    private String service;
    private Boolean etat;

    public Job(String service, Boolean etat) {
        this.service =service;
        this.etat= etat;
    }
    public Job() {
    }
}
