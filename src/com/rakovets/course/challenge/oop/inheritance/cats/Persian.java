package com.rakovets.course.challenge.oop.inheritance.cats;

public class Persian extends Cat {

	public Persian(String name) {
		super(name);
	}

	@Override
	public void mew() {
		System.out.println(this.getName() + " -> Meeew(2)");
	}

	@Override
	public void purr() {
		System.out.println(this.getName() + " -> Puurr(2)");
	}

	@Override
	public void mew(Person p) {
		System.out.println(this.getName() + " -> Meeew(2)");
		p.takeHappiness(-5);
	}

	@Override
	public void purr(Person p) {
		System.out.println(this.getName() + " -> Puurr(2)");
		p.takeHappiness(5);
	}

}
