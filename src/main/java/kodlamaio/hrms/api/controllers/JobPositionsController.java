package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) { this.jobPositionService = jobPositionService; }

    @GetMapping("/getall")
    public DataResult<List<JobPosition>> getAll(){
        return jobPositionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition){
        return jobPositionService.add(jobPosition);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody JobPosition jobPosition){
        return jobPositionService.delete(jobPosition);
    }

    @PutMapping("/update")
    public Result update(@RequestBody JobPosition jobPosition){
        return jobPositionService.update(jobPosition);
    }


}
