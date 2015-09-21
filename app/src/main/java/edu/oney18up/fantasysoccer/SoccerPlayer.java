package edu.oney18up.fantasysoccer;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by jarre_000 on 9/20/2015.
 */
public class SoccerPlayer {
    private String name;
    private String team;
    private int speed;
    private int agility;
    private int power;
    private int skill;
    private String position;
    private Drawable pic;

    public SoccerPlayer(String name, String team, int speed, int agility,
                        int power, int skill, String position)
    {
        this.name = name;
        this.team = team;
        this.speed = speed;
        this.agility = agility;
        this.power = power;
        this.skill = skill;
        this.position = position;
        this.pic = null;

    }

    public void setTeam(String teamName)
    {
        this.team = teamName;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setPicID(String filePath)
    {
        this.pic = Drawable.createFromPath(filePath);
    }

    public String getName()
    {
        return name;
    }

    public String getTeam()
    {
        return team;
    }

    public Drawable getPic()
    {
        return pic;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getAgility()
    {
        return agility;
    }

    public int getPower()
    {
        return power;
    }

    public int getSkill()
    {
        return skill;
    }

    public String getPosition()
    {
        return position;
    }
}