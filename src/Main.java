import processing.core.PApplet;

import java.util.ArrayList;




public class Main extends PApplet {
    private String[] wordBank;
    private String guess;
    private String[]previousGuesses;


        String[] wordBank = {"towel", "phone", "sound", "watch"};

        public void settings () {
            size(400, 800);
        }

        public void draw () {
            //start button
            rect(100, 200, 100, 50);

            //enter button

            rect(300, 200, 90, 50);

            Board board = Board(200, 100, 200, 500, new String[] {"token", "trees"}, "hello");
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
        keyPressed();

        //call to enter method

        //check method

    }


    //key pressed to guess

    public void keyPressed() {
        // guess="";
        if (!isGameOver && guess.size() < 5) {
            guess = guess + key;
        }
        if (guess.size() == 5) {
            check();
            // System.out.println("Click Enter!")
            guessList(guess);//add to check
        }
    }
}
