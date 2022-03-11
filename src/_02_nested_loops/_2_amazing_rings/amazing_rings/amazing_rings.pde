
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(2000,1000);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}
int x = 700;
  int x2 =1500;
 int speed =2;
void draw() {
background(200,200,200);
  
  
  
        /* Use a for loop to make the first set of rings that will start in the left half of the window
  (you can use the code from your Bullseye program).*/  
  int i = 700;
while(i>0){
  stroke(#000000);
  ellipse(x,700 , i, i);
  i-=50;
 if (i==50){
   x+=speed;
   if(x>=width-350|| x<=350) {
     speed=-speed;
   }
   
   
 }
 
  }
  int a =700;
  while(a>0){
  stroke(#000000);
  ellipse(x2,700 , a, a);
  a-=50;
 if (a==50){
   x2-=speed;
   if(x2>=width-350|| x2<=350) {
     speed=-speed;
   }
   
   
 }
 
  }
  
  
}

  //  stroke(#000000);
 // ellipse(x2,700 , i, i);
 
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */

         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
