import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame implements ActionListener {
    JLabel label;
    JButton btn;
    JTextArea textarea;
    JScrollPane scrollplane;
    task2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,600);
        setTitle("Word COUNTER");
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(0xDCDCDC));
        textarea = new JTextArea("Thanks for viewing !!!");
        textarea.setBounds(25,90,725,350);
        textarea.setFont(new Font("Arial",Font.PLAIN,18));

        scrollplane=new JScrollPane(textarea);
        scrollplane.setBounds(25,90,725,350);
        label=new JLabel("  The No of words is ");
        label.setBounds(325,35,230,50);
        label.setForeground(Color.blue);

        btn=new JButton("words");
        btn.setBounds(345,470,200,50);
        btn.setForeground(Color.blue);
        btn.addActionListener(this::actionPerformed);

        add(scrollplane);
        add(label);
        // add(textarea);
        add(btn);
        setVisible(true);

    }


    public static void main(String args[]) {
        new task2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textarea.getText();
        String words[]=str.split("\\s");
        label.setText("the number of words is :"+words.length);

    }
}
