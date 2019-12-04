package com.rakovets.course.challenge.oop.inheritance.cats;

public class Person {
	private int happiness;

	public Person(int happiness) {
		if (happiness >= 100) {
			this.happiness = 100;
			System.out.println("Достигнут дзен.");
		} else if (happiness <= 0) {
			this.happiness = 0;
			System.out.println("Активная депрессия.");
		} else {
			this.happiness = happiness;
		}
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		if (happiness >= 100) {
			this.happiness = 100;
			System.out.println("Достигнут дзен.");
		} else if (happiness <= 0) {
			this.happiness = 0;
			System.out.println("Активная депрессия.");
		} else {
			this.happiness = happiness;
		}
	}

	public void takeHappiness(int happiness) {
		if (this.happiness + happiness >= 100) {
			this.happiness = 100;
			System.out.println("Достигнут дзен.");
		} else if (this.happiness + happiness <= 0) {
			this.happiness = 0;
			System.out.println("Активная депрессия.");
		} else {
			this.happiness += happiness;
		}
	}
}
