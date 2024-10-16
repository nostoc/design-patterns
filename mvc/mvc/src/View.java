// View.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JLabel counterLabel = new JLabel("0");
    private JButton incrementButton = new JButton("⬆️");
    private JButton decrementButton = new JButton("⬇️");

    public View() {
        // Setup the UI
        this.setTitle("Arrow Click Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        this.setLayout(new FlowLayout());
        
        // Add components to the frame
        this.add(decrementButton);
        this.add(counterLabel);
        this.add(incrementButton);
    }
    
    // Set the displayed counter value
    public void setCounterValue(int value) {
        counterLabel.setText(Integer.toString(value));
    }
    
    // Attach event listener for the increment button
    public void addIncrementListener(ActionListener listener) {
        incrementButton.addActionListener(listener);
    }
    
    // Attach event listener for the decrement button
    public void addDecrementListener(ActionListener listener) {
        decrementButton.addActionListener(listener);
    }
}
