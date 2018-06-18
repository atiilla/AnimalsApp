package com.Animals.Life;

import java.util.Random;

import com.Animals.Apps.FirstAnimalApp;

public abstract class Animal { // abstract // Cannot instantiate the type Animal

	private boolean isAlive;

	// public abstract void concereteAnimalBehaviour();

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
