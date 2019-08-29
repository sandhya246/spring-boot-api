package com.tekion.springbootapi.bean;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name= "ball_data")
public class BallData
{
    @EmbeddedId
    private BallDataPK ballDataPK;

    @Column(name = "striker")
    private String striker;

    @Column(name = "bowler")
    private String bowler;

    @Column(name = "run")
    private int run;

    @Column(name = "total_run")
    private int totalRun;

    @Column(name = "wicket")
    private int wicket;

    @Column(name = "total_wicket")
    private int totalWicket;

    public BallData() {

    }

    public BallData(BallDataPK ballDataPK, String striker, String bowler, int run, int totalRun, int wicket, int totalWicket) {
        this.ballDataPK = ballDataPK;
        this.striker = striker;
        this.bowler = bowler;
        this.run = run;
        this.totalRun = totalRun;
        this.wicket = wicket;
        this.totalWicket = totalWicket;
    }

    public String getStriker() {
        return striker;
    }

    public void setStriker(String striker) {
        this.striker = striker;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = totalRun;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public int getTotalWicket() {
        return totalWicket;
    }

    public void setTotalWicket(int totalWicket) {
        this.totalWicket = totalWicket;
    }


    public BallDataPK getBallDataPK() {
        return ballDataPK;
    }

    public void setBallDataPK(BallDataPK ballDataPK) {
        this.ballDataPK = ballDataPK;
    }
}
