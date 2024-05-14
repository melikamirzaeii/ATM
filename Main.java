/*sanfoundry.com*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel entekhabzaban = new JPanel();
        entekhabzaban.setLayout(null);
        entekhabzaban.setBounds(0,0,600,500);
        entekhabzaban.setBackground(Color.lightGray);
        JPanel enterpassword = new JPanel();
        enterpassword.setLayout(null);
        enterpassword.setBounds(0,0,600,500);
        enterpassword.setBackground(Color.lightGray);
        JPanel tarakonesh = new JPanel();
        tarakonesh.setLayout(null);
        tarakonesh.setBounds(0,0,600,500);
        tarakonesh.setBackground(Color.lightGray);
        JPanel changepassword = new JPanel();
        changepassword.setLayout(null);
        changepassword.setBounds(0,0,600,500);
        changepassword.setBackground(Color.lightGray);
        JPanel elammojodi = new JPanel();
        elammojodi.setLayout(null);
        elammojodi.setBounds(0,0,600,500);
        elammojodi.setBackground(Color.lightGray);
        JPanel bardasht = new JPanel();
        bardasht.setLayout(null);
        bardasht.setBounds(0,0,600,500);
        bardasht.setBackground(Color.lightGray);
        JPanel kartbekart = new JPanel();
        kartbekart.setLayout(null);
        kartbekart.setBounds(0,0,600,500);
        kartbekart.setBackground(Color.lightGray);
        JPanel natijeh = new JPanel();
        natijeh.setLayout(null);
        natijeh.setBounds(0,0,600,500);
        natijeh.setBackground(Color.lightGray);
        JLabel label = new JLabel("Choose Language     زبان خود را انتخاب کنید");
        label.setBounds(200,75,450,250);
        JButton en = new JButton("English");
        en.setBounds(0,200,150,50);
        JButton fa = new JButton("فارسی");
        fa.setBounds(450,200,150,50);
        JLabel label2 = new JLabel("Enter Password");
        label2.setBounds(250,50,400,300);
        JTextField passw = new JTextField(20);
        passw.setBounds(250,250,100,50);
        passw.setEditable(true);
        JButton conf = new JButton("Confirm");
        conf.setBounds(200,350,250,50);
        JButton passwch= new JButton("Change Password");
        passwch.setBounds(50,100,150,55);
        JButton depos = new JButton("Deposit");
        depos.setBounds(50,300,150,55);
        JButton bala = new JButton("Balance");
        bala.setBounds(300,100,150,55);
        JButton transf = new JButton("Transfer Money");
        transf.setBounds(300,300,150,55);
        JLabel newp = new JLabel("Enter New Password");
        newp.setBounds(250,150,200,50);
        JTextField npasswf = new JTextField(20);
        npasswf.setEditable(true);
        npasswf.setBounds(250,250,100,50);
        JButton confi = new JButton("Confirm");
        confi.setBounds(400,300,100,25);
        JLabel balance = new JLabel("Your Account Balance Is: 94850000");
        balance.setBounds(250,150,200,100);
        JLabel d = new JLabel("Enter The Amount of Money To Deposit");
        d.setBounds(200,100,350,100);
        JTextField money = new JTextField(20);
        money.setEditable(true);
        money.setBounds(250,200,100,50);
        JButton c = new JButton("Confirm");
        c.setBounds(250,300,100,25);
        JLabel amount = new JLabel("Enter The Amount of Money");
        amount.setBounds(225,100,350,50);
        JTextField amountf = new JTextField(20);
        amountf.setEditable(true);
        amountf.setBounds(250,150,100,50);
        JLabel acnu = new JLabel("Enter The Account Number");
        acnu.setBounds(225,200,350,50);
        JTextField acnuf = new JTextField(20);
        acnuf.setEditable(true);
        acnuf.setBounds(250,250,100,50);
        JButton co = new JButton("Confirm");
        co.setBounds(250,400,100,25);
        JLabel resu = new JLabel("The Action Was Completed Succesfully");
        resu.setBounds(200,200,300,50);
        en.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(entekhabzaban);
                frame.add(enterpassword);
                frame.revalidate();
                frame.repaint();
            }
        });
        fa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(entekhabzaban);
                frame.add(enterpassword);
                frame.revalidate();
                frame.repaint();
            }
        });
        conf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(enterpassword);
                frame.add(tarakonesh);
                frame.revalidate();
                frame.repaint();
            }
        });
        passwch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(tarakonesh);
                frame.add(changepassword);
                frame.revalidate();
                frame.repaint();
            }
        });
        depos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(tarakonesh);
                frame.add(bardasht);
                frame.revalidate();
                frame.repaint();
            }
        });
        bala.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(tarakonesh);
                frame.add(elammojodi);
                frame.revalidate();
                frame.repaint();
            }
        });
        transf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(tarakonesh);
                frame.add(kartbekart);
                frame.revalidate();
                frame.repaint();
            }
        });
        confi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(changepassword);
                frame.add(natijeh);
                frame.revalidate();
                frame.repaint();
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(bardasht);
                frame.add(natijeh);
                frame.revalidate();
                frame.repaint();
            }
        });
        co.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(kartbekart);
                frame.add(natijeh);
                frame.revalidate();
                frame.repaint();
            }
        });
        entekhabzaban.add(label);
        entekhabzaban.add(en);
        entekhabzaban.add(fa);
        enterpassword.add(label2);
        enterpassword.add(passw);
        enterpassword.add(conf);
        tarakonesh.add(passwch);
        tarakonesh.add(depos);
        tarakonesh.add(bala);
        tarakonesh.add(transf);
        changepassword.add(newp);
        changepassword.add(npasswf);
        changepassword.add(confi);
        elammojodi.add(balance);
        bardasht.add(d);
        bardasht.add(money);
        bardasht.add(c);
        kartbekart.add(amount);
        kartbekart.add(amountf);
        kartbekart.add(acnu);
        kartbekart.add(acnuf);
        kartbekart.add(co);
        natijeh.add(resu);
        frame.add(entekhabzaban);
        frame.setVisible(true);
    }

}
