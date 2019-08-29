package com.tekion.springbootapi.repository;

import com.tekion.springbootapi.bean.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface MatchRepo extends JpaRepository<Match,Integer>
{

    @Query(value = "select * from CricketGame.match where match_id = ?1", nativeQuery = true)
    Match findByMatchId(int matchId);
}
