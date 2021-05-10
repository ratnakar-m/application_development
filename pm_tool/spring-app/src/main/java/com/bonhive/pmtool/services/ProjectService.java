package com.bonhive.pmtool.services;

import com.bonhive.pmtool.domain.Project;
import com.bonhive.pmtool.exceptions.ProjectCodeException;
import com.bonhive.pmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);
    }

    public List<Project> getAllProjects(){
        Iterable<Project> projectsIterable =  projectRepository.findAll();
        Iterator<Project> projectsIterator = projectsIterable.iterator();

        List<Project> projects = new ArrayList<>();
        while(projectsIterator.hasNext()){
            Project project = projectsIterator.next();
            projects.add(project);
        }

        return projects;
    }

    public Project findByProjectCode(String projectCode){
        Project project = projectRepository.findByProjectCode(projectCode);
        return project;
    }

    public void deleteByProjectCode(String projectCode){
        Project project = projectRepository.findByProjectCode(projectCode.toUpperCase());

        if(project == null){
            throw new ProjectCodeException("Cannot Project with code '"+projectCode+"'. This project does not exist");
        }
        projectRepository.delete(project);
    }
}
