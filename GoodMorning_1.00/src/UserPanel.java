import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class UserPanel extends Panel{
    public static final int PANEL_INDEX = 3;

    UserPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.GREEN);
    }    

    @Override
    public int getPanelIndex() {
        return UserPanel.PANEL_INDEX;
    }
}
