import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QaCinemaMain
{
    public static void main(String [] args)
    {
        JFrame f = new JFrame("Qa Cinemas");

        JPanel p = new JPanel();

        JLabel standard_ticket = new JLabel("Standard Tickets");
        JLabel oap_ticket = new JLabel("OAP Tickets");
        JLabel student_ticket = new JLabel("Student Tickets");
        JLabel child_ticket = new JLabel("Child Tickets");
        JLabel l = new JLabel("");
        JLabel total = new JLabel("Total:");

        JTextField standard_ticket_textfield = new JTextField();
        JTextField oap_ticket_textfield = new JTextField();
        JTextField student_ticket_textfield = new JTextField();
        JTextField child_ticket_textfield = new JTextField();
        JTextField cart_total_textfield = new JTextField();

        JButton add = new JButton("Add up");
        JButton finish_pay = new JButton("Finish and Pay");




        Tickets tick = new Tickets(add, standard_ticket_textfield,oap_ticket_textfield,student_ticket_textfield,child_ticket_textfield,cart_total_textfield);
        add.addActionListener(tick);

        p.setLayout(new GridLayout(6,2));

        p.add(standard_ticket);
        p.add(standard_ticket_textfield);
        p.add(oap_ticket);
        p.add(oap_ticket_textfield);
        p.add(student_ticket);
        p.add(student_ticket_textfield);
        p.add(child_ticket);
        p.add(child_ticket_textfield);
        p.add(l);
        p.add(add);
        p.add(total);
        p.add(cart_total_textfield);

        f.add(p);
        f.add(finish_pay, BorderLayout.SOUTH);
        f.setVisible(true);
        f.setSize(500,500);
        f.setLocation(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
