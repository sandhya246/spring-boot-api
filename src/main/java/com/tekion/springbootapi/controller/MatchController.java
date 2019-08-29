package com.tekion.springbootapi.controller;


import com.tekion.springbootapi.repository.MatchRepo;
import com.tekion.springbootapi.bean.Match;
import com.tekion.springbootapi.repository.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController
{
    @Autowired
    private MatchRepo matchRepo;

    @GetMapping("/{matchId}")
    public Match getMatchDetails(@PathVariable("matchId") int matchId) {
        return matchRepo.findByMatchId(matchId);

    }


}
