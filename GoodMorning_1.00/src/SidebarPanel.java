import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SidebarPanel extends Panel{
    public static final int PANEL_INDEX = 4;
    
    SidebarPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JButton fastWakeUp = new JButton("早起き");
        fastWakeUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.window.panelsChange(FastWakeUpPanel.PANEL_INDEX);
            }
        });
        JButton fastGoSleep = new JButton("早寝");
        fastGoSleep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.window.panelsChange(FastGoSleepPanel.PANEL_INDEX);
            }
        });
        JButton breakFast = new JButton("朝ごはん");
        breakFast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.window.panelsChange(BreakfastPanel.PANEL_INDEX);
            }
        });
        this.add(fastWakeUp);
        this.add(fastGoSleep);
        this.add(breakFast);

        this.setBackground(Color.PINK);
    }

    @Override
    public int getPanelIndex() {
        return SidebarPanel.PANEL_INDEX;
    }
}
