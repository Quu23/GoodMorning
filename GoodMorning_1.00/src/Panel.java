import java.util.Objects;

import javax.swing.JPanel;

public abstract class Panel extends JPanel{
    public abstract int getPanelIndex();
    @Override
    public int hashCode() {
        return Objects.hash(this.getPanelIndex(),this.getBackground());
    }
}
