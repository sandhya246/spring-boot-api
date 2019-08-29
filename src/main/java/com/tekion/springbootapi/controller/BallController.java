package com.tekion.springbootapi.controller;


import com.tekion.springbootapi.bean.BallData;
import com.tekion.springbootapi.repository.BallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BallController
{
    @Autowired
    private BallRepo ballRepo;

    @GetMapping("/ballData/{ballNo}/{teamId}")
    public List<BallData> retrieveBallData(@PathVariable("ballNo") int ballNo, @PathVariable("teamId") int teamId)
    {
      return ballRepo.getBallDataByBallNoAndTeamId(ballNo, teamId);
    }

    @GetMapping("/ballData/{ballNo}")
    public List<BallData> retrieveBallInfo(@PathVariable("ballNo") int ballNo)
    {
      return ballRepo.findByBallNo(ballNo);
    }


}
