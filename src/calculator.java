import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener{

	//title,width and height of JFrame
		private String title;
		private int width,height;
		
		private double number1,number2,result;
		private int addc = 0, subc = 0,mulc = 0, divc = 0;
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextArea textarea = new JTextArea(2,10);
		
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JButton button5 = new JButton();
		JButton button6 = new JButton();
		JButton button7 = new JButton();
		JButton button8 = new JButton();
		JButton button9 = new JButton();
		JButton button0 = new JButton();
		JButton buttonadd = new JButton();
		JButton buttonsub = new JButton();
		JButton buttonmul = new JButton();
		JButton buttondiv = new JButton();
		JButton buttondot = new JButton();
		JButton buttonclear = new JButton();
		JButton buttonequal = new JButton();
		
		public calculator(String title,int width,int height){
			this.title = title;
			this.width = width;
			this.height = height;
			
			createDisplay();
		}
		
		public void createDisplay(){
			frame.setSize(width, height);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			frame.setTitle(title);
	
			frame.add(panel);
			panel.setBackground(Color.lightGray);
			Border border = BorderFactory.createLineBorder(Color.RED,4);
			panel.setBorder(border);
			
			panel.add(textarea);
			textarea.setBackground(Color.black);
			Border tBorder = BorderFactory.createLineBorder(Color.blue, 3);
			textarea.setBorder(tBorder);
			
			Font font = new Font("arial",Font.BOLD,33);
			textarea.setFont(font);
			textarea.setForeground(Color.white);
			//to stop expanding of textarea
			textarea.setPreferredSize(new Dimension(2,10));
			//to stop text from moving out of box
			textarea.setLineWrap(true);
			
			//add image to buttons
			button1.setPreferredSize(new Dimension(100,35));
			button1.setIcon(new ImageIcon(this.getClass().getResource("button\\button1.png")));
			
			button2.setPreferredSize(new Dimension(100,35));
			button2.setIcon(new ImageIcon(this.getClass().getResource("button\\button2.png")));
			
			button3.setPreferredSize(new Dimension(100,35));
			button3.setIcon(new ImageIcon(this.getClass().getResource("button\\button3.png")));
			
			button4.setPreferredSize(new Dimension(100,35));
			button4.setIcon(new ImageIcon(this.getClass().getResource("button\\button4.png")));
			
			button5.setPreferredSize(new Dimension(100,35));
			button5.setIcon(new ImageIcon(this.getClass().getResource("button\\button5.png")));
			
			button6.setPreferredSize(new Dimension(100,35));
			button6.setIcon(new ImageIcon(this.getClass().getResource("button\\button6.png")));
			
			button7.setPreferredSize(new Dimension(100,35));
			button7.setIcon(new ImageIcon(this.getClass().getResource("button\\button7.png")));
			
			button8.setPreferredSize(new Dimension(100,35));
			button8.setIcon(new ImageIcon(this.getClass().getResource("button\\button8.png")));
			
			button9.setPreferredSize(new Dimension(100,35));
			button9.setIcon(new ImageIcon(this.getClass().getResource("button\\button9.png")));
			
			buttondot.setPreferredSize(new Dimension(100,35));
			buttondot.setIcon(new ImageIcon(this.getClass().getResource("button\\buttondot.png")));
		
			button0.setPreferredSize(new Dimension(100,35));
			button0.setIcon(new ImageIcon(this.getClass().getResource("button\\button0.png")));
				
			buttonadd.setPreferredSize(new Dimension(100,35));
			buttonadd.setIcon(new ImageIcon(this.getClass().getResource("button\\buttonadd.png")));
			
			buttonsub.setPreferredSize(new Dimension(100,35));
			buttonsub.setIcon(new ImageIcon(this.getClass().getResource("button\\buttonsub.png")));
			
			buttonmul.setPreferredSize(new Dimension(100,35));
			buttonmul.setIcon(new ImageIcon(this.getClass().getResource("button\\buttonmul.png")));
			
			buttondiv.setPreferredSize(new Dimension(100,35));
			buttondiv.setIcon(new ImageIcon(this.getClass().getResource("button\\buttondiv.png")));

			buttonequal.setPreferredSize(new Dimension(200,35));
			buttonequal.setIcon(new ImageIcon(this.getClass().getResource("button\\buttonequal.png")));
			
			buttonclear.setPreferredSize(new Dimension(100,35));
			buttonclear.setIcon(new ImageIcon(this.getClass().getResource("button\\buttonclear.png")));
			
	
			panel.add(button1);
			panel.add(button2);
			panel.add(button3);
			panel.add(button4);
			panel.add(button5);
			panel.add(button6);
			panel.add(button7);
			panel.add(button8);
			panel.add(button9);
			panel.add(buttondot);
			panel.add(button0);
			panel.add(buttonadd);
			panel.add(buttonsub);
			panel.add(buttonmul);
			panel.add(buttondiv);
			panel.add(buttonequal);
			panel.add(buttonclear);
			
			//add action listener
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			button5.addActionListener(this);
			button6.addActionListener(this);
			button7.addActionListener(this);
			button8.addActionListener(this);
			button9.addActionListener(this);
			button0.addActionListener(this);
			buttondot.addActionListener(this);
			buttonadd.addActionListener(this);
			buttonsub.addActionListener(this);
			buttonmul.addActionListener(this);
			buttondiv.addActionListener(this);
			buttonclear.addActionListener(this);
			buttonequal.addActionListener(this);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			
			if(source == button1){
				textarea.append("1");
			}
			
			if(source == button2){
				textarea.append("2");
			}
			
			if(source == button3){
				textarea.append("3");
			}
			
			if(source == button4){
				textarea.append("4");
			}
			
			if(source == button5){
				textarea.append("5");
			}
			
			if(source == button6){
				textarea.append("6");
			}
			
			if(source == button7){
				textarea.append("7");
			}
			
			if(source == button8){
				textarea.append("8");
			}
			
			if(source == button9){
				textarea.append("9");
			}
			
			if(source == button0){
				textarea.append("0");
			}
			
			if(source == buttondot){
				textarea.append(".");
			}
			
			if(source == buttonadd){
				number1 = numberReader();
				textarea.setText("");
				addc = 1;
				subc = 0;
				mulc = 0;
				divc = 0;
			}
			
			if(source == buttonsub){
				number1 = numberReader();
				textarea.setText("");
				addc = 0;
				subc = 1;
				mulc = 0;
				divc = 0;
			}
			
			if(source == buttonmul){
				number1 = numberReader();
				textarea.setText("");
				addc = 0;
				subc = 0;
				mulc = 1;
				divc = 0;
			}
			
			if(source == buttondiv){
				number1 = numberReader();
				textarea.setText("");
				addc = 0;
				subc = 0;
				mulc = 0;
				divc = 1;
			}
			
			if(source == buttonclear){
				textarea.setText("");
				//no other operation performed
				number1 = 0.0;
				number2 = 0.0;
			}
			
			if(source == buttonequal){
				number2 = numberReader();
				
				//see if to add or subtract or multiply or divide
				if(addc == 1){
					result = number1 + number2;
				}
				else if(subc == 1){
					result = number1 - number2;
				}
				else if(mulc == 1){
					result = number1 * number2;
				}
				else if(divc == 1){
					result = number1 / number2;
				}
				
				//set textarea with result
				textarea.setText(String.valueOf(result));
			}
			
		}
		
		public double numberReader(){
			double num;
			String s;
			//store content of textArea
			s = textarea.getText();
			num = Double.valueOf(s);
			return num;
		}
}