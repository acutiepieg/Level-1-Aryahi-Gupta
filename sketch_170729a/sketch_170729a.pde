int X = 200;
int Y = 350;
void setup(){
size(400,400);
}
void draw(){
background(0,0,0);
fill(52,173,79);
ellipse(X,Y,30,30);
frogInside();

Car car1 = new Car();
display(50,100, 65);
Car car2 = new Car();
display(275,200, 65); 
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
        Y = Y - 10;                                  
  
      //Frog Y position goes up
      
      else if(keyCode == DOWN){
     Y = Y + 10;
      }
        //Frog Y position goes down 
      
      else if(keyCode == RIGHT){
      X = X + 10;
      }
       //Frog X position goes right
      
      else if(keyCode == LEFT){
      X = X - 10;
      {
        //Frog X position goes left
      }
      }
   }
}
void frogInside(){
 if(X > 385){
   X= 385;
}
else if (X < 15){
  X = 15;
}
else if( Y > 385){
  Y = 385;
}
else if(Y < 15){
  Y = 15;
}
}
class Car{
public Car(){
}
}
  

void display(int x , int y,int size) {
  
    fill(0,255,0);
    rect(x , y, size, 50);
  }