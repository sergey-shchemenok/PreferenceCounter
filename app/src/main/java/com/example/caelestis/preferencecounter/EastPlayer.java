package com.example.caelestis.preferencecounter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caelestis on 10.11.2017.
 */

public class EastPlayer  extends Player {
    private int whistToNorth, whistToSouth, whistToWest;
    private String stringWhistToSouth = "", stringWhistToNorth = "", stringWhistToWest = "";
    private List<Integer> scoreList = new ArrayList<>();
    private List<String> stringList = new ArrayList<>();

    public List<Integer> getScoreList() {
        return scoreList;
    }

    public EastPlayer(int whistToSouth, int whistToWest) {
        this.whistToSouth = whistToSouth;
        this.whistToWest = whistToWest;
        for (int i = 0; i < 6; i++){
            scoreList.add(0);
            stringList.add("");
        }
    }

    public EastPlayer(int whistToNorth, int whistToSouth, int whistToWest) {
        this.whistToNorth = whistToNorth;
        this.whistToSouth = whistToSouth;
        this.whistToWest = whistToWest;
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

    public String getStringWhistToNorth() {
        return stringWhistToNorth;
    }

    public void setStringWhistToNorth(String stringWhistToNorth) {
        this.stringWhistToNorth = stringWhistToNorth;
    }

    public String getStringWhistToWest() {
        return stringWhistToWest;
    }

    public void setStringWhistToWest(String stringWhistToWest) {
        this.stringWhistToWest = stringWhistToWest;
    }

    public int getWhistToSouth() {
        return whistToSouth;
    }

    public void setWhistToSouth(int whistToSouth) {
        this.whistToSouth = whistToSouth;
    }

    public int getWhistToNorth() {
        return whistToNorth;
    }

    public void setWhistToNorth(int whistToNorth) {
        this.whistToNorth = whistToNorth;
    }

    public int getWhistToWest() {
        return whistToWest;
    }

    public void setWhistToWest(int whistToWest) {
        this.whistToWest = whistToWest;
    }

    public void whistToSouthIncrement (){
        whistToSouth++;
    }

    public void whistToWestIncrement (){
        whistToWest++;
    }

    public void whistToNorthIncrement (){
        whistToNorth++;
    }

    public void addToList(){
        scoreList.clear();
        scoreList.add(getMountScore());
        scoreList.add(getBulletScore());
        scoreList.add(whistToNorth);
        scoreList.add(whistToSouth);
        scoreList.add(whistToWest);
        scoreList.add(0);

        stringList.clear();
        stringList.add(getStringMountScore());
        stringList.add(getStringBulletScore());
        stringList.add(stringWhistToNorth);
        stringList.add(stringWhistToSouth);
        stringList.add(stringWhistToWest);
        stringList.add("");

    }

    public void getFromList(){
        setMountScore(scoreList.get(0));
        setBulletScore(scoreList.get(1));
        whistToNorth = scoreList.get(2);
        whistToSouth = scoreList.get(3);
        whistToWest = scoreList.get(4);

        setStringMountScore(stringList.get(0));
        setStringBulletScore(stringList.get(1));
        stringWhistToNorth = stringList.get(2);
        stringWhistToSouth = stringList.get(3);
        stringWhistToWest = stringList.get(4);
    }
}

