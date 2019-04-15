PImage mustache;
PImage Thanos;
void setup(){
  size(800,600);
  Thanos=loadImage("Thanos.jpg");
  Thanos.resize(800,600);
  mustache=
loadImage("mustache.png");
    mustache.resize(400, 200);}
void draw(){
background(Thanos);
if(mousePressed){
image(mustache, mouseX, mouseY);}
   
}