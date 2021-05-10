package com.bonhive.pmtool.web;

import com.bonhive.pmtool.domain.Project;
import com.bonhive.pmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/project")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project){
        projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

    @GetMapping("/projects")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectService.getAllProjects();
        ResponseEntity<List<Project>> projectsResponse = new ResponseEntity<List<Project>>(projects, HttpStatus.OK);
        return projectsResponse;
    }

    @GetMapping("/project/{shortName}")
    public ResponseEntity<Project> getProjectByShortName(@PathVariable String shortName){
        Project project = projectService.findByProjectShortName(shortName);
        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }
}
