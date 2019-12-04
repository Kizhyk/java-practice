package com.rakovets.course.challenge.oop.inheritance.cats;

public class Cat {
	private String name;

	Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void mew() {
		System.out.println(this.getName() + " -> Meeew");
	}

	public void purr() {
		System.out.println(this.getName() + " -> Puurr");
	}

	public void mew(Person p) {
		System.out.println(this.name + " -> Meeeew");
		p.takeHappiness(-10);
	}

	public void purr(Person p) {
		System.out.println(this.name + " -> Puurr");
		p.takeHappiness(10);
	}
}
