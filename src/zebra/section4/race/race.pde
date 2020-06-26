//Graphics from pngtree.com https://pngtree.com/


PImage cat;
PImage dog;
PImage background;

int catX = 00;
int catY = 100;
int dogX = 0;
int dogY = 300;


void setup() {
  size(1200, 500); 
  textSize(35);
  cat = loadImage("lion.png");
  dog = loadImage("dog.png");
  background = loadImage("space.png");
  background.resize(width, height);
  /* ▼ Write code BELOW this line ▼ */




  
  /* ▲ Write code ABOVE this line ▲*/
}


void draw() {
  background(background);
  /* ▼ Write code BELOW this line ▼ */
  
  moveCat();
  moveDog();





  
  /* ▲ Write code ABOVE this line ▲*/
  image(cat, catX, catY);
  image(dog, dogX, dogY);
  
  checkForWinner();
}

void moveCat(){
  catX = catX + (int)random(10);
}

void moveDog(){
  dogX = dogX + (int)random(10);
}

void checkForWinner(){
  if (catX>width-60){
    text("CATS ARE THE BEST", 400, 50); 
   
    noLoop();
  }
  
  if (dogX>width-60){
    text("DOGS RULE", 500, 50); 
  
    noLoop();
  }
}
 
    
