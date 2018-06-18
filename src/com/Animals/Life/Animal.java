package com.Animals.Life;

import java.util.Random;

import com.Animals.Apps.FirstAnimalApp;

public abstract class Animal { // abstract // Cannot instantiate the type Animal

	private boolean isAlive;
	private static int AnimalCount;

	// public abstract void concereteAnimalBehaviour();
	{
		AnimalCount++;
	}
	
	public static int getAnimalCount() {
		return AnimalCount;
	}

	public void tryToTreatAnimal() {
		Random outcomeGenerator = new Random();
		boolean outcomeOfTreatmentPositive = outcomeGenerator.nextBoolean();
		if (outcomeOfTreatmentPositive) {
			isAlive = true;
		} else {
			isAlive = false;
		}
	}

	public void live() {
		System.out.println("Alive ? : " + isAlive);
	}

	public boolean getIsAlive() {
		return isAlive;
	}

}
