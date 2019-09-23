package com.qa.controllers;

import com.qa.models.Teams;

import com.qa.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class TeamsController {

    @Autowired
    private TeamsRepository repository;

    @RequestMapping(value = "teams", method = RequestMethod.GET)
    public List<Teams> listAllTeams() {
        return repository.findAll();
    }
}