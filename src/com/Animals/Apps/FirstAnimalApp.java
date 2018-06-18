package com.Animals.Apps;

import com.Animals.Life.Animal;
import com.Animals.Life.Mamal;

public class FirstAnimalApp {

	public static void main(String[] args) {
		
		Animal animal = new Mamal();
		
		animal.live();
		animal.tryToTreatAnimal();
		animal.live();

	}

}
