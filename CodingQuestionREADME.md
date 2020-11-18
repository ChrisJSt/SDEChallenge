# PaytmLabs SDE Challenge

## Coding Question

### Interface Design

For the implementation of Moving Average of the last N Elements, I created an interface IMovingAverage with getAverage, addElement, and getElements method stubs. For my implementing class, I named it SimpleMovingAverage. This interface design allows flexibility, re-usability, and better structure, as it allows us to implement, for example, WeightedMovingAverage, or ExponentialMovingAverage, while still abiding by the IMovingAverage interface. 