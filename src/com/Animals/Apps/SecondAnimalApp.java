package com.Animals.Apps;

import com.Animals.Life.Mamal;

public class SecondAnimalApp {

	public static void main(String[] args) {
		Mamal mamal = new Mamal();
		System.out.println("Mamal is alive: "+ mamal.getIsAlive());
		System.out.println("Mamal has a lungcapacity of: "+ mamal.getLungCapacity());

	}

}
