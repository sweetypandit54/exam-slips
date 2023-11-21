import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SimpleCalci
{
      private JFrame f;
      private JTextField display;
      private JButton[] db;
      private JButton add,sub,mul,div,per,clear,calculate;
      private double n1,n2;
      private char operator;
      
      public SimpleCalci()
      {
            f = new JFrame("Simple Calculator! ");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300,400);
            f.setLayout(new BorderLayout());
            
            display=new JTextField();
            display.setEditable(false);
            f.add(display,BorderLayout.NORTH);
            
            JPanel bp=new JPanel();
            bp.setLayout(new GridLayout(4,4));
            
            db=new JButton[10];
            for (int i=0;i<10;i++)
            {
                db[i]=new JButton(String.valueOf(i));
                db[i].addActionListener(new DigitButtonListener());
                bp.add(db[i]);
            }
            add=new JButton("+");
            sub=new JButton("-");
            mul=new JButton("x");
            div=new JButton("/");
            per=new JButton("%");
            clear=new JButton("C");
            calculate=new JButton("=");
            
            add.addActionListener(new operation('+'));
            sub.addActionListener(new operation('-'));
            mul.addActionListener(new operation('x'));
            div.addActionListener(new operation('/'));
            per.addActionListener(new operation('%'));
            clear.addActionListener(new clearButton());
            calculate.addActionListener(new calci());
            
            bp.add(add);
            bp.add(sub);
            bp.add(mul);
            bp.add(div);
            bp.add(per);
            bp.add(clear);
            bp.add(calculate);
            
            f.add(bp,BorderLayout.CENTER);
            f.setVisible(true);            
      }
      
      class DigitButtonListener implements ActionListener
      {
           @Override
           public void actionPerformed(ActionEvent e)
           {
                 JButton button=(JButton)e.getSource();
                 String txt=button.getText();
                 display.setText(display.getText()+txt);
           }
      }
      class operation implements ActionListener
      {
            private char op;
            public operation(char operator)
            {
                  this.op=operator;
            }
            @Override
            public void actionPerformed(ActionEvent e)
            {
                   n1=Double.parseDouble(display.getText());
                   operator=op;
                   display.setText("");
            }
      }
      
      class clearButton implements ActionListener
      {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                  display.setText("");
                  n1=0;
                  n2=0;
                  operator=' ';
            }
      }
      class calci implements ActionListener
      {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                   n2=Double.parseDouble(display.getText());
                   double result=0;
                   switch (operator)
                   {
                          case '+':result=n1+n2; 
                                   break;
                          case '-':result=n1-n2; 
                                   break;
                          case 'x':result=n1*n2; 
                                   break;
                          case '/':if (n2!=0)
                                       result=n1/n2;
                                   else
                                   {
                                        display.setText("Error! ");
                                        return;     
                                   }
                                   break;
                          case '%':result=n1%n2;
                                   break;

                   }
                   display.setText(Double.toString(result));
            }
      }
      public static void main(String args[])
      {
            new SimpleCalci();
      }
}
