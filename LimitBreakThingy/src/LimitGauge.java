import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

//Coded by Brandon Black (MagicSheep)
//Date: 11/17/20 (dd/mm/yy)
//I was asked to make something to act as a limit meter so here it is

/*
 * Description of all used variables:
 * JLabel Limit: Displays the text "Limit Meter:"
 * JSpinner LimitValue: Holds the number for the limit gauge. Is influenced by the various buttons in the frame.
 * JButton Faint: Adds 33 to the LimitValue spinner.
 * JButton Hit: Adds 1 to the LimitValue spinner.
 * JButton Heal: Adds 2 to the LimitValue spinner.
 * JButton Kill: Adds 2.25 to the LimitValue spinner.
 * JButton Dodge: Adds 1.5 to the LimitValue spinner.
 * JButton Whew: Adds 1.75 to the LimitValue spinner.
 * JButton RP: Adds 3 to the LimitValue spinner.
 * JButton Support: Adds 0.75 to the LimitValue spinner.
 * JButton Crit: Adds 5 to the LimitValue spinner.
 * JButton Fail: Removes 3.5 from the LimitValue spinner.
 * JButton Display: Displays the numerical value of each button.
 * JButton Clear: Sets the value of LimitValue to 0.0.
 * double LB: Set to 0.0 initially, is used to hold the value of LimitValue for math operations.
 * double LBPlus: Set to 0.0 initially, is used to add or subtract values to/from LB and set to LimitValue.
 * 
 */

public class LimitGauge {
	
	//Public declarations
	private JFrame frame;
	private JSpinner LimitValue;
	private double LB = 0.0;
	private double LBPlus = 0.0;
	
	//Construct the Limit Meter
	public LimitGauge() {
		
		//Declarations
		frame = new JFrame();
		JLabel LimitText = new JLabel("Limit Break Progress");
		LimitValue = new JSpinner();
		JButton Faint = new JButton("Faint");
		JButton Hit = new JButton("Hit");
		JButton Heal = new JButton("Heal");
		JButton Kill = new JButton("Kill");
		JButton Dodge = new JButton("Dodge");
		JButton Whew = new JButton("Whew");
		JButton RP = new JButton("RP");
		JButton Support = new JButton("Support");
		JButton Crit = new JButton("Crit");
		JButton Fail = new JButton("Fail");
		JButton Clear = new JButton("Clear");
		JButton Stats = new JButton("Stats");
		
		//Set LimitValue to 0.0
		//The removal of this line will break everything. The buttons wil not work as intended.
		LimitValue.setValue(0.0);
		
		//Listeners
		
		Faint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0.0;
				
				LBPlus = LB + 33.0;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Faint action listener
		
		Hit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0;
				
				LBPlus = LB + 1.0;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Hit action listener
		
		Heal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0;
				
				LBPlus = LB + 2.0;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Heal action listener
		
		Kill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0;
				
				LBPlus = LB + 2.25;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Kill action listener
		
		Dodge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0.0;
				
				LBPlus = LB + 1.5;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Dodge action listener
		
		Whew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0.0;
				
				LBPlus = LB + 1.75;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Whew action listener
		
		RP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0.0;
				
				LBPlus = LB + 3.0;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end RP action listener
		
		Support.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0.0;
				
				LBPlus = LB + 0.75;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Support action listener
		
		Crit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0.0;
				
				LBPlus = LB + 5.0;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Crit action listener
		
		Fail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LB = (double) LimitValue.getValue();
				LBPlus = 0.0;
				
				LBPlus = LB - 3.5;
				LimitValue.setValue(Double.valueOf(LBPlus));
			}
		});//end Fail action listener
		
		Stats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Every [33] is one LB tick. LB is currently capped at one tick." + "\n" + "\n"
													+ "Party Member faints {FAINT} = immediate first bar (33)" + "\n"
													+ "Hit target {HIT}: 1" + "\n"
													+ "Heal target {HEAL}: 2" + "\n"
													+ "Kill target {KILL}: 2.25" + "\n"
													+ "Dodge Target {DODGE}: 1.5" + "\n"
													+ "Survive Critical Hit {WHEW}: 1.75" + "\n"
													+ "Do Something Super in Character {RP}: 3" + "\n"
													+ "Support an Ally: 0.75 {SUPPORT}" + "\n"
													+ "Natural 20 {CRITICAL}: 5" + "\n"
													+ "Natural 1 {FAIL}: -3.5" + "\n");
			}
		});//end Stats action listener
		
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LimitValue.setValue(0.0);
			}
		});//end Clear action listener
		
		
		//Set the size/potition of things  (x, y, width, height)
		LimitText.setBounds(105, 25, 130, 25);
		LimitValue.setBounds(135, 45, 50, 20);
		Faint.setBounds(40, 85, 75, 15); //Row 1 pos 1
		Hit.setBounds(120, 85, 75, 15); //Row 1 pos 2
		Heal.setBounds(200, 85, 75, 15); //Row 1 pos 3
		Kill.setBounds(40, 105, 75, 15); //Row 2 pos 1
		Dodge.setBounds(120, 105, 75, 15); //Row 1 pos 2
		Whew.setBounds(200, 105, 75, 15); //Row 1 pos 3
		RP.setBounds(40, 125, 75, 15); //Row 3 pos 1
		Support.setBounds(120, 125, 75, 15); //Row 3 pos 2
		Crit.setBounds(200, 125, 75, 15); //Row 1 pos 3
		Fail.setBounds(40, 145, 75, 15); //Row 4 pos 1
		Stats.setBounds(120, 145, 75, 15); //row 4 pos 2
		Clear.setBounds(200, 145, 75, 15); //Row 4 pos 3

		
		
		//Adjust colors as needed
		LimitText.setForeground(Color.WHITE);
		
		
		//Add to the frame
		frame.add(LimitText);
		frame.add(LimitValue);
		frame.add(Faint);
		frame.add(Hit);
		frame.add(Faint);
		frame.add(Heal);
		frame.add(Kill);
		frame.add(Dodge);
		frame.add(Whew);
		frame.add(RP);
		frame.add(Support);
		frame.add(Crit);
		frame.add(Fail);
		frame.add(Stats);
		frame.add(Clear);
		
		//Frame Stuff
		frame.setSize(335, 240); //width, height
		frame.setLayout(null); 
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Limit Meter");
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		
		
	}//end LimitGauge constructor

	public static void main(String[] args) {
		
		//Make the stuff go
		new LimitGauge();

	}//end main

}//end class LimitGauge
