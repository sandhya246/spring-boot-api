package com.tekion.springbootapi.bean;

import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "match")
public class Match {

    @Id
    @Column(name = "match_id")
    private int matchId;

    @Column(name = "series_id")
    private int seriesId;

    @Column(name = "team1_id")
    private int team1Id;

    @Column(name= "team2_id")
    private int team2id;

    @Column(name = "run_scoredby_team1")
    private int runScoredByTeam1;

    @Column(name = "wicket_lostby_team1")
    private int wicketLostByTeam1;

    @Column(name = "run_scoredby_team2")
    private int getRunScoredByTeam2;

    @Column(name = "wicket_lostby_team2")
    private int getWicketLostByTeam2;


     @Column(name= "winner_team_id")
     private int winnerTeamId;


    public Match(){

    }

    public Match(int matchId, int seriesId, int team1Id, int team2id, int runScoredByTeam1, int wicketLostByTeam1, int getRunScoredByTeam2, int getWicketLostByTeam2, int winnerTeamId) {
        this.matchId = matchId;
        this.seriesId = seriesId;
        this.team1Id = team1Id;
        this.team2id = team2id;
        this.runScoredByTeam1 = runScoredByTeam1;
        this.wicketLostByTeam1 = wicketLostByTeam1;
        this.getRunScoredByTeam2 = getRunScoredByTeam2;
        this.getWicketLostByTeam2 = getWicketLostByTeam2;
        this.winnerTeamId = winnerTeamId;
    }

    public int getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(int team1Id) {
        this.team1Id = team1Id;
    }

    public int getTeam2id() {
        return team2id;
    }

    public void setTeam2id(int team2id) {
        this.team2id = team2id;
    }

    public int getRunScoredByTeam1() {
        return runScoredByTeam1;
    }

    public void setRunScoredByTeam1(int runScoredByTeam1) {
        this.runScoredByTeam1 = runScoredByTeam1;
    }

    public int getWicketLostByTeam1() {
        return wicketLostByTeam1;
    }

    public void setWicketLostByTeam1(int wicketLostByTeam1) {
        this.wicketLostByTeam1 = wicketLostByTeam1;
    }

    public int getGetRunScoredByTeam2() {
        return getRunScoredByTeam2;
    }

    public void setGetRunScoredByTeam2(int getRunScoredByTeam2) {
        this.getRunScoredByTeam2 = getRunScoredByTeam2;
    }

    public int getGetWicketLostByTeam2() {
        return getWicketLostByTeam2;
    }

    public void setGetWicketLostByTeam2(int getWicketLostByTeam2) {
        this.getWicketLostByTeam2 = getWicketLostByTeam2;
    }

    public int getWinnerTeamId() {
        return winnerTeamId;
    }

    public void setWinnerTeamId(int winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }
}
