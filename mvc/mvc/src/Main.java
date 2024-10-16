// Main.java
public class Main {
    public static void main(String[] args) {
        // Create the MVC components
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        
        // Show the view (UI)
        view.setVisible(true);
    }
}
