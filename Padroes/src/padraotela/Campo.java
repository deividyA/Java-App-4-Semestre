package padraotela;
import java.awt.Dimension;
import javax.swing.JTextField;
public class Campo extends JTextField{
 public Campo () {
 this.setPreferredSize(new Dimension(130, 20)); 
 this.setText("");
 } 
 public void setText(String text) { 
 if (text.startsWith("campo"))
 super.setText(""); 
 else 
 super.setText(text); 
 } 
}
