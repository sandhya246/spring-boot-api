package com.tekion.springbootapi.repository;

import com.tekion.springbootapi.bean.BallData;
import com.tekion.springbootapi.bean.BallDataPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BallRepo extends JpaRepository<BallData, BallDataPK>
{

    @Query(value = "select * from CricketGame.ball_data where ball_no = ?1 and team_id = ?2", nativeQuery = true)
    List<BallData> getBallDataByBallNoAndTeamId(int ballNo, int teamId);


    @Query(value = "select * from CricketGame.ball_data where ball_no = ?1", nativeQuery = true)
    List<BallData> findByBallNo(int ballNo);
}
