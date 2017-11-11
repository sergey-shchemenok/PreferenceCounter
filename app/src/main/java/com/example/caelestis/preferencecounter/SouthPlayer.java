package com.example.caelestis.preferencecounter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caelestis on 10.11.2017.
 */

public class SouthPlayer  extends Player {
    private int whistToNorth, whistToWest, whistToEast;
    private String stringWhistToNorth = "", stringWhistToWest = "", stringWhistToEast = "";
    private List<Integer> scoreList = new ArrayList<>();
    private List<String> stringList = new ArrayList<>();

    public List<Integer> getScoreList() {
        return scoreList;

    }

    public SouthPlayer(int whistToNorth) {
        this.whistToNorth = whistToNorth;
        for (int i = 0; i < 6; i++){
            scoreList.add(0);
            stringList.add("");
        }
    }

    public SouthPlayer(int whistToWest, int whistToEast) {
        this.whistToWest = whistToWest;
        this.whistToEast = whistToEast;
        for (int i = 0; i < 6; i++){
            scoreList.add(0);
            stringList.add("");
        }
    }

    public SouthPlayer(int whistToNorth, int whistToWest, int whistToEast) {
        this.whistToNorth = whistToNorth;
        this.whistToWest = whistToWest;
        this.whistToEast = whistToEast;
        for (int i = 0; i < 6; i++){
            scoreList.add(0);
            stringList.add("");
        }
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

    public String getStringWhistToEast() {
        return stringWhistToEast;
    }

    public void setStringWhistToEast(String stringWhistToEast) {
        this.stringWhistToEast = stringWhistToEast;
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

    public int getWhistToEast() {
        return whistToEast;
    }

    public void setWhistToEast(int whistToEast) {
        this.whistToEast = whistToEast;
    }

    //***



    public void whistToNorthIncrement (){
        whistToNorth++;
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
        scoreList.add(whistToNorth);
        scoreList.add(0);
        scoreList.add(whistToWest);
        scoreList.add(whistToEast);

        stringList.clear();
        stringList.add(getStringMountScore());
        stringList.add(getStringBulletScore());
        stringList.add(stringWhistToNorth);
        stringList.add("");
        stringList.add(stringWhistToWest);
        stringList.add(stringWhistToEast);

    }

    public void getFromList(){
        setMountScore(scoreList.get(0));
        setBulletScore(scoreList.get(1));
        whistToNorth = scoreList.get(2);
        whistToWest = scoreList.get(4);
        whistToEast = scoreList.get(5);

        setStringMountScore(stringList.get(0));
        setStringBulletScore(stringList.get(1));
        stringWhistToNorth = stringList.get(2);
        stringWhistToWest = stringList.get(4);
        stringWhistToEast = stringList.get(5);

    }

}
