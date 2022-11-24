package fr.jetdev.jetindustries.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private UUID jobId;

    @Column(nullable = false)
    private String label;

}
