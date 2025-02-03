package tn.esprit.microservices.candidat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.microservices.candidat.interfaces.CandidatRepository;

@RestController
public class CondidatController
{
    private String title="Hello, i'm the candidate Micro-Service";

    @RequestMapping("/hello") public String sayHello(){
        System.out.println(title); return title;
    }

}
