package com.example.asif047.cricketzzz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Asif on 9/12/2017.
 */

public class CricInfoResponse {

    @SerializedName("creditsLeft")
    @Expose
    private Integer creditsLeft;
    @SerializedName("provider")
    @Expose
    private Provider provider;
    @SerializedName("ttl")
    @Expose
    private Integer ttl;
    @SerializedName("v")
    @Expose
    private String v;
    @SerializedName("cache")
    @Expose
    private Boolean cache;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Integer getCreditsLeft() {
        return creditsLeft;
    }

    public void setCreditsLeft(Integer creditsLeft) {
        this.creditsLeft = creditsLeft;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public Boolean getCache() {
        return cache;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }








    public static class Provider {

        @SerializedName("source")
        @Expose
        private String source;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("pubDate")
        @Expose
        private String pubDate;

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPubDate() {
            return pubDate;
        }

        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

    }






    public class Datum {

        @SerializedName("unique_id")
        @Expose
        private String uniqueId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("date")
        @Expose
        private String date;

        public String getUniqueId() {
            return uniqueId;
        }

        public void setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }


    }






}
