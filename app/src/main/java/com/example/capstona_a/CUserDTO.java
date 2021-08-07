package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
/* {
    "id": "ZEwSFvGvoKRevXsEodFn0dMk8GyyN6VNc2Fj_6R90XzZ_1Y",
    "accountId": "OY2P5w0SRfW1OxUAcbpk3wNxzWRWcxf6_rVMpfaeimxk_kXLooiBzSD9",
    "puuid": "cHJSgEVlhlbV-HwH4FuW_AdYmMmf183ZfJB_uDZQIoZALCPZCU1CMNu3Ht01cDzd1FdGZ7sP1AcbFw",
    "name": "석주윤",
    "profileIconId": 3590,
    "revisionDate": 1627870340000,
    "summonerLevel": 357
}
 */
public class CUserDTO implements Serializable {
    @Expose
    @SerializedName("id")
    private String id;
    @Expose
    @SerializedName("accountId")
    private String accountId;
    @Expose
    @SerializedName("puuid")
    private String puuid;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("profileIconId")
    private int profileIconId;
    @Expose
    @SerializedName("revisionDate")
    private long revisionDate;
    @Expose
    @SerializedName("summonerLevel")
    private long summonerLevel;


    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
