package com.example.caelestis.preferencecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int pNumber;
    NorthPlayer nPlayer;
    SouthPlayer sPlayer;
    WestPlayer wPlayer;
    EastPlayer ePlayer;
    TextView errorMessage;

    //North
    TextView northMountScoreView;
    TextView northBulletScoreView;
    TextView northWhistToSouthScoreView;
    TextView northWhistToWestScoreView;
    TextView northWhistToEastScoreView;

    //South
    TextView southMountScoreView;
    TextView southBulletScoreView;
    TextView southWhistToNorthScoreView;
    TextView southWhistToWestScoreView;
    TextView southWhistToEastScoreView;

    //West
    TextView westMountScoreView;
    TextView westBulletScoreView;
    TextView westWhistToNorthScoreView;
    TextView westWhistToSouthScoreView;
    TextView westWhistToEastScoreView;

    //East
    TextView eastMountScoreView;
    TextView eastBulletScoreView;
    TextView eastWhistToNorthScoreView;
    TextView eastWhistToSouthScoreView;
    TextView eastWhistToWestScoreView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nPlayer = new NorthPlayer(0, 0, 0);
        sPlayer = new SouthPlayer(0, 0, 0);
        wPlayer = new WestPlayer(0, 0, 0);
        ePlayer = new EastPlayer(0, 0, 0);
    }

    public void returnBack(View v) {
        setContentView(R.layout.activity_main);
        nPlayer = new NorthPlayer(0, 0, 0);
        sPlayer = new SouthPlayer(0, 0, 0);
        wPlayer = new WestPlayer(0, 0, 0);
        ePlayer = new EastPlayer(0, 0, 0);
    }

    public void goToTwoPlayersActivity(View v) {
        setContentView(R.layout.two_players_activity);
        northMountScoreView = (TextView) findViewById(R.id.north_mount_score);
        northBulletScoreView = (TextView) findViewById(R.id.north_bullet_score);
        northWhistToSouthScoreView = (TextView) findViewById(R.id.north_whistToSouth_score);

        southMountScoreView = (TextView) findViewById(R.id.south_mount_score);
        southBulletScoreView = (TextView) findViewById(R.id.south_bullet_score);
        southWhistToNorthScoreView = (TextView) findViewById(R.id.south_whistToNorth_score);
        pNumber = 2;
        errorMessage = (TextView) findViewById(R.id.error_message);

    }

    public void goToThreePlayersActivity(View v) {
        setContentView(R.layout.three_players_activity);
        southMountScoreView = (TextView) findViewById(R.id.south_mount_score);
        southBulletScoreView = (TextView) findViewById(R.id.south_bullet_score);
        southWhistToWestScoreView = (TextView) findViewById(R.id.south_whistToWest_score);
        southWhistToEastScoreView = (TextView) findViewById(R.id.south_whistToEast_score);

        westMountScoreView = (TextView) findViewById(R.id.west_mount_score);
        westBulletScoreView = (TextView) findViewById(R.id.west_bullet_score);
        westWhistToSouthScoreView = (TextView) findViewById(R.id.west_whistToSouth_score);
        westWhistToEastScoreView = (TextView) findViewById(R.id.west_whistToEast_score);

        eastMountScoreView = (TextView) findViewById(R.id.east_mount_score);
        eastBulletScoreView = (TextView) findViewById(R.id.east_bullet_score);
        eastWhistToWestScoreView = (TextView) findViewById(R.id.east_whistToWest_score);
        eastWhistToSouthScoreView = (TextView) findViewById(R.id.east_whistToSouth_score);
        pNumber = 3;
        errorMessage = (TextView) findViewById(R.id.error_message);
    }

    public void goToFourPlayersActivity(View v) {
        setContentView(R.layout.four_players_activity);
        northMountScoreView = (TextView) findViewById(R.id.north_mount_score);
        northBulletScoreView = (TextView) findViewById(R.id.north_bullet_score);
        northWhistToSouthScoreView = (TextView) findViewById(R.id.north_whistToSouth_score);
        //northWhistToWestScoreView = (TextView) findViewById(R.id.north_whistToWest_score);
        //northWhistToEastScoreView = (TextView) findViewById(R.id.north_whistToEast_score);

        southMountScoreView = (TextView) findViewById(R.id.south_mount_score);
        southBulletScoreView = (TextView) findViewById(R.id.south_bullet_score);
        southWhistToNorthScoreView = (TextView) findViewById(R.id.south_whistToNorth_score);
        southWhistToWestScoreView = (TextView) findViewById(R.id.south_whistToWest_score);
        southWhistToEastScoreView = (TextView) findViewById(R.id.south_whistToEast_score);

        westMountScoreView = (TextView) findViewById(R.id.west_mount_score);
        westBulletScoreView = (TextView) findViewById(R.id.west_bullet_score);
        //westWhistToNorthScoreView = (TextView) findViewById(R.id.west_whistToNorth_score);
        westWhistToSouthScoreView = (TextView) findViewById(R.id.west_whistToSouth_score);
        westWhistToEastScoreView = (TextView) findViewById(R.id.west_whistToEast_score);

        eastMountScoreView = (TextView) findViewById(R.id.east_mount_score);
        eastBulletScoreView = (TextView) findViewById(R.id.east_bullet_score);
        //eastWhistToNorthScoreView = (TextView) findViewById(R.id.east_whistToNorth_score);
        eastWhistToWestScoreView = (TextView) findViewById(R.id.east_whistToWest_score);
        eastWhistToSouthScoreView = (TextView) findViewById(R.id.east_whistToSouth_score);
        pNumber = 4;
        errorMessage = (TextView) findViewById(R.id.error_message);
    }

    //This method completes the game stage, saves the previous result and counts the scores
    public void confirmScore(View v) {
        TextView northScoreView = (TextView) findViewById(R.id.north_score);
        TextView southScoreView = (TextView) findViewById(R.id.south_score);
        TextView westScoreView = (TextView) findViewById(R.id.west_score);
        TextView eastScoreView = (TextView) findViewById(R.id.east_score);

        int nPlayerMountScore = nPlayer.getMountScore();
        int nPlayerBulletScore = nPlayer.getBulletScore();
        int nPlayerWhistToSouthScore = nPlayer.getWhistToSouth();
        int nPlayerWhistToWestScore = nPlayer.getWhistToWest();
        int nPlayerWhistToEastScore = nPlayer.getWhistToEast();
        String nPlayerStringMountScore = nPlayer.getStringMountScore();
        String nPlayerStringBulletScore = nPlayer.getStringBulletScore();
        String nPlayerStringWhistToSouthScore = nPlayer.getStringWhistToSouth();
        String nPlayerStringWhistToWestScore = nPlayer.getStringWhistToWest();
        String nPlayerStringWhistToEastScore = nPlayer.getStringWhistToEast();

        int sPlayerMountScore = sPlayer.getMountScore();
        int sPlayerBulletScore = sPlayer.getBulletScore();
        int sPlayerWhistToNorthScore = sPlayer.getWhistToNorth();
        int sPlayerWhistToWestScore = sPlayer.getWhistToWest();
        int sPlayerWhistToEastScore = sPlayer.getWhistToEast();
        String sPlayerStringMountScore = sPlayer.getStringMountScore();
        String sPlayerStringBulletScore = sPlayer.getStringBulletScore();
        String sPlayerStringWhistToNorthScore = sPlayer.getStringWhistToNorth();
        String sPlayerStringWhistToWestScore = sPlayer.getStringWhistToWest();
        String sPlayerStringWhistToEastScore = sPlayer.getStringWhistToEast();

        int wPlayerMountScore = wPlayer.getMountScore();
        int wPlayerBulletScore = wPlayer.getBulletScore();
        int wPlayerWhistToNorthScore = wPlayer.getWhistToNorth();
        int wPlayerWhistToSouthScore = wPlayer.getWhistToSouth();
        int wPlayerWhistToEastScore = wPlayer.getWhistToEast();
        String wPlayerStringMountScore = wPlayer.getStringMountScore();
        String wPlayerStringBulletScore = wPlayer.getStringBulletScore();
        String wPlayerStringWhistToNorthScore = wPlayer.getStringWhistToNorth();
        String wPlayerStringWhistToSouthScore = wPlayer.getStringWhistToSouth();
        String wPlayerStringWhistToEastScore = wPlayer.getStringWhistToEast();

        int ePlayerMountScore = ePlayer.getMountScore();
        int ePlayerBulletScore = ePlayer.getBulletScore();
        int ePlayerWhistToNorthScore = ePlayer.getWhistToNorth();
        int ePlayerWhistToSouthScore = ePlayer.getWhistToSouth();
        int ePlayerWhistToWestScore = ePlayer.getWhistToWest();
        String ePlayerStringMountScore = ePlayer.getStringMountScore();
        String ePlayerStringBulletScore = ePlayer.getStringBulletScore();
        String ePlayerStringWhistToNorthScore = ePlayer.getStringWhistToNorth();
        String ePlayerStringWhistToSouthScore = ePlayer.getStringWhistToSouth();
        String ePlayerStringWhistToWestScore = ePlayer.getStringWhistToWest();


        //North
        if (nPlayer.getScoreList().get(0) != nPlayerMountScore) {
            if (nPlayerStringMountScore.length() < 10) {
                nPlayerStringMountScore += nPlayerMountScore + "|";
                nPlayer.setStringMountScore(nPlayerStringMountScore);
            } else {
                while (true) {
                    if (nPlayerStringMountScore.indexOf("|") != 0) {
                        nPlayerStringMountScore = nPlayerStringMountScore.substring(1);
                    } else
                        break;
                }
                nPlayerStringMountScore += nPlayerMountScore + "|";
                nPlayerStringMountScore = nPlayerStringMountScore.substring(1);
                nPlayer.setStringMountScore(nPlayerStringMountScore);
            }
        }

        if (nPlayer.getScoreList().get(1) != nPlayerBulletScore) {
            if (nPlayerStringBulletScore.length() < 10) {
                nPlayerStringBulletScore += nPlayerBulletScore + "|";
                nPlayer.setStringBulletScore(nPlayerStringBulletScore);
            } else {
                while (true) {
                    if (nPlayerStringBulletScore.indexOf("|") != 0) {
                        nPlayerStringBulletScore = nPlayerStringBulletScore.substring(1);
                    } else
                        break;
                }
                nPlayerStringBulletScore += nPlayerBulletScore + "|";
                nPlayerStringBulletScore = nPlayerStringBulletScore.substring(1);
                nPlayer.setStringBulletScore(nPlayerStringBulletScore);
            }
        }

        if (nPlayer.getScoreList().get(3) != nPlayerWhistToSouthScore) {
            if (nPlayerStringWhistToSouthScore.length() < 10) {
                nPlayerStringWhistToSouthScore += nPlayerWhistToSouthScore + "|";
                nPlayer.setStringWhistToSouth(nPlayerStringWhistToSouthScore);
            } else {
                while (true) {
                    if (nPlayerStringWhistToSouthScore.indexOf("|") != 0) {
                        nPlayerStringWhistToSouthScore = nPlayerStringWhistToSouthScore.substring(1);
                    } else
                        break;
                }
                nPlayerStringWhistToSouthScore += nPlayerWhistToSouthScore + "|";
                nPlayerStringWhistToSouthScore = nPlayerStringWhistToSouthScore.substring(1);
                nPlayer.setStringWhistToSouth(nPlayerStringWhistToSouthScore);
            }
        }

        if (nPlayer.getScoreList().get(4) != nPlayerWhistToWestScore) {
            if (nPlayerStringWhistToWestScore.length() < 10) {
                nPlayerStringWhistToWestScore += nPlayerWhistToWestScore + "|";
                nPlayer.setStringWhistToWest(nPlayerStringWhistToWestScore);
            } else {
                while (true) {
                    if (nPlayerStringWhistToWestScore.indexOf("|") != 0) {
                        nPlayerStringWhistToWestScore = nPlayerStringWhistToWestScore.substring(1);
                    } else
                        break;
                }
                nPlayerStringWhistToWestScore += nPlayerWhistToWestScore + "|";
                nPlayerStringWhistToWestScore = nPlayerStringWhistToWestScore.substring(1);
                nPlayer.setStringWhistToWest(nPlayerStringWhistToWestScore);
            }
        }

        if (nPlayer.getScoreList().get(5) != nPlayerWhistToEastScore) {
            if (nPlayerStringWhistToEastScore.length() < 10) {
                nPlayerStringWhistToEastScore += nPlayerWhistToEastScore + "|";
                nPlayer.setStringWhistToEast(nPlayerStringWhistToEastScore);
            } else {
                while (true) {
                    if (nPlayerStringWhistToEastScore.indexOf("|") != 0) {
                        nPlayerStringWhistToEastScore = nPlayerStringWhistToEastScore.substring(1);
                    } else
                        break;
                }
                nPlayerStringWhistToEastScore += nPlayerWhistToEastScore + "|";
                nPlayerStringWhistToEastScore = nPlayerStringWhistToEastScore.substring(1);
                nPlayer.setStringWhistToEast(nPlayerStringWhistToEastScore);
            }
        }

        //South
        if (sPlayer.getScoreList().get(0) != sPlayerMountScore) {
            if (sPlayerStringMountScore.length() < 10) {
                sPlayerStringMountScore += sPlayerMountScore + "|";
                sPlayer.setStringMountScore(sPlayerStringMountScore);
            } else {
                while (true) {
                    if (sPlayerStringMountScore.indexOf("|") != 0) {
                        sPlayerStringMountScore = sPlayerStringMountScore.substring(1);
                    } else
                        break;
                }
                sPlayerStringMountScore += sPlayerMountScore + "|";
                sPlayerStringMountScore = sPlayerStringMountScore.substring(1);
                sPlayer.setStringMountScore(sPlayerStringMountScore);
            }
        }

        if (sPlayer.getScoreList().get(1) != sPlayerBulletScore) {
            if (sPlayerStringBulletScore.length() < 10) {
                sPlayerStringBulletScore += sPlayerBulletScore + "|";
                sPlayer.setStringBulletScore(sPlayerStringBulletScore);
            } else {
                while (true) {
                    if (sPlayerStringBulletScore.indexOf("|") != 0) {
                        sPlayerStringBulletScore = sPlayerStringBulletScore.substring(1);
                    } else
                        break;
                }
                sPlayerStringBulletScore += sPlayerBulletScore + "|";
                sPlayerStringBulletScore = sPlayerStringBulletScore.substring(1);
                sPlayer.setStringBulletScore(sPlayerStringBulletScore);
            }
        }

        if (sPlayer.getScoreList().get(2) != sPlayerWhistToNorthScore) {
            if (sPlayerStringWhistToNorthScore.length() < 10) {
                sPlayerStringWhistToNorthScore += sPlayerWhistToNorthScore + "|";
                sPlayer.setStringWhistToNorth(sPlayerStringWhistToNorthScore);
            } else {
                while (true) {
                    if (sPlayerStringWhistToNorthScore.indexOf("|") != 0) {
                        sPlayerStringWhistToNorthScore = sPlayerStringWhistToNorthScore.substring(1);
                    } else
                        break;
                }
                sPlayerStringWhistToNorthScore += sPlayerWhistToNorthScore + "|";
                sPlayerStringWhistToNorthScore = sPlayerStringWhistToNorthScore.substring(1);
                sPlayer.setStringWhistToNorth(sPlayerStringWhistToNorthScore);
            }
        }

        if (sPlayer.getScoreList().get(4) != sPlayerWhistToWestScore) {
            if (sPlayerStringWhistToWestScore.length() < 10) {
                sPlayerStringWhistToWestScore += sPlayerWhistToWestScore + "|";
                sPlayer.setStringWhistToWest(sPlayerStringWhistToWestScore);
            } else {
                while (true) {
                    if (sPlayerStringWhistToWestScore.indexOf("|") != 0) {
                        sPlayerStringWhistToWestScore = sPlayerStringWhistToWestScore.substring(1);
                    } else
                        break;
                }
                sPlayerStringWhistToWestScore += sPlayerWhistToWestScore + "|";
                sPlayerStringWhistToWestScore = sPlayerStringWhistToWestScore.substring(1);
                sPlayer.setStringWhistToWest(sPlayerStringWhistToWestScore);
            }
        }

        if (sPlayer.getScoreList().get(5) != sPlayerWhistToEastScore) {
            if (sPlayerStringWhistToEastScore.length() < 10) {
                sPlayerStringWhistToEastScore += sPlayerWhistToEastScore + "|";
                sPlayer.setStringWhistToEast(sPlayerStringWhistToEastScore);
            } else {
                while (true) {
                    if (sPlayerStringWhistToEastScore.indexOf("|") != 0) {
                        sPlayerStringWhistToEastScore = sPlayerStringWhistToEastScore.substring(1);
                    } else
                        break;
                }
                sPlayerStringWhistToEastScore += sPlayerWhistToEastScore + "|";
                sPlayerStringWhistToEastScore = sPlayerStringWhistToEastScore.substring(1);
                sPlayer.setStringWhistToEast(sPlayerStringWhistToEastScore);
            }
        }

        //West
        if (wPlayer.getScoreList().get(0) != wPlayerMountScore) {
            if (wPlayerStringMountScore.length() < 10) {
                wPlayerStringMountScore += wPlayerMountScore + "|";
                wPlayer.setStringMountScore(wPlayerStringMountScore);
            } else {
                while (true) {
                    if (wPlayerStringMountScore.indexOf("|") != 0) {
                        wPlayerStringMountScore = wPlayerStringMountScore.substring(1);
                    } else
                        break;
                }
                wPlayerStringMountScore += wPlayerMountScore + "|";
                wPlayerStringMountScore = wPlayerStringMountScore.substring(1);
                wPlayer.setStringMountScore(wPlayerStringMountScore);
            }
        }

        if (wPlayer.getScoreList().get(1) != wPlayerBulletScore) {
            if (wPlayerStringBulletScore.length() < 10) {
                wPlayerStringBulletScore += wPlayerBulletScore + "|";
                wPlayer.setStringBulletScore(wPlayerStringBulletScore);
            } else {
                while (true) {
                    if (wPlayerStringBulletScore.indexOf("|") != 0) {
                        wPlayerStringBulletScore = wPlayerStringBulletScore.substring(1);
                    } else
                        break;
                }
                wPlayerStringBulletScore += wPlayerBulletScore + "|";
                wPlayerStringBulletScore = wPlayerStringBulletScore.substring(1);
                wPlayer.setStringBulletScore(wPlayerStringBulletScore);
            }
        }

        if (wPlayer.getScoreList().get(2) != wPlayerWhistToNorthScore) {
            if (wPlayerStringWhistToNorthScore.length() < 10) {
                wPlayerStringWhistToNorthScore += wPlayerWhistToNorthScore + "|";
                wPlayer.setStringWhistToNorth(wPlayerStringWhistToNorthScore);
            } else {
                while (true) {
                    if (wPlayerStringWhistToNorthScore.indexOf("|") != 0) {
                        wPlayerStringWhistToNorthScore = wPlayerStringWhistToNorthScore.substring(1);
                    } else
                        break;
                }
                wPlayerStringWhistToNorthScore += wPlayerWhistToNorthScore + "|";
                wPlayerStringWhistToNorthScore = wPlayerStringWhistToNorthScore.substring(1);
                wPlayer.setStringWhistToNorth(wPlayerStringWhistToNorthScore);
            }
        }

        if (wPlayer.getScoreList().get(3) != wPlayerWhistToSouthScore) {
            if (wPlayerStringWhistToSouthScore.length() < 10) {
                wPlayerStringWhistToSouthScore += wPlayerWhistToSouthScore + "|";
                wPlayer.setStringWhistToSouth(wPlayerStringWhistToSouthScore);
            } else {
                while (true) {
                    if (wPlayerStringWhistToSouthScore.indexOf("|") != 0) {
                        wPlayerStringWhistToSouthScore = wPlayerStringWhistToSouthScore.substring(1);
                    } else
                        break;
                }
                wPlayerStringWhistToSouthScore += wPlayerWhistToSouthScore + "|";
                wPlayerStringWhistToSouthScore = wPlayerStringWhistToSouthScore.substring(1);
                wPlayer.setStringWhistToSouth(wPlayerStringWhistToSouthScore);
            }
        }

        if (wPlayer.getScoreList().get(5) != wPlayerWhistToEastScore) {
            if (wPlayerStringWhistToEastScore.length() < 10) {
                wPlayerStringWhistToEastScore += wPlayerWhistToEastScore + "|";
                wPlayer.setStringWhistToEast(wPlayerStringWhistToEastScore);
            } else {
                while (true) {
                    if (wPlayerStringWhistToEastScore.indexOf("|") != 0) {
                        wPlayerStringWhistToEastScore = wPlayerStringWhistToEastScore.substring(1);
                    } else
                        break;
                }
                wPlayerStringWhistToEastScore += wPlayerWhistToEastScore + "|";
                wPlayerStringWhistToEastScore = wPlayerStringWhistToEastScore.substring(1);
                wPlayer.setStringWhistToEast(wPlayerStringWhistToEastScore);
            }
        }

        //East
        if (ePlayer.getScoreList().get(0) != ePlayerMountScore) {
            if (ePlayerStringMountScore.length() < 10) {
                ePlayerStringMountScore += ePlayerMountScore + "|";
                ePlayer.setStringMountScore(ePlayerStringMountScore);
            } else {
                while (true) {
                    if (ePlayerStringMountScore.indexOf("|") != 0) {
                        ePlayerStringMountScore = ePlayerStringMountScore.substring(1);
                    } else
                        break;
                }
                ePlayerStringMountScore += ePlayerMountScore + "|";
                ePlayerStringMountScore = ePlayerStringMountScore.substring(1);
                ePlayer.setStringMountScore(ePlayerStringMountScore);
            }
        }

        if (ePlayer.getScoreList().get(1) != ePlayerBulletScore) {
            if (ePlayerStringBulletScore.length() < 10) {
                ePlayerStringBulletScore += ePlayerBulletScore + "|";
                ePlayer.setStringBulletScore(ePlayerStringBulletScore);
            } else {
                while (true) {
                    if (ePlayerStringBulletScore.indexOf("|") != 0) {
                        ePlayerStringBulletScore = ePlayerStringBulletScore.substring(1);
                    } else
                        break;
                }
                ePlayerStringBulletScore += ePlayerBulletScore + "|";
                ePlayerStringBulletScore = ePlayerStringBulletScore.substring(1);
                ePlayer.setStringBulletScore(ePlayerStringBulletScore);
            }
        }

        if (ePlayer.getScoreList().get(2) != ePlayerWhistToNorthScore) {
            if (ePlayerStringWhistToNorthScore.length() < 10) {
                ePlayerStringWhistToNorthScore += ePlayerWhistToNorthScore + "|";
                ePlayer.setStringWhistToNorth(ePlayerStringWhistToNorthScore);
            } else {
                while (true) {
                    if (ePlayerStringWhistToNorthScore.indexOf("|") != 0) {
                        ePlayerStringWhistToNorthScore = ePlayerStringWhistToNorthScore.substring(1);
                    } else
                        break;
                }
                ePlayerStringWhistToNorthScore += ePlayerWhistToNorthScore + "|";
                ePlayerStringWhistToNorthScore = ePlayerStringWhistToNorthScore.substring(1);
                ePlayer.setStringWhistToNorth(ePlayerStringWhistToNorthScore);
            }
        }

        if (ePlayer.getScoreList().get(3) != ePlayerWhistToSouthScore) {
            if (ePlayerStringWhistToSouthScore.length() < 10) {
                ePlayerStringWhistToSouthScore += ePlayerWhistToSouthScore + "|";
                ePlayer.setStringWhistToSouth(ePlayerStringWhistToSouthScore);
            } else {
                while (true) {
                    if (ePlayerStringWhistToSouthScore.indexOf("|") != 0) {
                        ePlayerStringWhistToSouthScore = ePlayerStringWhistToSouthScore.substring(1);
                    } else
                        break;
                }
                ePlayerStringWhistToSouthScore += ePlayerWhistToSouthScore + "|";
                ePlayerStringWhistToSouthScore = ePlayerStringWhistToSouthScore.substring(1);
                ePlayer.setStringWhistToSouth(ePlayerStringWhistToSouthScore);
            }
        }

        if (ePlayer.getScoreList().get(4) != ePlayerWhistToWestScore) {
            if (ePlayerStringWhistToWestScore.length() < 10) {
                ePlayerStringWhistToWestScore += ePlayerWhistToWestScore + "|";
                ePlayer.setStringWhistToWest(ePlayerStringWhistToWestScore);
            } else {
                while (true) {
                    if (ePlayerStringWhistToWestScore.indexOf("|") != 0) {
                        ePlayerStringWhistToWestScore = ePlayerStringWhistToWestScore.substring(1);
                    } else
                        break;
                }
                ePlayerStringWhistToWestScore += ePlayerWhistToWestScore + "|";
                ePlayerStringWhistToWestScore = ePlayerStringWhistToWestScore.substring(1);
                ePlayer.setStringWhistToWest(ePlayerStringWhistToWestScore);
            }
        }


        //Score counting
        int maxBulletScore = Math.max(Math.max(nPlayerBulletScore, sPlayerBulletScore), Math.max(wPlayerBulletScore, ePlayerBulletScore));
        nPlayerMountScore += maxBulletScore - nPlayerBulletScore;
        sPlayerMountScore += maxBulletScore - sPlayerBulletScore;
        wPlayerMountScore += maxBulletScore - wPlayerBulletScore;
        ePlayerMountScore += maxBulletScore - ePlayerBulletScore;


        int minMountScore = Math.min(Math.min(nPlayerMountScore, sPlayerMountScore), Math.min(wPlayerMountScore, ePlayerMountScore));
        nPlayerMountScore -= minMountScore;
        sPlayerMountScore -= minMountScore;
        wPlayerMountScore -= minMountScore;
        ePlayerMountScore -= minMountScore;

        int nPlayerScore;
        int sPlayerScore;
        int wPlayerScore;
        int ePlayerScore;

        if (pNumber == 2) {
            Double nPlayerMS = ((nPlayerMountScore + sPlayerMountScore) / 2.0 - nPlayerMountScore) * 10;
            Double sPlayerMS = ((nPlayerMountScore + sPlayerMountScore) / 2.0 - sPlayerMountScore) * 10;

            nPlayerScore = (int) Math.round(nPlayerMS + nPlayerWhistToSouthScore - sPlayerWhistToNorthScore);
            sPlayerScore = (int) Math.round(sPlayerMS + sPlayerWhistToNorthScore - nPlayerWhistToSouthScore);

            if ((nPlayerScore + sPlayerScore) == 0) {
                nPlayer.setScore(nPlayerScore);
                sPlayer.setScore(sPlayerScore);
                northScoreView.setText(String.valueOf(nPlayerScore));
                southScoreView.setText(String.valueOf(sPlayerScore));

                nPlayer.addToList();
                sPlayer.addToList();
            }

        } else if (pNumber == 3) {
            Double sPlayerMS = ((sPlayerMountScore + wPlayerMountScore + ePlayerMountScore) / 3.0 - sPlayerMountScore) * 10;
            Double wPlayerMS = ((sPlayerMountScore + wPlayerMountScore + ePlayerMountScore) / 3.0 - wPlayerMountScore) * 10;
            Double ePlayerMS = ((sPlayerMountScore + wPlayerMountScore + ePlayerMountScore) / 3.0 - ePlayerMountScore) * 10;

            sPlayerScore = (int) Math.round(sPlayerMS + sPlayerWhistToWestScore + sPlayerWhistToEastScore - wPlayerWhistToSouthScore - ePlayerWhistToSouthScore);
            wPlayerScore = (int) Math.round(wPlayerMS + wPlayerWhistToSouthScore + wPlayerWhistToEastScore - sPlayerWhistToWestScore - ePlayerWhistToWestScore);
            ePlayerScore = (int) Math.round(ePlayerMS + ePlayerWhistToWestScore + ePlayerWhistToSouthScore - wPlayerWhistToEastScore - sPlayerWhistToEastScore);

            if ((sPlayerScore + wPlayerScore + ePlayerScore) == 0) {
                ePlayer.setScore(ePlayerScore);
                sPlayer.setScore(sPlayerScore);
                wPlayer.setScore(wPlayerScore);

                southScoreView.setText(String.valueOf(sPlayerScore));
                westScoreView.setText(String.valueOf(wPlayerScore));
                eastScoreView.setText(String.valueOf(ePlayerScore));

                sPlayer.addToList();
                wPlayer.addToList();
                ePlayer.addToList();
            } else {

                if (pNumber == 2) {
                    nPlayer.getFromList();
                    sPlayer.getFromList();
                    northMountScoreView.setText(nPlayer.getStringMountScore());
                    northBulletScoreView.setText(nPlayer.getStringBulletScore());
                    northWhistToSouthScoreView.setText(nPlayer.getStringWhistToSouth());
                    southMountScoreView.setText(sPlayer.getStringMountScore());
                    southBulletScoreView.setText(sPlayer.getStringBulletScore());
                    southWhistToNorthScoreView.setText(sPlayer.getStringWhistToNorth());
                }

                if (pNumber == 3) {
                    sPlayer.getFromList();
                    wPlayer.getFromList();
                    ePlayer.getFromList();
                    southMountScoreView.setText(sPlayer.getStringMountScore());
                    southBulletScoreView.setText(sPlayer.getStringBulletScore());
                    southWhistToWestScoreView.setText(sPlayer.getStringWhistToWest());
                    southWhistToEastScoreView.setText(sPlayer.getStringWhistToEast());
                    westMountScoreView.setText(wPlayer.getStringMountScore());
                    westBulletScoreView.setText(wPlayer.getStringBulletScore());
                    westWhistToSouthScoreView.setText(wPlayer.getStringWhistToSouth());
                    westWhistToEastScoreView.setText(wPlayer.getStringWhistToEast());
                    eastMountScoreView.setText(ePlayer.getStringMountScore());
                    eastBulletScoreView.setText(ePlayer.getStringBulletScore());
                    eastWhistToWestScoreView.setText(ePlayer.getStringWhistToWest());
                    eastWhistToSouthScoreView.setText(ePlayer.getStringWhistToSouth());
                }

                errorMessage.setText("Points are not correct \nfor a real game, try again!");

            }
        }

    }

    public void ResetThisGame(View v) {
        errorMessage.setText("");
        if (pNumber == 2) {
            nPlayer.getFromList();
            sPlayer.getFromList();
            northMountScoreView.setText(nPlayer.getStringMountScore());
            northBulletScoreView.setText(nPlayer.getStringBulletScore());
            northWhistToSouthScoreView.setText(nPlayer.getStringWhistToSouth());
            southMountScoreView.setText(sPlayer.getStringMountScore());
            southBulletScoreView.setText(sPlayer.getStringBulletScore());
            southWhistToNorthScoreView.setText(sPlayer.getStringWhistToNorth());
        }

        if (pNumber == 3) {
            sPlayer.getFromList();
            wPlayer.getFromList();
            ePlayer.getFromList();
            southMountScoreView.setText(sPlayer.getStringMountScore());
            southBulletScoreView.setText(sPlayer.getStringBulletScore());
            southWhistToWestScoreView.setText(sPlayer.getStringWhistToWest());
            southWhistToEastScoreView.setText(sPlayer.getStringWhistToEast());
            westMountScoreView.setText(wPlayer.getStringMountScore());
            westBulletScoreView.setText(wPlayer.getStringBulletScore());
            westWhistToSouthScoreView.setText(wPlayer.getStringWhistToSouth());
            westWhistToEastScoreView.setText(wPlayer.getStringWhistToEast());
            eastMountScoreView.setText(ePlayer.getStringMountScore());
            eastBulletScoreView.setText(ePlayer.getStringBulletScore());
            eastWhistToWestScoreView.setText(ePlayer.getStringWhistToWest());
            eastWhistToSouthScoreView.setText(ePlayer.getStringWhistToSouth());
        }

    }


    //NorthPlayer methods

    public void northMountIncrement(View v) {
        errorMessage.setText("");
        nPlayer.mountIncrement();
        northMountScoreView.setText(String.valueOf(nPlayer.getStringMountScore() + "..." + nPlayer.getMountScore()));
    }

    public void northBulletIncrement(View v) {
        errorMessage.setText("");
        nPlayer.bulletIncrement();
        northBulletScoreView.setText(String.valueOf(nPlayer.getStringBulletScore() + "..." + nPlayer.getBulletScore()));
    }

    public void northWhistToSouthIncrement(View v) {
        errorMessage.setText("");
        nPlayer.whistToSouthIncrement();
        northWhistToSouthScoreView.setText(String.valueOf(nPlayer.getStringWhistToSouth() + "..." + nPlayer.getWhistToSouth()));
    }


    //SouthPlayer methods
    public void southMountIncrement(View v) {
        errorMessage.setText("");
        sPlayer.mountIncrement();
        southMountScoreView.setText(String.valueOf(sPlayer.getStringMountScore() + "..." + sPlayer.getMountScore()));
    }

    public void southBulletIncrement(View v) {
        errorMessage.setText("");
        sPlayer.bulletIncrement();
        southBulletScoreView.setText(String.valueOf(sPlayer.getStringBulletScore() + "..." + sPlayer.getBulletScore()));

    }

    public void southWhistToNorthIncrement(View v) {
        errorMessage.setText("");
        sPlayer.whistToNorthIncrement();
        southWhistToNorthScoreView.setText(String.valueOf(sPlayer.getStringWhistToNorth() + "..." + sPlayer.getWhistToNorth()));

    }

    public void southWhistToWestIncrement(View v) {
        errorMessage.setText("");
        sPlayer.whistToWestIncrement();
        southWhistToWestScoreView.setText(String.valueOf(sPlayer.getStringWhistToWest() + "..." + sPlayer.getWhistToWest()));

    }

    public void southWhistToEastIncrement(View v) {
        errorMessage.setText("");
        sPlayer.whistToEastIncrement();
        southWhistToEastScoreView.setText(String.valueOf(sPlayer.getStringWhistToEast() + "..." + sPlayer.getWhistToEast()));

    }

    //WestPlayer methods
    public void westMountIncrement(View v) {
        errorMessage.setText("");
        wPlayer.mountIncrement();
        westMountScoreView.setText(String.valueOf(wPlayer.getStringMountScore() + "..." + wPlayer.getMountScore()));
    }

    public void westBulletIncrement(View v) {
        errorMessage.setText("");
        wPlayer.bulletIncrement();
        westBulletScoreView.setText(String.valueOf(wPlayer.getStringBulletScore() + "..." + wPlayer.getBulletScore()));

    }

    public void westWhistToSouthIncrement(View v) {
        errorMessage.setText("");
        wPlayer.whistToSouthIncrement();
        westWhistToSouthScoreView.setText(String.valueOf(wPlayer.getStringWhistToSouth() + "..." + wPlayer.getWhistToSouth()));

    }

    public void westWhistToEastIncrement(View v) {
        errorMessage.setText("");
        wPlayer.whistToEastIncrement();
        westWhistToEastScoreView.setText(String.valueOf(wPlayer.getStringWhistToEast() + "..." + wPlayer.getWhistToEast()));

    }

    public void westWhistToNorthIncrement(View v) {
        errorMessage.setText("");
        wPlayer.whistToNorthIncrement();
        westWhistToNorthScoreView.setText(String.valueOf(wPlayer.getStringWhistToNorth() + "..." + wPlayer.getWhistToNorth()));

    }


    //EastPlayer methods
    public void eastMountIncrement(View v) {
        errorMessage.setText("");
        ePlayer.mountIncrement();
        eastMountScoreView.setText(String.valueOf(ePlayer.getStringMountScore() + "..." + ePlayer.getMountScore()));
    }

    public void eastBulletIncrement(View v) {
        errorMessage.setText("");
        ePlayer.bulletIncrement();
        eastBulletScoreView.setText(String.valueOf(ePlayer.getStringBulletScore() + "..." + ePlayer.getBulletScore()));

    }

    public void eastWhistToNorthIncrement(View v) {
        errorMessage.setText("");
        ePlayer.whistToNorthIncrement();
        eastWhistToNorthScoreView.setText(String.valueOf(ePlayer.getStringWhistToNorth() + "..." + ePlayer.getWhistToNorth()));

    }

    public void eastWhistToWestIncrement(View v) {
        errorMessage.setText("");
        ePlayer.whistToWestIncrement();
        eastWhistToWestScoreView.setText(String.valueOf(ePlayer.getStringWhistToWest() + "..." + ePlayer.getWhistToWest()));

    }

    public void eastWhistToSouthIncrement(View v) {
        errorMessage.setText("");
        ePlayer.whistToSouthIncrement();
        eastWhistToSouthScoreView.setText(String.valueOf(ePlayer.getStringWhistToSouth() + "..." + ePlayer.getWhistToSouth()));

    }


}
