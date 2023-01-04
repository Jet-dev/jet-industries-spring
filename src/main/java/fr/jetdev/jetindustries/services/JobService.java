package fr.jetdev.jetindustries.services;

import fr.jetdev.jetindustries.model.CrewMember;
import fr.jetdev.jetindustries.model.Job;
import fr.jetdev.jetindustries.repositories.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJob(UUID id) {
        return jobRepository.findById(id);
    }

    public Job createJob(Job crewMember) {
        return jobRepository.save(crewMember);
    }

    public Job updateJob(Job crewMember) {
        return jobRepository.save(crewMember);
    }

    public void deleteJob(UUID id) {
        jobRepository.deleteById(id);
    }
}
