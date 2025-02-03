package tn.esprit.microservices.candidat.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.microservices.candidat.entities.Job;

public interface JobRepository  extends JpaRepository<Job, Integer> {
    @Query("select j from Job j where j.id = :id")
    public Page<Job> jobById(@Param("id") Integer id, Pageable pageable);
}
