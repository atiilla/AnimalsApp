package com.Animals.Apps;

import java.util.Random;

import com.Animals.Life.Animal;
import com.Animals.Life.Koala;

public class ThirdAnimalApp {

	public static void main(String[] args) {

		Animal animal = new Koala();
		

		Random koalaOrPanda = new Random();
		if (koalaOrPanda.nextBoolean()) {
			animal = new Koala();

		} else {
			animal = new Panda();
		}
		animal.live();
		
	}

}
