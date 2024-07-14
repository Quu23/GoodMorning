import java.awt.*;
import java.util.Objects;

import javax.swing.*;

// 早起き用のパネル
public class FastWakeUpPanel extends Panel{
    public static final int PANEL_INDEX = 2;

    FastWakeUpPanel(){
        this.setBackground(Color.ORANGE);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(PANEL_INDEX,this.getBackground());
    }

    @Override
    public int getPanelIndex() {
        return FastGoSleepPanel.PANEL_INDEX;
    }
}
