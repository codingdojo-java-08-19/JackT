package com.codingdojo.web.models;
import com.codingdojo.web.models.Player;
import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players = new ArrayList<Player>();
	private static int id = 0;
	private int teamid;
	
	public Team() {
		Team.id += 1;
		this.teamid = Team.id;
	}
	
	public Team(String name) {
		this.name=name;
		Team.id += 1;
		this.teamid = Team.id;
	}
	
	public void setName(String x) {
		this.name=x;
	}
	public String getName() {
		return this.name;
	}
	
	public void addPlayer(Player x) {
		players.add(x);
	}
	
	public ArrayList<Player> getPlayers(){
		return players;
	}
	
	public void deletePlayer(Player x) {
		players.remove(x);
	}
	
	public int getId() {
		return this.teamid;
	}

}
