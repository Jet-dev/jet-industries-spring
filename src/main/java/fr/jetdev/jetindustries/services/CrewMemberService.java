package fr.jetdev.jetindustries.services;

import fr.jetdev.jetindustries.model.CrewMember;
import fr.jetdev.jetindustries.repositories.CrewMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class CrewMemberService {

    private final CrewMemberRepository crewMemberRepository;

    public List<CrewMember> getAllCrewMembers() {
        return crewMemberRepository.findAll();
    }

    public Optional<CrewMember> getCrewMember(UUID id) {
        return crewMemberRepository.findById(id);
    }

    public CrewMember createCrewMember(CrewMember crewMember) {
        return crewMemberRepository.save(crewMember);
    }

    public CrewMember updateCrewMember(UUID id, CrewMember crewMember) {
        Optional<CrewMember> crewMemberOptional = crewMemberRepository.findById(id);
        if (crewMemberOptional.isPresent()) {
            //TODO : on fait quoi
        }
        return crewMemberRepository.save(crewMember);
    }

    public void deleteCrewMember(UUID id) {
        crewMemberRepository.deleteById(id);
    }
}
