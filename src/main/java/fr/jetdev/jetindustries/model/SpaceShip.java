package fr.jetdev.jetindustries.model;

import fr.jetdev.jetindustries.enums.SpaceShipType;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class SpaceShip {

    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private UUID spaceShipId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private SpaceShipType type;

    @Column
    private Double tonnage;

    @Column
    private Double usedTonnage;

    @Column
    private Double maxSpeed;

    @Column
    private Double autonomy;

    @Column
    private Double percentage;

    @OneToMany(mappedBy = "spaceShip")
    private List<CrewMember> crewMembers;
}
