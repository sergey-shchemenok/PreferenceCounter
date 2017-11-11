package com.example.caelestis.preferencecounter;

/**
 * Created by Caelestis on 10.11.2017.
 */

public abstract class Player {
    private int score, mountScore, bulletScore;
    private String stringScore = "", stringMountScore = "", stringBulletScore = "";

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMountScore() {
        return mountScore;
    }

    public void setMountScore(int mountScore) {
        this.mountScore = mountScore;
    }

    public int getBulletScore() {
        return bulletScore;
    }

    public void setBulletScore(int bulletScore) {
        this.bulletScore = bulletScore;
    }


    public String getStringScore() {
        return stringScore;
    }

    public void setStringScore(String stringScore) {
        this.stringScore = stringScore;
    }

    public String getStringMountScore() {
        return stringMountScore;
    }

    public void setStringMountScore(String stringMountScore) {
        this.stringMountScore = stringMountScore;
    }

    public String getStringBulletScore() {
        return stringBulletScore;
    }

    public void setStringBulletScore(String stringBulletScore) {
        this.stringBulletScore = stringBulletScore;
    }

    //
    public void mountIncrement (){
        mountScore++;
    }

    public void bulletIncrement (){
        bulletScore++;
    }


}
