package Model;

import java.util.Date;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class Message {
    private static int messageCounter=1;

    private int messageId;
    private User user;
    private Date dateOfPost;
    private String text;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(Date dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public Message(User user, Date dateOfPost, String text) {
        this.messageId = ++messageCounter;
        this.user = user;
        this.dateOfPost = dateOfPost;
        this.text = text;
    }
}
