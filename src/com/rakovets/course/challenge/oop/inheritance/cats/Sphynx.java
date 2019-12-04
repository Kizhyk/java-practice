package com.rakovets.course.challenge.oop.inheritance.cats;

public class Sphynx extends Cat {

	Sphynx(String name) {
		super(name);
	}

	@Override
	public void mew() {
		System.out.println(this.getName() + " -> Meeew(1)");
	}

	@Override
	public void purr() {
		System.out.println(this.getName() + " -> Puurr(1)");
	}

	@Override
	public void mew(Person p) {
		System.out.println(this.getName() + " -> Meeew(1)");
		p.takeHappiness(-10);
	}

	@Override
	public void purr(Person p) {
		System.out.println(this.getName() + " -> Puurr(1)");
		p.takeHappiness(10);
	}
}
