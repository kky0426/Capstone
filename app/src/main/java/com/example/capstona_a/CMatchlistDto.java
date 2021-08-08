package com.example.capstona_a;

import com.google.gson.annotations.Expose;

public class CMatchlistDto {
    @Expose
    private CMatchData CMatchData;

    public CMatchData getMatchData() {
        return CMatchData;
    }

    public void setMatchData(CMatchData CMatchData) {
        this.CMatchData = CMatchData;
    }
}
