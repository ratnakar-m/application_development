package com.bonhive.pmtool.web;

import com.bonhive.pmtool.domain.Project;
import com.bonhive.pmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project){
        projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectService.getAllProjects();
        ResponseEntity<List<Project>> projectsResponse = new ResponseEntity<List<Project>>(projects, HttpStatus.OK);
        return projectsResponse;
    }

    @GetMapping("/{projectCode}")
    public ResponseEntity<Project> getByProjectCode(@PathVariable String projectCode){
        Project project = projectService.findByProjectCode(projectCode);
        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }

    @DeleteMapping("/{projectCode}")
    public ResponseEntity<?> deleteByProjectCode(@PathVariable String projectCode){
        projectService.deleteByProjectCode(projectCode);
        return new ResponseEntity<String>("Project with code: '"+projectCode+"' was deleted", HttpStatus.OK);
    }
}
