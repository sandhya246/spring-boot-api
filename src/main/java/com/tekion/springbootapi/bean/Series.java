package com.tekion.springbootapi.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="series")
public class Series
{
    @Id
    @Column(name="series_id")
    private int seriesId;

    @Column(name="team1_id")
    private int team1Id;

    @Column(name="team2_id")
    private int  team2Id;

    @Column(name="total_match_played")
    private int totalMatchPlayed;

    @Column(name="team1_won")
    private int team1Won;

    @Column(name="team2_won")
    private int team2Won;

    @Column(name="series_winner")
    private int seriesWinner;

    public Series(){

    }
    public Series(int seriesId, int team1Id, int team2Id, int totalMatchPlayed, int team1Won, int team2Won, int seriesWinner) {
        this.seriesId = seriesId;
        this.team1Id = team1Id;
        this.team2Id = team2Id;
        this.totalMatchPlayed = totalMatchPlayed;
        this.team1Won = team1Won;
        this.team2Won = team2Won;
        this.seriesWinner = seriesWinner;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public int getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(int team1Id) {
        this.team1Id = team1Id;
    }

    public int getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(int team2Id) {
        this.team2Id = team2Id;
    }

    public int getTotalMatchPlayed() {
        return totalMatchPlayed;
    }

    public void setTotalMatchPlayed(int totalMatchPlayed) {
        this.totalMatchPlayed = totalMatchPlayed;
    }

    public int getTeam1Won() {
        return team1Won;
    }

    public void setTeam1Won(int team1Won) {
        this.team1Won = team1Won;
    }

    public int getTeam2Won() {
        return team2Won;
    }

    public void setTeam2Won(int team2Won) {
        this.team2Won = team2Won;
    }

    public int getSeriesWinner() {
        return seriesWinner;
    }

    public void setSeriesWinner(int seriesWinner) {
        this.seriesWinner = seriesWinner;
    }
}
