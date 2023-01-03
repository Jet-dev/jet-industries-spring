package fr.jetdev.jetindustries.controllers;

import fr.jetdev.jetindustries.model.CrewMember;
import fr.jetdev.jetindustries.services.CrewMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("crew-members")
public class CrewMemberController {

    private final CrewMemberService crewMemberService;

    @GetMapping
    public List<CrewMember> getAllCrewMembers() {
        return crewMemberService.getAllCrewMembers();
    }

    @GetMapping("/{id}")
    public CrewMember getCrewMember(@PathVariable(value = "id") final UUID id) {
        return crewMemberService.getCrewMember(id).orElseThrow();
    }

    @PostMapping
    public CrewMember createCrewMember(@RequestBody CrewMember crewMember) {
        return crewMemberService.createCrewMember(crewMember);
    }

    @PutMapping("/{id}")
    public CrewMember updateCrewMember(@PathVariable(value = "id") final UUID id, @RequestBody CrewMember crewMember) {
        return crewMemberService.updateCrewMember(id, crewMember);
    }

    @DeleteMapping("/{id}")
    public void deleteCrewMember(@PathVariable(value = "id") final UUID id) {
        crewMemberService.deleteCrewMember(id);
    }
}
