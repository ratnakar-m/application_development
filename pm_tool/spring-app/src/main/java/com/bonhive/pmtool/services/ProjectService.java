package com.bonhive.pmtool.services;

import com.bonhive.pmtool.domain.Project;
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

    public Project findByProjectShortName(String shortName){
        Project project = projectRepository.findByProjectShortName(shortName);
        return project;
    }
}
