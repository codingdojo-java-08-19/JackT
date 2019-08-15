package com.codingdojo.web.models;
import com.codingdojo.web.models.Team;
import java.util.ArrayList;

public class Roster {
	private ArrayList<Team> teams = new ArrayList<Team>();
	
	public Roster() {}
	
	public void addTeam(Team x) {
		teams.add(x);
	}
	
	public ArrayList<Team> getTeams() {
		return teams;
	}
	
	public void deleteTeam(Team x) {
		teams.remove(x);
	}

}
