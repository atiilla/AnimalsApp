package com.Animals.Life;

public class Koala extends Mamal {

	private long maxEucaplyptusEatingCapacity = 250;
	public long getMaxEucaplyptusEatingCapacity() {
		return maxEucaplyptusEatingCapacity;
	}

	public void setMaxEucaplyptusEatingCapacity(long maxEucaplyptusEatingCapacity) {
		this.maxEucaplyptusEatingCapacity = maxEucaplyptusEatingCapacity;
	}
	
	public void live() {
		System.out.println("This koala is alive");
	}

}
