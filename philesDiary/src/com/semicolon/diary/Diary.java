package com.semicolon.diary;

import java.util.ArrayList;

public class Diary {
    private String ownersName;
    private String password;
    private ArrayList<Gist> gists = new ArrayList<>();

    public Diary(String ownersName, String password) {
        this.ownersName = ownersName;
        this.password = password;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Gist> getGists() {
        return gists;
    }

    public void setGists(ArrayList<Gist> gists) {
        this.gists = gists;
    }


    public void addNewGist(String title, String body, String secretKey) {
        //verify password is correct//if correct//create new gist//add gist to the list of gists//else throw exeption
        if (secretKey.equals(password)){
            Gist newGist = new Gist(title, body);
            gists.add(newGist);
        }else throw new IllegalArgumentException("Invalid password");
    }

    public Gist getGistByTitle(String titleOfDesiredGist) {
        for (Gist gist : gists) {
            if (gist.getTitle().equalsIgnoreCase(titleOfDesiredGist)) return gist;
        }
        throw new IllegalArgumentException("Gist not found");
    }

    public void deleteGistFromLiist(String titleOfGistToBeDeleted, String secreteKey) {
        if (secreteKey.equals(password)){
            for (Gist gist : gists) {
                if (gist.getTitle().equals(titleOfGistToBeDeleted)) gists.remove(gist);
            }
        }
        else throw new IllegalArgumentException("Invalid password to access gists");
    }


    public ArrayList<Gist> viewAllGist(String secreteKey) {
        if (!secreteKey.equals(password)) throw new IllegalArgumentException("Invalid password");
        return gists;
    }
}
