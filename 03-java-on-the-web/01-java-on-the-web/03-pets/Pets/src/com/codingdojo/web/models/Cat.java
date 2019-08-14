package com.codingdojo.web.models;

public class Cat extends Animal implements Pet{
	public String showAffection() {
		if (getWeight() < 20) {
			return getName() + " curls up in your lap.";
		}
		return getName() + " That is a large cat ... don't turn your back to it.";
	}

}
