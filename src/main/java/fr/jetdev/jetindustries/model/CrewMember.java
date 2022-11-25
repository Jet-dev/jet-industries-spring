package fr.jetdev.jetindustries.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class CrewMember {

    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private UUID crewMemberId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column
    private String picture;

    @ManyToOne
    @JoinColumn(name = "jobId")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "spaceShipId")
    private SpaceShip spaceShip;

}
