package _04_practice._1_skill_practice;

import javax.swing.*;
import java.util.Random;

public class Skill {
    public static void main(String[] args) {

String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int cents = Integer.parseInt(dimes);
JOptionPane.showMessageDialog(null,"You have " + cents*10+ " cents");

        String height = JOptionPane.showInputDialog("How tall are you in inches?");
        int height2 = Integer.parseInt(height);
if (height2<36) {
    JOptionPane.showMessageDialog(null, "Eat your wheaties");
}
 for(int i = 1; i<=10; i++) {
     for (int i2= 1; i2<=3; i2++) {
         if(i2 ==3) {
             System.out.println(i*i2);
         }
     }
 }

        Random random = new Random();
       int random2 = random.nextInt(20);
 System.out.println(random2);

        Random random3 = new Random();
        int random4 = random3.nextInt(10);
        System.out.println(random4);

        JOptionPane.showMessageDialog(null,random2 - random4);



String city = JOptionPane.showInputDialog("What city do you live in?");
if(city.equalsIgnoreCase("san diego")){
    JOptionPane.showMessageDialog(null, "You live in America's finest city!");
}
else{
    JOptionPane.showMessageDialog(null, "You should move to San Diego");
}

String school = JOptionPane.showInputDialog("What school do you go to?");
JOptionPane.showMessageDialog(null, school + " is a fantastic school!");





















    }












}
