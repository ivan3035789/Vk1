package ru.netology.domain;

public class Post {
    private int postId;
    private int idPostOwner;
    private String urlLogo;
    private String idPostOwnerText;
    int dateTime;
    private String postText;
    private String urlPostImage;
    private String text;
    private boolean liked;
    private int numberOfLikes;
    private int commentOwnerId;
    private String textCommend;
    private boolean share;
    private int countShare;
    boolean views;
    private int numberOfViews;
    private int report;
    private int numberOfComplaints;
}
// + get/set на все поля

class PostCommentsInfo {
    private int commentOwnerId;
    private String textCommend;
    private String urlLogo;

    public void textCommend() {
    }
}
// + get/set на все поля

class Liked {
    private boolean liked;
    private int numberOfLikes;

    public void likeCounter() {
// + get/set на все поля
    }
}

class Share {
    private boolean share;
    private int countShare;

    public void shareCount() {
// + get/set на все поля
    }
}

class DateTime {
    private int dateTime;

    public void dateTime() {
    }
}

class PostImage {
    private int commentOwnerId;
    private String postTitle;
    private String text;
    private String urlPostImage;
    private int idUrlPostImage;
}

class ViewsInfo {
    boolean views;
    private int numberOfViews;

    public void viewCounter() {
    }
}