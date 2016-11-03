  int up = 218;
  int down = 217;
  int left = 216;
  int right = 215;
#include "Keyboard.h"
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  Serial.println("hello");
  Keyboard.begin();
  
}

void loop() {
  // put your main code here, to run repeatedly:
  
  Keyboard.write(up);
  delay(300);
  Keyboard.write(right);
  delay(200);
  Keyboard.write(down);
  delay(600);
  Keyboard.write(left);
  delay(200);
  Keyboard.write(up);
  delay(600);
}
