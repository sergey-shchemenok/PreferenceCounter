package com.example.caelestis.preferencecounter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caelestis on 10.11.2017.
 */

public class WestPlayer  extends Player {
    private int whistToNorth, whistToSouth, whistToEast;
    private String stringWhistToSouth = "", stringWhistToNorth = "", stringWhistToEast = "";
    private List<Integer> scoreList = new ArrayList<>();
    private List<String> stringList = new ArrayList<>();

    public List<Integer> getScoreList() {
        return scoreList;
    }

    public WestPlayer(int whistToSouth, int whistToEast) {
        this.whistToSouth = whistToSouth;
        this.whistToEast = whistToEast;
        for (int i = 0; i < 6; i++){
            scoreList.add(0);
            stringList.add("");
        }
    }

    public WestPlayer(int whistToNorth, int whistToSouth, int whistToEast) {
        this.whistToNorth = whistToNorth;
        this.whistToSouth = whistToSouth;
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

    public String getStringWhistToNorth() {
        return stringWhistToNorth;
    }

    public void setStringWhistToNorth(String stringWhistToNorth) {
        this.stringWhistToNorth = stringWhistToNorth;
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

    public int getWhistToNorth() {
        return whistToNorth;
    }

    public void setWhistToNorth(int whistToNorth) {
        this.whistToNorth = whistToNorth;
    }

    public int getWhistToEast() {
        return whistToEast;
    }

    public void setWhistToEast(int whistToEast) {
        this.whistToEast = whistToEast;
    }

    public void whistToSouthIncrement (){
        whistToSouth++;
    }

    public void whistToNorthIncrement (){
        whistToNorth++;
    }

    public void whistToEastIncrement (){
        whistToEast++;
    }

    public void addToList(){
        scoreList.clear();
        scoreList.add(getMountScore());
        scoreList.add(getBulletScore());
        scoreList.add(whistToNorth);
        scoreList.add(whistToSouth);
        scoreList.add(0);
        scoreList.add(whistToEast);

        stringList.clear();
        stringList.add(getStringMountScore());
        stringList.add(getStringBulletScore());
        stringList.add(stringWhistToNorth);
        stringList.add(stringWhistToSouth);
        stringList.add("");
        stringList.add(stringWhistToEast);

    }

    public void getFromList(){
        setMountScore(scoreList.get(0));
        setBulletScore(scoreList.get(1));
        whistToNorth = scoreList.get(2);
        whistToSouth = scoreList.get(3);
        whistToEast = scoreList.get(5);

        setStringMountScore(stringList.get(0));
        setStringBulletScore(stringList.get(1));
        stringWhistToNorth = stringList.get(2);
        stringWhistToSouth = stringList.get(3);
        stringWhistToEast = stringList.get(5);
    }
}
