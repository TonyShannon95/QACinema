import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tickets implements ActionListener
{
    JButton add1, but;
    JTextField standard, oap1, student, child1, total;


    public Tickets(JButton add, JTextField stand, JTextField oap, JTextField stud, JTextField child, JTextField cart)
    {
        add1 = add;
        standard =stand;
        oap1 = oap;
        student = stud;
        child1 = child;
        total = cart;
    }

    @Override
    public void actionPerformed(ActionEvent x)
    {
        int a,b,c,d,e;
        int a1 =8;
        int b1 =6;
        int c1 =6;
        int d1 =4;
        a = Integer.parseInt(standard.getText());
        b = Integer.parseInt(oap1.getText());
        c = Integer.parseInt(student.getText());
        d = Integer.parseInt(child1.getText());

        JButton but = (JButton) x.getSource();

        if(but == add1)
        {
            a = a * a1;
            b = b * b1;
            c = c * c1;
            d = d * d1;
            e = a + b + c + d;

            total.setText(Integer.toString(e));
        }
    }
}
