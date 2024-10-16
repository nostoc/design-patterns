// Model.java
public class Model {
    private int counter;
    
    public Model() {
        this.counter = 0;  // Initial counter value
    }
    
    // Get the current counter value
    public int getCounter() {
        return counter;
    }
    
    // Increment the counter
    public void increment() {
        counter++;
    }
    
    // Decrement the counter
    public void decrement() {
        counter--;
    }
}
