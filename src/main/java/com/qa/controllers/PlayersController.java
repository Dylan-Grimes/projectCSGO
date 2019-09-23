package com.qa.controllers;

import com.qa.models.Players;
import com.qa.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class PlayersController {

@Autowired
private PlayersRepository repository;

        @RequestMapping(value = "players", method = RequestMethod.GET)
        public List<Players> listAllPlayers() { return repository.findAll(); }

        @RequestMapping(value = "players", method = RequestMethod.POST)
        public Players addPlayer(@RequestBody Players players) { return repository.saveAndFlush(players); }





}