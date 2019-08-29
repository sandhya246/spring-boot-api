package com.tekion.springbootapi.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BallDataPK implements Serializable {

    @Column(name = "ball_no")
    private int ballNo;
    @Column(name = "team_id")
    private int teamId;

    public BallDataPK() {

    }

    public BallDataPK(int ballNo, int teamId) {
        this.ballNo = ballNo;
        this.teamId = teamId;
    }

    public int getBallNo() {
        return ballNo;
    }

    public void setBallNo(int ballNo) {
        this.ballNo = ballNo;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BallDataPK)) return false;
        BallDataPK that = (BallDataPK) o;
        return getBallNo() == that.getBallNo() &&
                getTeamId() == that.getTeamId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBallNo(), getTeamId());
    }
}
