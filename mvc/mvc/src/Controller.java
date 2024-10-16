// Controller.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Add listeners for the buttons
        this.view.addIncrementListener(new IncrementButtonListener());
        this.view.addDecrementListener(new DecrementButtonListener());
    }

    // Inner class for handling increment button click
    class IncrementButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.increment(); // Update the model
            view.setCounterValue(model.getCounter()); // Update the view
        }
    }

    // Inner class for handling decrement button click
    class DecrementButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.decrement(); // Update the model
            view.setCounterValue(model.getCounter()); // Update the view
        }
    }
}
