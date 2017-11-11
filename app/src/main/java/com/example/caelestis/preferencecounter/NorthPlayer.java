package com.example.caelestis.preferencecounter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caelestis on 10.11.2017.
 */

public class NorthPlayer extends Player {
    private int whistToSouth, whistToWest, whistToEast;
    private String stringWhistToSouth = "", stringWhistToWest = "", stringWhistToEast = "";
    private List<Integer> scoreList = new ArrayList<>();
    private List<String> stringList = new ArrayList<>();

    public List<Integer> getScoreList() {
        return scoreList;
    }

    public NorthPlayer(int whistToSouth) {
        this.whistToSouth = whistToSouth;
        for (int i = 0; i < 6; i++){
            scoreList.add(0);
            stringList.add("");
        }
    }

    public NorthPlayer(int whistToSouth, int whistToWest, int whistToEast) {
        this.whistToSouth = whistToSouth;
        this.whistToWest = whistToWest;
        this.whistToEast = whistToEast;
        for (int i = 0; i < 6; i++){
            scoreList.add(0);
            stringList.add("");
        }
    }

    public String getStringWhistToSouth() {
        return stringWhistToSouth;
    }

    public void setStringWhistToSouth(String stringWhistToSouth) {
        this.stringWhistToSouth = stringWhistToSouth;
    }

    public String getStringWhistToWest() {
        return stringWhistToWest;
    }

    public void setStringWhistToWest(String stringWhistToWest) {
        this.stringWhistToWest = stringWhistToWest;
    }

    public String getStringWhistToEast() {
        return stringWhistToEast;
    }

    public void setStringWhistToEast(String stringWhistToEast) {
        this.stringWhistToEast = stringWhistToEast;
    }

    public int getWhistToSouth() {
        return whistToSouth;
    }

    public void setWhistToSouth(int whistToSouth) {
        this.whistToSouth = whistToSouth;
    }

    public int getWhistToWest() {
        return whistToWest;
    }

    public void setWhistToWest(int whistToWest) {
        this.whistToWest = whistToWest;
    }

    public int getWhistToEast() {
        return whistToEast;
    }

    public void setWhistToEast(int whistToEast) {
        this.whistToEast = whistToEast;
    }

    //

    public void whistToSouthIncrement (){
        whistToSouth++;
    }

    public void whistToWestIncrement (){
        whistToWest++;
    }

    public void whistToEastIncrement (){
        whistToEast++;
    }

    public void addToList(){
        scoreList.clear();
        scoreList.add(getMountScore());
        scoreList.add(getBulletScore());
        scoreList.add(0);
        scoreList.add(whistToSouth);
        scoreList.add(whistToWest);
        scoreList.add(whistToEast);

        stringList.clear();
        stringList.add(getStringMountScore());
        stringList.add(getStringBulletScore());
        stringList.add("");
        stringList.add(stringWhistToSouth);
        stringList.add(stringWhistToWest);
        stringList.add(stringWhistToEast);
    }

    public void getFromList(){
        setMountScore(scoreList.get(0));
        setBulletScore(scoreList.get(1));
        whistToSouth = scoreList.get(3);
        whistToWest = scoreList.get(4);
        whistToEast = scoreList.get(5);

        setStringMountScore(stringList.get(0));
        setStringBulletScore(stringList.get(1));
        stringWhistToSouth = stringList.get(3);
        stringWhistToWest = stringList.get(4);
        stringWhistToEast = stringList.get(5);
    }

}
