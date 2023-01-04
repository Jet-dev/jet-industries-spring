package fr.jetdev.jetindustries.controllers;

import fr.jetdev.jetindustries.model.Job;
import fr.jetdev.jetindustries.services.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("jobs")
public class JobController {
    private final JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJob(@PathVariable(value = "id") final UUID id) {
        return jobService.getJob(id).orElseThrow();
    }

    @PostMapping
    public Job createJob(@RequestBody Job Job) {
        return jobService.createJob(Job);
    }

    @PutMapping
    public Job updateJob(@RequestBody Job Job) {
        return jobService.updateJob(Job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable(value = "id") final UUID id) {
        jobService.deleteJob(id);
    }
}
