package fr.sii.dto.user;

import java.util.Set;
import fr.sii.dto.TalkUser;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by tmaugin on 05/06/2015.
 * SII
 */
public class UserProfil {
    private int id;
    private String lastname;
    private String firstname;
    private String company;
    private String phone;
    private String bio;
    private String social;
    private String twitter;
    private String googleplus;
    private String github;
    private String imageProfilURL;
    private String email;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getGoogleplus() {
        return googleplus;
    }

    public void setGoogleplus(String googleplus) {
        this.googleplus = googleplus;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getImageProfilURL() {
        return imageProfilURL;
    }

    public void setImageProfilURL(String imageProfilURL) {
        this.imageProfilURL = imageProfilURL;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
