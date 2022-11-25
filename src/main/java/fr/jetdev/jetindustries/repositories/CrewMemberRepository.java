package fr.jetdev.jetindustries.repositories;

import fr.jetdev.jetindustries.model.CrewMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CrewMemberRepository extends JpaRepository<CrewMember, UUID> {
}
