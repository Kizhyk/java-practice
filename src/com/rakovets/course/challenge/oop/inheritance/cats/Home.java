package com.rakovets.course.challenge.oop.inheritance.cats;

public class Home {
	public static void main(String[] args) {
		Person p = new Person(50);
		Persian persian = new Persian("Cat1");
		Siamese siamese = new Siamese("Cat2");
		Sphynx sphynx = new Sphynx("Cat3");
		persian.mew();
		siamese.mew();
		sphynx.mew();
		persian.purr();
		siamese.purr();
		sphynx.purr();

		persian.mew(p);
		System.out.println(p.getHappiness());
		siamese.mew(p);
		System.out.println(p.getHappiness());
		sphynx.mew(p);
		System.out.println(p.getHappiness());
		persian.purr(p);
		System.out.println(p.getHappiness());
		siamese.purr(p);
		System.out.println(p.getHappiness());
		sphynx.purr(p);
		System.out.println(p.getHappiness());

		p.setHappiness(100);
		p.setHappiness(0);
	}
}
