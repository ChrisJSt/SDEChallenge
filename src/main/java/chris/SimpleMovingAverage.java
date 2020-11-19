package main.java.chris;

import java.util.ArrayList;
import java.util.List;

public class SimpleMovingAverage implements IMovingAverage {
	
	/* 
	 * Private fields
	 */
	private final int numberElementsToAverage;
	private Double currentSumLastNElements;
	private List<Double> elementList;
	
	/*
	 * Constructor that takes an integer N which determines
	 * how many elements to calculate the moving average of
	 */
	public SimpleMovingAverage(int numElementsToAvg) throws Exception {
		if (numElementsToAvg<1) {
			System.out.println("Number of elements to average can't be less than 1!");
			throw new Exception();
		}
		this.numberElementsToAverage = numElementsToAvg;
		this.currentSumLastNElements = 0.0;
		elementList = new ArrayList<Double>();
		
	}
	
	/*
	 * Adds this element to the end of the underlying 
	 * ArrayList and updates the moving sum accordingly
	 */
	@Override
	public void addElement(Double element) {
		elementList.add(element);
		currentSumLastNElements += element;
		int currListSize = elementList.size();
		if (currListSize > numberElementsToAverage) {
			//Here, our current list exceeds the number of elements to calculate a moving average of.
			//Therefore, we subtract the N+1 previous element that was added in. We can easily calculate 
			//and get this element using our arraylist.
			currentSumLastNElements-=elementList.get(elementList.size()-numberElementsToAverage-1);
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
		return elementList;
	}
	
	/*
	 * Retrieve an element based off of the index it was added in
	 */
	public Double getElement(int index) {
		return elementList.get(index);
	}
	
}
