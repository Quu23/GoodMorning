import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SidebarPanel extends Panel{
    public static final int PANEL_INDEX = 4;
    
    SidebarPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JButton fastWakeUp = new JButton();
        fastWakeUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        this.add(new JButton("早寝"));
        this.add(new JButton("早起き"));
        this.add(new JButton("朝ごはん"));
        this.setBackground(Color.PINK);
    }

    @Override
    public int getPanelIndex() {
        return SidebarPanel.PANEL_INDEX;
    }
}
