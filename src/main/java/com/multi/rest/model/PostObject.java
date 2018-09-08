package com.multi.rest.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: git
 * Date: 07/09/2018
 * Time: 20:14
 */
@Entity
@Table(name = "obj")
public class PostObject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long postObjectId;

    @Column(name = "username")
    private String username;

    @Column(name = "email_address")
    private String emailAddress;

    public PostObject() {
    }

    public PostObject(String username, String emailAddress) {
        this.username = username;
        this.emailAddress = emailAddress;
    }

    public Long getPostObjectId() {
        return postObjectId;
    }

    public void setPostObjectId(Long postObjectId) {
        postObjectId = postObjectId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "PostObject{" +
                "PostObjectId=" + postObjectId +
                ", username='" + username + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
