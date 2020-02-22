package com.example.vkontakte;


public class ListItem {
    private String groupName;
    private String publishDate;
    private String heading;
    private String likes;
    private String comments;
    private String views;
    private String imgURL;

    public ListItem(String groupName, String publishDate, String heading, String likes, String comments, String views, String imgURL) {
        this.groupName = groupName;
        this.publishDate = publishDate;
        this.heading = heading;
        this.likes = likes;
        this.comments = comments;
        this.views = views;
        this.imgURL = imgURL;
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

    public String getImgURL() {
        return imgURL;
    }
}
