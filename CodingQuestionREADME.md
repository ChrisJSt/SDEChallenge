# PaytmLabs SDE Challenge

## Coding Question

### Interface Design

For the implementation of Moving Average of the last N Elements, I created an interface IMovingAverage with getAverage, addElement, and getElements method stubs. For my implementing class, I named it SimpleMovingAverage. This interface design allows flexibility, re-usability, and better structure, as it allows us to implement, for example, WeightedMovingAverage, or ExponentialMovingAverage, while still abiding by the IMovingAverage interface.

### Underlying Data Structure

For the underlying data structure within our implementation, I chose an arraylist. The reason for this is that it was not specified that we must remove elements that fall outside the last "N" elements added in. As a result, the user may be interested in getting the first element that was added in for example. With the arraylist, one can retrieve any element by index in constant time. The potential downside, however, is because we are not removing anything from our arraylist, the arraylist can grow arbitrarily large and consume unnecessary memory. In this case, perhaps a doubly linked list could offer a better solution, where we can limit the number of elements in our doubly-linked list and remove any element in constant time (as opposed to average O(n) time to remove the item in the arraylist). The tradeoff here is that we can't retrieve any element in constant time for the doubly linked list.
The optimization done in calculating the moving average is achieved by calculating the rolling sum on each new addition of an element, and when an element falls outside of our last "N" element window, we simply subtract that old element from our rolling sum. Because we used an arraylist, we can easily get the value of the N+1 oldest element in constant time.