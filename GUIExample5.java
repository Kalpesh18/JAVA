import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class GUIExample5
{
	public static void main(String[] args) 
	{
	 EditWindow ew = new EditWindow();
	}
}

public class EditWindow implements ActionListener
{

	static JPanel EastJP,WestJP,NorthJP,SouthJP,CenterJP;
	
	public int center=0,north=0,south=0,west=0,east=0;
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof JButton)
		{
			JButton button = (JButton)e.getSource();
			Color selectedColor = Color.WHITE;
		
			if(button.getText().equals("Red"))
				selectedColor = Color.RED;
			else if(button.getText().equals("Blue"))
				selectedColor = Color.BLUE;
			else if(button.getText().equals("Yellow"))
				selectedColor = Color.YELLOW;
			else if(button.getText().equals("White"))
				selectedColor = Color.WHITE;
			else if(button.getText().equals("Black"))
				selectedColor = Color.BLACK;	
				
			if(center == 1)
				CenterJP.setBackground(selectedColor);
			if(north == 1)
				NorthJP.setBackground(selectedColor);
			if(south == 1)
				SouthJP.setBackground(selectedColor);
			if(west == 1)
				WestJP.setBackground(selectedColor);
			if(east == 1)
				EastJP.setBackground(selectedColor);
		}
		else if(e.getSource() instanceof JCheckBox)
		{
			JCheckBox chk = (JCheckBox)e.getSource();
			if(chk.getName().equals("Center"))
			{
				if(chk.isSelected())
					center = 1;
				else
					center = 0;
			}
			if(chk.getName().equals("Left"))
			{
				if(chk.isSelected())
					west = 1;
				else
					west = 0;
			}
			if(chk.getName().equals("Right"))
			{
				if(chk.isSelected())
					east = 1;
				else
					east = 0;
			}
			if(chk.getName().equals("Top"))
			{
				if(chk.isSelected())
					north = 1;
				else
					north = 0;
			}
			if(chk.getName().equals("Down"))
			{
				if(chk.isSelected())
					south = 1;
				else
					south = 0;
			}
			
			
		}
	}
	
	EditWindow()
	{ 
		// The window object
		JFrame jf = new JFrame("Fill Colours"); 
		Toolkit theKit = jf.getToolkit();                // Get the window toolkit 
		Dimension wndSize = theKit.getScreenSize();           // Get screen size 

		// Set the position to screen center & size to half screen size 
		jf.setBounds(0, 0, wndSize.width, wndSize.height-40);         // Size 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		BorderLayout border = new BorderLayout();                 // Create a layout manager 
		Container content = jf.getContentPane();             // Get the content pane 
		content.setLayout(border);                             // Set the container layout mgr 
		EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);              // Button border 
		
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		
		
		
		
		
		/*jp1.add(new JCheckBox("Fill"));
		content.add(jp1,BorderLayout.WEST);*/ 
		
		
		
		
		jp1.setLayout(new BoxLayout(jp1, BoxLayout.PAGE_AXIS));
		jp1.add(Box.createRigidArea(new Dimension(5,155)));
		jp1.setBorder(BorderFactory.createLineBorder(Color.black));
		content.add(jp1,BorderLayout.WEST); 
		//jp1.setBackground(Color.RED);
		WestJP = jp1;
		
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.PAGE_AXIS));
		jp2.add(Box.createRigidArea(new Dimension(0,5)));
		jp2.setBorder(BorderFactory.createLineBorder(Color.black));
		content.add(jp2,BorderLayout.EAST);
		//jp2.setBackground(Color.YELLOW);
		EastJP = jp2;
		
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.PAGE_AXIS));
		jp3.add(Box.createRigidArea(new Dimension(0,5)));
		jp3.setBorder(BorderFactory.createLineBorder(Color.black));
		content.add(jp3,BorderLayout.NORTH);
		//jp3.setBackground(Color.WHITE);
		NorthJP = jp3;
		
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.PAGE_AXIS));
		jp4.add(Box.createRigidArea(new Dimension(0,5)));
		jp4.setBorder(BorderFactory.createLineBorder(Color.black));
		content.add(jp4,BorderLayout.SOUTH);
		//jp4.setBackground(Color.BLACK);
		SouthJP = jp4;
		
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.PAGE_AXIS));
		jp5.add(Box.createRigidArea(new Dimension(0,5)));
		jp5.setBorder(BorderFactory.createLineBorder(Color.black));
		content.add(jp5,BorderLayout.CENTER);
		//jp5.setBackground(Color.PINK);
		CenterJP = jp5;

		JButton button1 = new JButton("Red");
		button1.addActionListener(this);
		jp1.add(button1);
		
		JButton button2 = new JButton("Blue");
		button2.addActionListener(this);
		jp1.add(button2);		
		
		JButton button3 = new JButton("Yellow");
		button3.addActionListener(this);
		jp1.add(button3);
		
		JButton button4 = new JButton("White");
		button4.addActionListener(this);
		jp1.add(button4);
		
		JButton button5 = new JButton("Black");
		button5.addActionListener(this);
		jp1.add(button5);
		
		// Create right columns of checkboxes 
		JCheckBox checkbox1 = new JCheckBox("Left"); 
		JCheckBox checkbox2 = new JCheckBox("Right"); 
		JCheckBox checkbox3 = new JCheckBox("Top"); 
		JCheckBox checkbox4 = new JCheckBox("Down"); 
		JCheckBox checkbox5 = new JCheckBox("Center"); 
		
		checkbox1.setName("Left");
		checkbox2.setName("Right");
		checkbox3.setName("Top");
		checkbox4.setName("Down");
		checkbox5.setName("Center");
		
		checkbox1.addActionListener(this);
		checkbox2.addActionListener(this);
		checkbox3.addActionListener(this);
		checkbox4.addActionListener(this);
		checkbox5.addActionListener(this);
		
	/*	checkbox1.add(new JCheckBox("Left")); 
		checkbox2.add(new JCheckBox("Right")); 
		checkbox3.add(new JCheckBox("Top")); 
		checkbox4.add(new JCheckBox("Down")); 
		checkbox5.add(new JCheckBox("Center")); */
		
		//content.add(checkbox1, BorderLayout.EAST);
		//content.add(checkbox2, BorderLayout.WEST);
		//content.add(checkbox3, BorderLayout.NORTH);
		//content.add(checkbox4, BorderLayout.SOUTH);
		//content.add(checkbox5, BorderLayout.CENTER);
		jp1.add(checkbox1);
		jp2.add(checkbox2);
		jp3.add(checkbox3);
		jp4.add(checkbox4);
		jp5.add(checkbox5);
	
	
//		addComponent(content);
		
		jf.setVisible(true);                                         // Display the window 
	} 
}
