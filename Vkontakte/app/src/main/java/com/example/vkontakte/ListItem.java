package com.example.vkontakte;


public class ListItem {
    private String groupName;
    private String publishDate;
    private String heading;
    private String likes;
    private String comments;
    private String views;
    private String imgURL;
    private String imgURLg;

    public String getImgURLg() {
        return imgURLg;
    }

    public void setImgURLg(String imgURLg) {
        this.imgURLg = imgURLg;
    }
//    public ListItem(String groupName, String publishDate, String heading, String likes, String comments, String views, String imgURL) {
//        this.groupName = groupName;
//        this.publishDate = publishDate;
//        this.heading = heading;
//        this.likes = likes;
//        this.comments = comments;
//        this.views = views;
//        this.imgURL = imgURL;
//    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public void setImgURL(String imgURL) {
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
