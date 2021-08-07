package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Match {
    /*
    @SerializedName("platformId")
    @Expose
    private String platformId;
     */
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("champion")
    @Expose
    private Integer champion;
    /*
    @SerializedName("queue")
    @Expose
    private Integer queue;
    @SerializedName("season")
    @Expose
    private Integer season;

     */
/*
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

 */
    /*
    @SerializedName("role")
    @Expose
    private String role;
    */
    @SerializedName("lane")
    @Expose
    private String lane;
    private String imgSrc;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    /*
        public String getPlatformId() {
            return platformId;
        }

        public void setPlatformId(String platformId) {
            this.platformId = platformId;
        }

        public Match withPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }
    */
    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Match withGameId(Long gameId) {
        this.gameId = gameId;
        return this;
    }

    public Integer getChampion() {
        return champion;
    }

    public void setChampion(Integer champion) {
        this.champion = champion;
    }

    public Match withChampion(Integer champion) {
        this.champion = champion;
        return this;
    }
/*
    public Integer getQueue() {
        return queue;
    }

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public Match withQueue(Integer queue) {
        this.queue = queue;
        return this;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Match withSeason(Integer season) {
        this.season = season;
        return this;
    }
*/
    /*
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Match withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    */

/*
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Match withRole(String role) {
        this.role = role;
        return this;
    }
*/
    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Match withLane(String lane) {
        this.lane = lane;
        return this;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Match.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gameId");
        sb.append('=');
        sb.append(((this.gameId == null)?"<null>":this.gameId));
        sb.append(',');
        sb.append("champion");
        sb.append('=');
        sb.append(((this.champion == null)?"<null>":this.champion));
        sb.append(',');
        sb.append("lane");
        sb.append('=');
        sb.append(((this.lane == null)?"<null>":this.lane));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


}