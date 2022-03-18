package _03_method_writing._1_obedient_robot;


import org.jointheleague.graphical.robot.Robot;

import javax.swing.*;
import java.awt.*;

public class ObedientRobot {

    public static void main(String[] args) {

Robot rob = new Robot();
rob.penDown();
rob.setSpeed(100);
String color = JOptionPane.showInputDialog("Choose a color, red, blue, or black.");
String shape = JOptionPane.showInputDialog("Choose a shape, square, triangle, or circle.");
if(color.equalsIgnoreCase("red")) {
    rob.setPenColor(Color.red);
}
        if(color.equalsIgnoreCase("blue")) {
            rob.setPenColor(Color.blue);
        }


if(shape.equalsIgnoreCase("square")) {
    rob.move(200);
    rob.turn(90);
    rob.move(200);
    rob.turn(90);
    rob.move(200);
    rob.turn(90);
    rob.move(200);
    rob.turn(90);
}
        if(shape.equalsIgnoreCase("triangle")) {
            rob.move(200);
            rob.turn(120);
            rob.move(200);
            rob.turn(120);
            rob.move(200);
            rob.turn(120);
        }
        if(shape.equalsIgnoreCase("circle")) {

            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);
            rob.move(10);
            rob.turn(10);

        }






    }









}
