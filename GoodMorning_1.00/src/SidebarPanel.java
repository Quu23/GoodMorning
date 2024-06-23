import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SidebarPanel extends JPanel{
    public static final int PANEL_INDEX = 4;
    
    SidebarPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.PINK);
    }
}
