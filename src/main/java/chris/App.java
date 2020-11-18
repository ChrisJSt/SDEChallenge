package main.java.chris;

public class App {
	
	public static void main(String[] args) throws Exception {
		
	int[] arrNumElementsToAvg = {2,3,0};
        Double[] sampleElements = {1.0, 5.0, 3.0, 4.0, 11.0};
        for (int numElementsToAvg : arrNumElementsToAvg) {
        	IMovingAverage simpleMovingAverage = new SimpleMovingAverage(numElementsToAvg);
            for (Double elt : sampleElements) {
            	simpleMovingAverage.addElement(elt);
            	System.out.println("Just added number " + elt);
            	System.out.println("The current moving average of the last " + numElementsToAvg + 
            			" numbers is " + simpleMovingAverage.getAverage());
            }
            System.out.println("----");
        }
		
	}

}
