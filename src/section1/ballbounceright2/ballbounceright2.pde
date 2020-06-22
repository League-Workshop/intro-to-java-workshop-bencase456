int shpx1 = 0;
int shpy1 = 224;
int shpspeed1 = 4;
int shpspeed2 = 2;
void setup(){
size(256,256);

}

void draw(){
background(#77E3F5);

fill(#F29F31);
ellipse(shpx1,shpy1,64,64);
}
void keyPressed(){
if (keyCode ==RIGHT) {
  shpx1 += shpspeed1;
}


  
  if (keyCode == LEFT) {
  shpx1 -= shpspeed1;
  }
if (keyCode == UP) {
  for(int loop = 0; loop < 5; loop++){
  shpy1 += loop;
  }
}

}
