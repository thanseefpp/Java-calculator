import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	String oldValue;
	boolean addition=false;
	boolean subtract=false;
	boolean multiply=false;
	boolean division=false;
	
	JFrame jf; // added Jframe (jf) here for global access
	JLabel displaylayout;// global access
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;	
	JButton sixButton;
	JButton oneButton;
	JButton twoButton,zeroButton;
	JButton threeButton,clearButton,subtractButton;
	JButton additionButton,multiplyButton,divButton,equalButton,dotButton;
	
	
	public Calculator() 
	{
		jf=new JFrame("Calculator @TS");//if 'jf' has global access, you should remove JFrame name from the object.
		                        //^it will show on the top of your frame
		
		jf.setLayout(null);//No components initialized 
		jf.setSize(330, 450);
		jf.setLocation(300,100);
		
		displaylayout=new JLabel(); //Label used to  display output user's can't input any values.
		displaylayout.setBounds(30, 35, 270, 70);//Bounds used to set layout size and label size.
		displaylayout.setBackground(Color.lightGray);//add color to Label field
		displaylayout.setFont(new Font("Arial",Font.PLAIN,25));
		displaylayout.setOpaque(true);//use (Opaque) this function when you using background color.  
		displaylayout.setHorizontalAlignment(SwingConstants.RIGHT);//this function used to set textfield into right position.
		displaylayout.setForeground(Color.white);//to change text color inside the label.
		jf.add(displaylayout);
		
		sevenButton=new JButton("7");//Creating new button ("Number 7").
		sevenButton.setBounds(30, 130, 60, 60);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,25));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");//Creating new button ("Number 8").
		eightButton.setBounds(100, 130, 60, 60);
		eightButton.setFont(new Font("Arial",Font.PLAIN,25));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");//Creating new button ("Number 9").
		nineButton.setBounds(170, 130, 60, 60);
		nineButton.setFont(new Font("Arial",Font.PLAIN,25));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");//Creating new button ("Number 4").
		fourButton.setBounds(30, 200, 60, 60);
		fourButton.setFont(new Font("Arial",Font.PLAIN,25));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");//Creating new button ("Number 5").
		fiveButton.setBounds(100, 200, 60, 60);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,25));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");//Creating new button ("Number 6").
		sixButton.setBounds(170, 200, 60, 60);
		sixButton.setFont(new Font("Arial",Font.PLAIN,25));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");//Creating new button ("Number 1").
		oneButton.setBounds(30, 270, 60, 60);
		oneButton.setFont(new Font("Arial",Font.PLAIN,25));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");//Creating new button ("Number 2").
		twoButton.setBounds(100, 270, 60, 60);
		twoButton.setFont(new Font("Arial",Font.PLAIN,25));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");//Creating new button ("Number 3").
		threeButton.setBounds(170, 270, 60, 60);
		threeButton.setFont(new Font("Arial",Font.PLAIN,25));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 340, 60, 60);
		dotButton.setFont(new Font("Arial",Font.PLAIN,25));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(100, 340, 60, 60);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,25));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(170, 340, 60, 60);
		equalButton.setFont(new Font("Arial",Font.PLAIN,25));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		clearButton=new JButton("Clear"); //clear label area
		clearButton.setBounds(240, 130, 60, 48);
		clearButton.setFont(new Font("Arial",Font.PLAIN,10));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		divButton=new JButton("/"); //Divide[/]
		divButton.setBounds(240, 185, 60, 48);
		divButton.setFont(new Font("Arial",Font.PLAIN,25));
		divButton.addActionListener(this);
		jf.add(divButton);

		multiplyButton=new JButton("x");//Multiply[*]
		multiplyButton.setBounds(240,240, 60, 48);
		multiplyButton.setFont(new Font("Arial",Font.PLAIN,25));
		multiplyButton.addActionListener(this);
		jf.add(multiplyButton);
		
		subtractButton=new JButton("-");//subtraction[-]
		subtractButton.setBounds(240, 296, 60, 48);
		subtractButton.setFont(new Font("Arial",Font.PLAIN,25));
		subtractButton.addActionListener(this);
		jf.add(subtractButton);
		
		additionButton=new JButton("+");//Addition[+]
		additionButton.setBounds(240, 352, 60, 48);
		additionButton.setFont(new Font("Arial",Font.PLAIN,25));
		additionButton.addActionListener(this);
		jf.add(additionButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to stop running after click close button. 
		
	}
	
	public static void main(String[] args) 
	{
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) 
		{
			if(isOperatorClicked) 
			{
				displaylayout.setText("7");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+"7");
			}

		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) 
			{
				displaylayout.setText("8");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+"8");
			}
		}else if(e.getSource()==nineButton) {
			if(isOperatorClicked) 
			{
				displaylayout.setText("9");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+"9");
			}
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) 
			{
				displaylayout.setText("4");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+"4");
			}
		}else if(e.getSource()==fiveButton) {
				if(isOperatorClicked) 
				{
					displaylayout.setText("5");
					isOperatorClicked=false;//to disappear from the label area
				}else {
					displaylayout.setText(displaylayout.getText()+"5");
				}
		}else if(e.getSource()==sixButton) {
				if(isOperatorClicked)
				{
					displaylayout.setText("6");
					isOperatorClicked=false;//to disappear from the label area
				}else {
					displaylayout.setText(displaylayout.getText()+"6");
				}
		}else if(e.getSource()==oneButton) {
				if(isOperatorClicked) 
				{
					displaylayout.setText("1");
					isOperatorClicked=false;//to disappear from the label area
				}else {
					displaylayout.setText(displaylayout.getText()+"1");
				}
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) 
			{
				displaylayout.setText("2");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) 
			{
				displaylayout.setText("3");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+"3");
			}
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) 
			{
				displaylayout.setText("0");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+"0");
			}
		}else if(e.getSource()==dotButton) {
			if(isOperatorClicked) 
			{
				displaylayout.setText(".");
				isOperatorClicked=false;//to disappear from the label area
			}else {
				displaylayout.setText(displaylayout.getText()+".");
			}
		}else if(e.getSource()==divButton) {
			isOperatorClicked= true;
			division=true;//to enable division function 
			oldValue=displaylayout.getText();
			
		}else if(e.getSource()==multiplyButton) {
			multiply=true;//to enable multiply function 
			isOperatorClicked= true;
			oldValue=displaylayout.getText();
			
		}else if(e.getSource()==additionButton) {
			
			addition=true;//to enable addition function 
			isOperatorClicked= true;
			oldValue=displaylayout.getText();
			
		}else if(e.getSource()==subtractButton) {
			
			subtract=true;//to enable subtract function 
			isOperatorClicked= true;
			oldValue=displaylayout.getText();
			
		}else if(e.getSource()==equalButton) {
			
			String newValue=displaylayout.getText();
			float oldValueF=Float.parseFloat(oldValue);//you can use double or integer 
			float newValueF=Float.parseFloat(newValue);//here values that stored in oldvalue and newvalue it will assign to newvalueF and oldvalueF.
			
			float result=0; //here result variable set to zero or use string
			
			if(addition) //if addition boolean value true then execute below statement
			{
				result=oldValueF+newValueF;
			}
			else if(subtract)//if subtract boolean value true then execute below statement
			{
				result=oldValueF-newValueF;
			}
			else if(multiply)//if multiply boolean value true then execute below statement
			{
				result=oldValueF*newValueF;
			}
			else if(division) //if division boolean value true then execute below statement 
			{
				result=oldValueF/newValueF;
			}
			
			displaylayout.setText(result+"");//Output
			
			addition=false;
			subtract=false;
			multiply=false;
			division=false;
		}
		else if(e.getSource()==clearButton) //when the user click clr button it will clear label textfield
		{
			displaylayout.setText("");
		}
		
	}

}
Java-calculator
