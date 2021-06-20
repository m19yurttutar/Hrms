package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.entities.concretes.JobSeeker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {

    private final JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) { this.jobSeekerService = jobSeekerService; }

    @GetMapping("/getAll")
    public DataResult<List<JobSeeker>> getAll(){
        return jobSeekerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeeker jobSeeker){
        return jobSeekerService.add(jobSeeker);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody JobSeeker jobSeeker){
        return jobSeekerService.delete(jobSeeker);
    }

    @PutMapping("/update")
    public Result update(@RequestBody JobSeeker jobSeeker){
        return jobSeekerService.add(jobSeeker);
    }
}
