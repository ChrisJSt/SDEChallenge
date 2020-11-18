package main.java.chris;

import java.util.ArrayList;
import java.util.List;

public class SimpleMovingAverage implements IMovingAverage {
	
	/* 
	 * Private fields
	 */
	private final int numberElementsToAverage;
	private Double currentSumLastNElements;
	private List<Double> integerList;
	
	/*
	 * Constructor that takes an integer N which determines
	 * how many elements to calculate the moving average of
	 */
	public SimpleMovingAverage(int N) throws Exception {
		if (N<1) {
			System.out.println("Number of elements to average can't be less than 1!");
			throw new Exception();
		}
		this.numberElementsToAverage = N;
		this.currentSumLastNElements = 0.0;
		integerList = new ArrayList<Double>();
		
	}
	
	/*
	 * Adds this element to the end of the underlying 
	 * ArrayList and updates the moving sum accordingly
	 */
	@Override
	public void addElement(Double element) {
		integerList.add(element);
		currentSumLastNElements += element;
		int currListSize = integerList.size();
		if (currListSize > numberElementsToAverage) {
			currentSumLastNElements-=integerList.get(integerList.size()-numberElementsToAverage-1);
		}
	}
	
	/*
	 * Get average of last N elements added
	 */
	@Override
	public Double getAverage() {
		return currentSumLastNElements/numberElementsToAverage;
	}
	
	/*
	 * Gets the underlying elements
	 */
	@Override
	public List<Double> getElements() {
		return integerList;
	}
	
	/*
	 * Retrieve an element based off of the index it was added in
	 */
	public Double getElement(int index) {
		return integerList.get(index);
	}
	
}
