package com.example.vkontakte;

import java.util.Date;

public class ListItem {
    private String groupName;
    private String publishDate;
    private String heading;
    private String likes;
    private String comments;
    private String views;

    public ListItem(String groupName, String publishDate, String heading, String likes, String comments, String views) {
        this.groupName = groupName;
        this.publishDate = publishDate;
        this.heading = heading;
        this.likes = likes;
        this.comments = comments;
        this.views = views;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getHeading() {
        return heading;
    }

    public String getLikes() {
        return likes;
    }

    public String getComments() {
        return comments;
    }

    public String getViews() {
        return views;
    }
}
