import javax.swing.*;

public class Window extends JFrame{
    Window(String name){
        this.setTitle(name);
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}