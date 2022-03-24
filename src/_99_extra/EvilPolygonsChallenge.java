package _99_extra;
import java.awt.*;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {

		//1. Create a new Robot
Robot rob = new Robot();
		//2. Set the speed to 100
rob.setSpeed(100);
rob.hide();
		int colorChoice=JOptionPane.showOptionDialog(null, "What color would you like your polygons?", "Color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"red","blue", "black"}, 0);
		
		//3. Use if statements to check the value of colorChoice and set the pen color accordingly
		if(colorChoice == 1){
			rob.setPenColor(Color.red);
		}
		if(colorChoice == 2){
			rob.setPenColor(Color.blue);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String num = JOptionPane.showInputDialog("How many polygons do you want?");
		//5. Use the robot to draw the number of polygons the user requested.
		int num2 = Integer.parseInt(num);
		int num3 = 0;
		while(num3 < num2) {
			rob.penDown();
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			num3++;
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

