package edu.oney18up.fantasysoccer;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;


/**
 * Created by jarre_000 on 9/20/2015.
 */
public class Team {
    private ArrayList<SoccerPlayer> roster;
    private String teamName;
    private Drawable logo;

    public Team(String name)
    {
        this.teamName = name;
        this.logo = null;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setLogo(String filePath)
    {
        this.logo = Drawable.createFromPath(filePath);
    }

    public Drawable getLogo()
    {
        return logo;
    }

    public ArrayList<SoccerPlayer> getRoster()
    {
        return roster;
    }

    public void addPlayer(SoccerPlayer player)
    {
        roster.add(player);
    }
}
