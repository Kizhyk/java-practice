package com.rakovets.course.practice.module2;

/**
 * Написать программу для фабрики по производству зонтов,
 * которая расcчитает площадь материала, небходимого для изготовления одного зонта. Для изготовления
 * зонта используется материал в форме круга.
 *
 * @param diameter - диаметр зонта, который необходимо изготовить
 */
public class Task07 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int diameter = 10;

		// Код необходимый для тестирования, не изменять
		diameter = (args.length == 1) ? Integer.parseInt(args[0]) : diameter;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		System.out.println((diameter / 2) * (diameter / 2) * Math.PI);
	}
}