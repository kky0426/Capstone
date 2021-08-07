package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CUserLeaguelistDTO {


    @Expose
    private List<CUserLeagueDTO> leagueDTOList = null;

    public List<CUserLeagueDTO> getLeagueDTOList() {
        return leagueDTOList;
    }

    public void setLeagueDTOList(List<CUserLeagueDTO> leagueDTOList) {
        this.leagueDTOList = leagueDTOList;
    }
}
