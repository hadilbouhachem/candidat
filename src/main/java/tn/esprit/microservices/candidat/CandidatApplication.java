package tn.esprit.microservices.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.microservices.candidat.entities.Candidat;
import tn.esprit.microservices.candidat.entities.Job;
import tn.esprit.microservices.candidat.interfaces.CandidatRepository;
import tn.esprit.microservices.candidat.interfaces.JobRepository;
@EnableDiscoveryClient
@SpringBootApplication
public class CandidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidatApplication.class, args);
    }
    @Autowired
    private CandidatRepository repository;
    @Autowired
    private JobRepository jobRepository;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            // save
            repository.save(new Candidat("Mariem", "Ch", "ma@esprit.tn"));
            repository.save(new Candidat("Sarra", "ab", "sa@esprit.tn"));
            repository.save(new Candidat("Mohamed", "ba", "mo@esprit.tn"));
            repository.save(new Candidat("Maroua", "dh", "maroua@esprit.tn"));
            jobRepository.save(new Job("service1",true));
            jobRepository.save(new Job("service2",false));
            // fetch
            repository.findAll().forEach(System.out::println);
            jobRepository.findAll().forEach(System.out::println);

        };


    }
}
