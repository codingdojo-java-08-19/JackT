package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{
	public String showAffection(){
		if(getWeight() < 20) {
			return getName() + "lays down in your lap.";
		}
		return getName() + " lays down next to you.";
	}
}
