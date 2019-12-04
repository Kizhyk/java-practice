package com.rakovets.course.challenge.oop.inheritance.cats;

public class Siamese extends Cat {

	public Siamese(String name) {
		super(name);
	}

	@Override
	public void mew() {
		System.out.println(this.getName() + " -> Meeew(3)");
	}

	@Override
	public void purr() {
		System.out.println(this.getName() + " -> Puurr(3)");
	}

	@Override
	public void mew(Person p) {
		System.out.println(this.getName() + " -> Meeew(3)");
		p.takeHappiness(-15);
	}

	@Override
	public void purr(Person p) {
		System.out.println(this.getName() + " -> Puurr(3)");
		p.takeHappiness(15);
	}
}
