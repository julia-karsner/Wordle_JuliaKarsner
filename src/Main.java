import processing.core.PApplet;

import java.util.ArrayList;




public class Main extends PApplet {
    private final String[] wordBank= {"towel", "phone", "sound", "watch"};
    private String guess;
    private ArrayList<String> guessList;


    public void setup() {



        board = Board(200, 100, 200, 500);


    }


        public void settings () {
            size(400, 800);
        }

        public void draw () {
            //start button
            rect(100, 200, 100, 50);

            //enter button

            rect(300, 200, 90, 50);

            //example of object to create

            //draw print letters
           // for(int i=i;i<)
            board.draw();

        }
//generate index of array to choose random word
        public int getIndexWord () {

            int x = (int) (Math.random() * wordBank.length);
        }

        // mouseclick for start button if mouse clicked reset play game
        public void mouseClicked () {
            // start button
            if (mouseX > 0 && mouseX < 100 && mouseY > 150 && mouseY < 200) {
                playGame();
            }

            // enter button
            if (mouseX > 300 && mouseX < 390 && mouseY > 150 && mouseY < 200) ;//fix
            check();//write method
        }

    public void playGame() {
        String word = wordBank[getIndexWord()];
        System.out.println("Take a guess and click enter to submit!");

        //call to enter method

        //check method

    }


    //key pressed to guess

    public void keyPressed() {
        // guess="";
        if (!isGameOver() && guess.length() < 5) {
            guess = guess + key;
        }
        if (guess.length() == 5) {
            stateEvaluation();// call state
            // System.out.println("Click Enter!")


            guessList(guess);//add to check
        }
    }
}
