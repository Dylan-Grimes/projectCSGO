package com.qa.controllers;

import com.qa.models.Teams;

import com.qa.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

    @RequestMapping(value = "teams", method = RequestMethod.POST)
    public Teams addTeam(@RequestBody Teams t) {
        return repository.saveAndFlush(t);
    }

    @RequestMapping(value = "teams/{id}", method = RequestMethod.GET)
    public Teams getTeam(@PathVariable Long id) { return repository.findOne(id); }

    @RequestMapping(value = "teams/{id}", method = RequestMethod.DELETE)
    public Teams deleteTeam(@PathVariable Long id) {
        Teams existing = repository.findOne(id);
        repository.delete(existing);
        return existing;
    }

    @Transactional
    @RequestMapping(value = "teams/{id}", method = RequestMethod.PUT)
    public Teams updatePlayers(@PathVariable Long id, @RequestBody Teams team){
        Teams existing = repository.findOne(id);

        existing.updateAll(team);

        return repository.saveAndFlush(existing);
    }

}