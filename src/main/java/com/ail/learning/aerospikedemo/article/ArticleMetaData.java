package com.ail.learning.aerospikedemo.article;

import java.util.UUID;

public class ArticleMetaData {
    UUID articleID;
    String desc;
    String name;
    String writtenby;
    long likes;
    long disLikes;

    public UUID getArticleID() {
        return articleID;
    }

    public void setArticleID(UUID articleID) {
        this.articleID = articleID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWrittenby() {
        return writtenby;
    }

    public void setWrittenby(String writtenby) {
        this.writtenby = writtenby;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public long getDisLikes() {
        return disLikes;
    }

    public void setDisLikes(long disLikes) {
        this.disLikes = disLikes;
    }
}
