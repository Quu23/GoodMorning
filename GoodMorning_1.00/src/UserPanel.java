import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class UserPanel extends JPanel{
    public static final int PANEL_INDEX = 3;

    UserPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.GREEN);
    }    
}
