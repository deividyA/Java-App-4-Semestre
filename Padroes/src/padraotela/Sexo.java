package padraotela;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class Sexo extends JPanel{
 private JRadioButton feminino = new JRadioButton();
 private JRadioButton masculino = new JRadioButton();
 private ButtonGroup grupoSexo = new ButtonGroup();
 public Sexo() {
 grupoSexo.add(masculino);
 masculino.setText("MASCULINO");
 grupoSexo.add(feminino);
 feminino.setText("FEMININO");
 this.add(masculino);
 this.add(feminino);
 feminino.setSelected(true);
 }
 public char getSexo() {
 if (masculino.isSelected()) 
 return 'M';
 else 
 return 'F'; 
 }
 public void setSexo(char sexo) {
 if (sexo == 'M') 
 masculino.setSelected(true);
 else 
 feminino.setSelected(true);
 }
}
