import processing.core.PApplet;

import java.util.ArrayList;

private String[]wordBank;
private String guess;
public class Main extends PApplet {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    String[] wordBank = {"towel", "phone", "sound", "watch"};

    public void settings() {
        size(400, 800);
    }

    public void draw() {
        int x = 100;
        int y = 600;
        int size = 30;
        //first row
        Rectangle a= rect(x, y, size, size);
        rect(150, y, size, size);
        rect(200, y, size, size);
        rect(250, y, size, size);
        rect(300, y, size, size);

        //second row
        rect(x, 500, size, size);
        rect(150, 500, size, size);
        rect(200, 500, size, size);
        rect(250, 500, size, size);
        rect(300, 500, size, size);

        //third row
        rect(x, 400, size, size);
        rect(150, 400, size, size);
        rect(200, 400, size, size);
        rect(250, 400, size, size);
        rect(300, 400, size, size);

        //fourth row
        rect(x, 300, size, size);
        rect(150, 300, size, size);
        rect(200, 300, size, size);
        rect(250, 300, size, size);
        rect(300, 300, size, size);

        //fifth row
        rect(x, 200, size, size);
        rect(150, 200, size, size);
        rect(200, 200, size, size);
        rect(250, 200, size, size);
        rect(300, 200, size, size);

        //sixth row
        rect(x, 100, size, size);
        rect(150, 100, size, size);
        rect(200, 100, size, size);
        rect(250, 100, size, size);
        rect(300, 100, size, size);

        //enter button
        rect(200, 30, 70, 90);


    }
//generate index of array to choose random word
    public int getIndexWord() {
        int x = (int) (Math.random() * wordBank.length);
    }

   // mouseclick for start button if mouse clicked reset play game
    public void MouseClicked(){
        playGame();
    }

    public void playGame(){
        String word=wordBank[getIndexWord()];
        System.out.println("Take a guess and click enter to submit!");
        keypressed();



        //keypressed to guess

        public void keyPressed() {
            for (int i = 0; i <= 5; i++) {
                //add something so printed in specific rectangle is key
                String guess = guess + key;
            }

        }


        //enter button mouseclicked

        //if statements to change color
            //if get guess retutn scree
            //if don't get guess in 6 teries return screen


    }






}