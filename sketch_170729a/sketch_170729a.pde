int X = 200;
int Y = 350;
void setup(){
size(400,400);
}
void draw(){
background(0,0,0);
fill(52,173,79);
ellipse(X,Y,30,30);
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
        Y++;                                  
  }
      //Frog Y position goes up
      
      else if(keyCode == DOWN){
      Y
        {
        //Frog Y position goes down 
      }
      else if(keyCode == RIGHT)
      {
       //Frog X position goes right
      }
      else if(keyCode == LEFT)
      {
        //Frog X position goes left
      }
   }
}