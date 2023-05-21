import processing.core.PApplet;

import java.util.ArrayList;

private String[]wordBank;
private String guess;
private Square[][] squares;
public class Main extends PApplet {
    public static void main(String[] args) {


    String[] wordBank = {"towel", "phone", "sound", "watch"};

    public void settings() {
        size(400, 800);
    }

    public void draw() {


        //start button
        rect(100, 200, 100, 50);

        //enter button

        rect(300,200,90,50);





    }
//generate index of array to choose random word
    public int getIndexWord() {

        int x = (int) (Math.random() * wordBank.length);
    }

   // mouseclick for start button if mouse clicked reset play game
    public void mouseClicked() {
        if (mouseX > 0 && mouseX < 100 && mouseY > 150 && mouseY < 200) {
            playGame();
        }

        if(mouseX>300 && mouseX<390 && mouseY>150 && mouseY <200);//fix
        check();//write method
    }
    }

    public void playGame() {
        String word = wordBank[getIndexWord()];
        System.out.println("Take a guess and click enter to submit!");
        keyPressed();

        //call to enter method

        //check method

    }




        //keypressed to guess

        public void keyPressed(){
            guess="";
         while(guess.size()<=5){
             guess = guess + key;
            text(key, board[row][col];
            guessList(guess);
            }

        }


        //getguess



    }







}