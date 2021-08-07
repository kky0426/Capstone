package com.example.capstona_a;

import com.google.gson.annotations.Expose;

public class MatchlistDto {
    @Expose
    private MatchData matchData;

    public MatchData getMatchData() {
        return matchData;
    }

    public void setMatchData(MatchData matchData) {
        this.matchData = matchData;
    }
}
