package Sujoy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btndot;
    JButton btnplus,btnminus,btnmulti,btndiv,btnpercent,btnclr,btnroot,btnequal,btnoff,btninverse,btnsqrt,btndelete;
    JPanel head1,head2, head3,head4;
    JLabel label1;
    JTextField t1;
    int flag;
    Double num1, num2, result;
    public Calculator()
    {
        setSize(600,530);
//        setBackground(Color.green);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Font
        Font font1 = new Font("Arial",1, 15);
        Font font2 = new Font("Arial",1,20 );
        Font font3 = new Font("Times New Roman", 1,50);

        //Calculator name
        label1 = new JLabel("CALCULATOR");
        label1.setBounds(10,5,150,50);
        label1.setLayout(null);
        label1.setFont(font1);

        //solar pannel
        head1 = new JPanel();
        head1.setLayout(null);
        head1.setBounds(510,10,20,20);
        head1.setBackground(Color.BLACK);

        head2 = new JPanel();
        head2.setLayout(null);
        head2.setBounds(540,10,20,20);
        head2.setBackground(Color.BLACK);

        head3 = new JPanel();
        head3.setLayout(null);
        head3.setBounds(570,10,20,20);
        head3.setBackground(Color.BLACK);

        head4 = new JPanel();
        head4.setLayout(null);
        head4.setBounds(10,50,580,100);
        head4.setBackground(Color.BLACK);


        //TEXTFIELD
        t1 = new JTextField();
        t1.setBounds(10,20,560,60);
        t1.setFont(font3);
        t1.setLayout(null);
        t1.setEditable(false);
        t1.setHorizontalAlignment(JTextField.RIGHT);
//        t1.setColumns(12);
//        t1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        head4.add(t1);

        //Adding button

        //for button OFF
        btnoff = new JButton("OFF");
        btnoff.setForeground(Color.BLACK);
        btnoff.setBounds(10,170,112,50);
        btnoff.setBackground(Color.red);
        btnoff.setFont(font2);
        btnoff.setFocusable(false);

        //for button clear
        btnclr = new JButton("CE");
        btnclr.setBounds(127,170,112,50);
        btnclr.setForeground(Color.white);
        btnclr.setBackground(Color.BLACK);
        btnclr.setFont(font2);
        btnclr.setFocusable(false);


        //for button inverse
//        btninverse = new JButton("x\u005E");
        btninverse = new JButton("1/x");
        btninverse.setBounds(243,170,112,50);
        btninverse.setBackground(Color.BLACK);
        btninverse.setForeground(Color.white);
        btninverse.setFont(font2);
        btninverse.setFocusable(false);

//        //for button square
        btnsqrt = new JButton("x\u00B2");
        btnsqrt.setBounds(359,170,112,50);
        btnsqrt.setForeground(Color.white);
        btnsqrt.setBackground(Color.BLACK);
        btnsqrt.setFont(font2);
        btnsqrt.setFocusable(false);



        //for delete
        btndelete = new JButton("\u2190");
        btndelete.setBounds(477,170,112,50);
        btndelete.setForeground(Color.white);
        btndelete.setBackground(Color.black);
        btndelete.setFont(font2);
        btndelete.setFocusable(false);



        //for seven
        btn7 = new JButton("7");
        btn7.setBounds(10,230,112,50);
        btn7.setBackground(Color.BLACK);
        btn7.setForeground(Color.WHITE);
        btn7.setFont(font2);
        btn7.setFocusable(false);

        //for eight
        btn8 = new JButton("8");
        btn8.setBounds(127,230,112,50);
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.WHITE);
        btn8.setFont(font2);
        btn8.setFocusable(false);


        //for nine
        btn9 = new JButton("9");
        btn9.setBounds(243,230,112,50);
        btn9.setBackground(Color.BLACK);
        btn9.setForeground(Color.WHITE);
        btn9.setFont(font2);
        btn9.setFocusable(false);


        //for percentage
        btnpercent = new JButton("\u0025");
        btnpercent.setBounds(359,230,112,50);
//        btnpercent.setBackground(Color.LIGHT_GRAY);
        btnpercent.setBackground(Color.WHITE);
        btnpercent.setForeground(Color.BLACK);
        btnpercent.setFont(font2);
        btnpercent.setFocusable(false);

        //for root
        btnroot = new JButton("\u221A");
        btnroot.setBounds(477,230,112,50);
        btnroot.setBackground(Color.WHITE);
        btnroot.setForeground(Color.BLACK);
        btnroot.setFont(font2);
        btnroot.setFocusable(false);


        //for four
        btn4 = new JButton("4");
        btn4.setBounds(10,290,112,50);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn4.setFont(font2);
        btn4.setFocusable(false);


        //for five
        btn5 = new JButton("5");
        btn5.setBounds(127,290,112,50);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn5.setFont(font2);
        btn5.setFocusable(false);



        //for Six
        btn6 = new JButton("6");
        btn6.setBounds(243,290,112,50);
        btn6.setBackground(Color.BLACK);
        btn6.setForeground(Color.WHITE);
        btn6.setFont(font2);
        btn6.setFocusable(false);



        //for btn Multiplication
        btnmulti = new JButton("\u00d7");
        btnmulti.setBounds(359,290,112,50);
        btnmulti.setBackground(Color.WHITE);
        btnmulti.setForeground(Color.BLACK);
        btnmulti.setFont(font2);
        btnmulti.setFocusable(false);


        //for btn divider
        btndiv = new JButton("\u00f7");
        btndiv.setBounds(477,290,112,50);
        btndiv.setBackground(Color.WHITE);
        btndiv.setForeground(Color.BLACK);
        btndiv.setFont(font2);
        btndiv.setFocusable(false);

        //for btn 1
        btn1 = new JButton("1");
        btn1.setBounds(10,350,112,50);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setFont(font2);
        btn1.setFocusable(false);

        //for btn 2
        btn2 = new JButton("2");
        btn2.setBounds(127,350,112,50);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFont(font2);
        btn2.setFocusable(false);

        //for btn 3
        btn3 = new JButton("3");
        btn3.setBounds(243,350,112,50);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setFont(font2);
        btn3.setFocusable(false);

        //for button plus
        btnplus = new JButton("\u002b");
        btnplus.setBounds(359,350,112,110);
        btnplus.setBackground(Color.WHITE);
        btnplus.setForeground(Color.BLACK);
        btnplus.setFont(font2);
        btnplus.setFocusable(false);

        //for button minus
        btnminus = new JButton("\u2212");
        btnminus.setBounds(477,350,112,50);
        btnminus.setBackground(Color.WHITE);
        btnminus.setForeground(Color.BLACK);
        btnminus.setFont(font2);
        btnminus.setFocusable(false);



        //for button zero
        btn0 = new JButton("0");
        btn0.setBounds(10,410,112,50);
        btn0.setBackground(Color.BLACK);
        btn0.setForeground(Color.WHITE);
        btn0.setFont(font2);
        btn0.setFocusable(false);



        //for button zero zero
        btn00 = new JButton("00");
        btn00.setBounds(127,410,112,50);
        btn00.setBackground(Color.BLACK);
        btn00.setForeground(Color.WHITE);
        btn00.setFont(font2);
        btn00.setFocusable(false);


        //for button dot
        btndot = new JButton(".");
        btndot.setBounds(243,410,112,50);
        btndot.setBackground(Color.BLACK);
        btndot.setForeground(Color.WHITE);
        btndot.setFont(font2);
        btndot.setFocusable(false);




        //for button equal
        btnequal = new JButton("=");
        btnequal.setBounds(477,410,112,50);
        btnequal.setBackground(Color.WHITE);
        btnequal.setForeground(Color.BLACK);
        btnequal.setFont(font2);
        btndot.setFocusable(false);

//        btn1.setBounds();


        add(head1);
        add(head2);
        add(head3);
        add(head4);
        add(label1);
        add(btnoff);
        add(btnsqrt);
        add(btninverse);
        add(btndelete);
        add(btnclr);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btnpercent);
        add(btnroot);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btnmulti);
        add(btndiv);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btnplus);
        add(btnminus);
        add(btn0);
        add(btn00);
        add(btndot);
        add(btnequal);

        btnoff.addActionListener(this);
        btnsqrt.addActionListener(this);
        btninverse.addActionListener(this);
        btnclr.addActionListener(this);
        btndelete.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnpercent.addActionListener(this);
        btnroot.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnmulti.addActionListener(this);
        btndiv.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnplus.addActionListener(this);
        btnminus.addActionListener(this);
        btn0.addActionListener(this);
        btn00.addActionListener(this);
        btndot.addActionListener(this);
        btnequal.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str1 = t1.getText();
        String str2 = t1.getText();

        if(e.getSource() == btnoff)
        {
            System.exit(0);
        }
        if(e.getSource() == btnsqrt)
        {
            try {
                num1 = Double.parseDouble(str1);
                result = num1 * num1;
                t1.setText(Double.toString(result));

                if(Double.toString(result).endsWith(".0"))
                {
                    t1.setText(Double.toString(result).replace(".0",""));
                }
                else
                {
                    t1.setText(Double.toString(result));
                }
            }catch (NumberFormatException es)
            {
                System.out.println(es);
            }

        }

        if(e.getSource() == btnclr)
        {
            t1.setText("");
        }
        if(e.getSource() == btninverse)
        {
//            num1 = Double.parseDouble(str1);
//            t1.setText("");
//            flag = 5;

            try {
                num1 = Double.parseDouble(str1);
                result = 1 / num1;
                t1.setText(Double.toString(result));

                if(Double.toString(result).endsWith(".0"))
                {
                    t1.setText(Double.toString(result).replace(".0",""));
                }
                else
                {
                    t1.setText(Double.toString(result));
                }
            }catch (NumberFormatException es)
            {
                System.out.println(es);
            }


        }

        if(e.getSource() == btndelete)
        {
            int len = t1.getText().length();
            int num4 = len - 1;

            if(len > 0)
            {
                StringBuilder back = new StringBuilder(t1.getText());
                back.deleteCharAt(num4);
                t1.setText(back.toString());
            }

        }

        if(e.getSource() == btn7)
        {
            t1.setText(t1.getText() + "7");
        }

        if(e.getSource() == btn8)
        {
            t1.setText(t1.getText() + "8");
        }

        if(e.getSource() == btn9)
        {
            t1.setText(t1.getText() + "9");
        }

        if(e.getSource() == btnpercent)
        {
            try {
                num1 = Double.parseDouble(str1);
                result = num1 / 100;
                if(Double.toString(result).endsWith(".0"))
                {
                    t1.setText(Double.toString(result).replace(".0",""));
                }
                else
                {
                    t1.setText(Double.toString(result));
                }
            }catch (NumberFormatException es)
            {
                System.out.println(es);
            }

//
//            t1.setText("");
//            flag = 6;

        }

        if(e.getSource() == btnroot)
        {
            try {
                num1 = Double.parseDouble(t1.getText());

                Double sqrt = Math.sqrt(num1);
                t1.setText(Double.toString(sqrt));

                if(Double.toString(sqrt).endsWith(".0"))
                {
                    t1.setText(Double.toString(sqrt).replace(".0",""));
                }
                else
                {
                    t1.setText(Double.toString(sqrt));
                }
            }catch (NumberFormatException es)
            {
                System.out.println(es);
            }

        }

        if(e.getSource() == btn4)
        {
            t1.setText(t1.getText() + "4");
        }

        if(e.getSource() == btn5)
        {
            t1.setText(t1.getText() + "5");
        }

        if(e.getSource() == btn6)
        {
            t1.setText(t1.getText() + "6");
        }

        if(e.getSource() == btnmulti)
        {
            try {
                num1 = Double.parseDouble(str1);
            }catch (NumberFormatException es) {
                System.out.println(es);
            }
            t1.setText("");
            flag = 3;
        }

        if(e.getSource() == btndiv)
        {
            try {
                num1 = Double.parseDouble(str1);
            }
            catch (NumberFormatException es)
            {
                System.out.println(es);
            }
            t1.setText("");
            flag = 4;
        }

        if(e.getSource() == btn1)
        {
            t1.setText(t1.getText() + "1");
        }

        if(e.getSource() == btn2)
        {
            t1.setText(t1.getText() + "2");
        }

        if(e.getSource() == btn3)
        {
            t1.setText(t1.getText() + "3");
        }

        if(e.getSource() == btnplus)
        {
            try{
                num1 = Double.parseDouble(str1);
            }catch (NumberFormatException es)
            {
                System.out.println(es);
            }
            t1.setText("");
            flag = 1;
        }

        if(e.getSource() == btnminus)
        {
            try {
                num1 = Double.parseDouble(str1);
            }catch (NumberFormatException es)
            {
                System.out.println(es);
            }
            t1.setText("");
            flag = 2;
        }

        if(e.getSource() == btn0)
        {
            if(t1.getText().equals("0"))
            {
                return;
            }
            else
            {
                t1.setText(t1.getText() + "0");
            };
        }

        if(e.getSource() == btn00)
        {
            if(t1.getText().equals("00"))
            {
                return;
            }
            else
            {
                t1.setText(t1.getText() + "00");
            }
        }

        if(e.getSource() == btndot)
        {
            if(t1.getText().contains("."))
            {
                return;
            }
            else
            {
                t1.setText(t1.getText() + ".");
            }
        }

        try
        {
            if(e.getSource() == btnequal)
            {
                if(flag == 1)
                {
                    num2 = Double.parseDouble(str2);
                    result = num1 + num2;
                    t1.setText(Double.toString(result));
                    if(Double.toString(result).endsWith(".0"))
                    {
                        t1.setText(Double.toString(result).replace(".0",""));
                    }
                    else
                    {
                        t1.setText(Double.toString(result));
                    }
                }
                if(flag == 2)
                {
                    num2 = Double.parseDouble(str2);
                    result = num1 - num2;
                    t1.setText(Double.toString(result));
                    if(Double.toString(result).endsWith(".0"))
                    {
                        t1.setText(Double.toString(result).replace(".0",""));
                    }
                    else
                    {
                        t1.setText(Double.toString(result));
                    }
                }
                if(flag == 3)
                {
                    num2 = Double.parseDouble(str2);
                    result = num1 * num2;
                    t1.setText(Double.toString(result));
                    if(Double.toString(result).endsWith(".0"))
                    {
                        t1.setText(Double.toString(result).replace(".0",""));
                    }
                    else
                    {
                        t1.setText(Double.toString(result));
                    }
                }
                if(flag == 4)
                {
                    num2 = Double.parseDouble(str2);
                    result = num1 / num2;
                    t1.setText(Double.toString(result));
                    if(Double.toString(result).endsWith(".0"))
                    {
                        t1.setText(Double.toString(result).replace(".0",""));
                    }
                    else
                    {
                        t1.setText(Double.toString(result));
                    }
                }

        }



        }catch (NumberFormatException es)
        {
            System.out.println(es);
        }

    }
}
