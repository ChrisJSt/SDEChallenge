package main.java.chris;

import java.util.List;

public interface IMovingAverage {
	
	Double getAverage();
	
	void addElement(Double element);
	
	List<Double> getElements();
	
}
