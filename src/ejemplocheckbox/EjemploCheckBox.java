/*
Autor: María José Corredor y Gabriela Gordillo
 */
package ejemplocheckbox;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjemploCheckBox extends JFrame implements ChangeListener {

    private final JCheckBox checkBox1;
    private final JCheckBox checkBox2;
    private final JCheckBox checkBox3;
    private final JLabel label;

    public EjemploCheckBox() {

        checkBox1 = new JCheckBox("Uno");
        checkBox1.setBounds(10,10,150,30);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        checkBox2 = new JCheckBox("Dos");
        checkBox2.setBounds(10,50,150,30);
        checkBox2.addChangeListener(this);
        add(checkBox2);

        checkBox3 = new JCheckBox("Tres");
        checkBox3.setBounds(10,90,150,30);
        checkBox3.addChangeListener(this);
        add(checkBox3);

        label = new JLabel("Opción: ninguno");
        label.setBounds(10,130,250,30);
        add(label);

        Frame();
    }

    private void Frame() {

        setLayout(null);
        setTitle("Ejemplo Check Box");
        setBounds(700, 150,300, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
    EjemploCheckBox Ejemplo = new EjemploCheckBox();
}

    @Override
    public void stateChanged(ChangeEvent e) {

        String texto = "Opción:  ";

        if (checkBox1.isSelected()) {
            texto += "Uno, ";
        }
        if (checkBox2.isSelected()) {
            texto += "Dos, ";
        }
        if (checkBox3.isSelected()) {
            texto += "Tres, ";
        }

        texto = texto.substring(0, texto.length() - 2);
        label.setText(texto);

    }
}