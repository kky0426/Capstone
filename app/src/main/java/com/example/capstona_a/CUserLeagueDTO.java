package com.example.capstona_a;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CUserLeagueDTO {

    @SerializedName("leagueId")
    @Expose
    private String leagueId;
    @SerializedName("queueType")
    @Expose
    private String queueType;
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("leaguePoints")
    @Expose
    private Integer leaguePoints;
    @SerializedName("wins")
    @Expose
    private Integer wins;
    @SerializedName("losses")
    @Expose
    private Integer losses;
    @SerializedName("veteran")
    @Expose
    private Boolean veteran;
    @SerializedName("inactive")
    @Expose
    private Boolean inactive;
    @SerializedName("freshBlood")
    @Expose
    private Boolean freshBlood;
    @SerializedName("hotStreak")
    @Expose
    private Boolean hotStreak;

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public CUserLeagueDTO withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public CUserLeagueDTO withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public CUserLeagueDTO withTier(String tier) {
        this.tier = tier;
        return this;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public CUserLeagueDTO withRank(String rank) {
        this.rank = rank;
        return this;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public CUserLeagueDTO withSummonerId(String summonerId) {
        this.summonerId = summonerId;
        return this;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public CUserLeagueDTO withSummonerName(String summonerName) {
        this.summonerName = summonerName;
        return this;
    }

    public Integer getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(Integer leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public CUserLeagueDTO withLeaguePoints(Integer leaguePoints) {
        this.leaguePoints = leaguePoints;
        return this;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public CUserLeagueDTO withWins(Integer wins) {
        this.wins = wins;
        return this;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public CUserLeagueDTO withLosses(Integer losses) {
        this.losses = losses;
        return this;
    }

    public Boolean getVeteran() {
        return veteran;
    }

    public void setVeteran(Boolean veteran) {
        this.veteran = veteran;
    }

    public CUserLeagueDTO withVeteran(Boolean veteran) {
        this.veteran = veteran;
        return this;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public CUserLeagueDTO withInactive(Boolean inactive) {
        this.inactive = inactive;
        return this;
    }

    public Boolean getFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(Boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public CUserLeagueDTO withFreshBlood(Boolean freshBlood) {
        this.freshBlood = freshBlood;
        return this;
    }

    public Boolean getHotStreak() {
        return hotStreak;
    }

    public void setHotStreak(Boolean hotStreak) {
        this.hotStreak = hotStreak;
    }

    public CUserLeagueDTO withHotStreak(Boolean hotStreak) {
        this.hotStreak = hotStreak;
        return this;
    }

}
