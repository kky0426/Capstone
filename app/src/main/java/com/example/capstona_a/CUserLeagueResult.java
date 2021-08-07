package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CUserLeagueResult {
    @Expose
    private CUserLeaguelistDTO cUserLeaguelistDTO;

    public CUserLeaguelistDTO getcUserLeaguelistDTO() {
        return cUserLeaguelistDTO;
    }

    public void setcUserLeaguelistDTO(CUserLeaguelistDTO cUserLeaguelistDTO) {
        this.cUserLeaguelistDTO = cUserLeaguelistDTO;
    }





}
