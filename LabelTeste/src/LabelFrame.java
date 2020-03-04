import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame 
{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame() 
    {
        super( "Testando JLabel" );
        setLayout(new FlowLayout());
        
        label1 = new JLabel ( "Label com Texto" );
        label1.setToolTipText( "Esse é o Label" );
        add(label1);
        
        Icon bug = new ImageIcon ( getClass().getResource( "bug.jpg" ));
        label2 = new JLabel ( "Label com Texto e Icon", bug, SwingConstants.LEFT );
        label2.setToolTipText( "Esse é o label2" );
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label com Icone e Texto no botão");
        label3.setIcon ( bug );
        label3.setHorizontalTextPosition( SwingConstants.CENTER);
        label3.setVerticalTextPosition ( SwingConstants.BOTTOM );
        label3.setToolTipText ( "Esse é label3" );
        add ( label3 );
    }
}
