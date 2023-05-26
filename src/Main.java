

import processing.core.PApplet;

import java.util.ArrayList;




public class Main extends PApplet {
    private final String[] wordBank= {"towel", "phone", "sound", "watch","petal","metal","cards","stilt","route","shaky","vegan","power","dowel","trust","candy"};
    private String guess="";
    private ArrayList<String> guessList = new ArrayList<String>();

    private String mysteryWord;
    public static Main app;

    public static void main (String[] args){
        PApplet.main("Main");
    }

    public Main(){
        super();
        app = this;
    }

    public void setup() {
       // g.line(50,40,90,100);
        textSize(27);
         mysteryWord=wordBank[getIndexWord()];
      // size(400, 400);
       // line(120, 80, 340, 300);
        //fill(255);

        //stroke(126);
        //line(340, 80, 60, 340, 300, 0);
        //stroke(255);
        //line(340, 300, 0, 120, 300, -200);


//
//
//        board = Board(200, 100, 200, 500);


    }


        public void settings () {
            size(400, 600);
        }

        public void draw () {

           background(0);

            fill(194, 239, 242);
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 5; j++) {
                    rect(j * 50 + 70, i * 60 + 25, 50, 50);
                }
            }


                //start button
                fill(200, 100, 5);
                rect(120, 500, 170, 80);
                fill(0);
                text("RESET", 170, 550);


                //enter button

                //   rect(300, 200, 90, 50);

                //example of object to create

                //draw print letters
                // for(int i=i;i<)
//            board.draw();

                // print the guess list
                for (int i = 0; i < guessList.size(); i++) {
                    String word = guessList.get(i);
                    for (int j = 0; j < word.length(); j++) {
                        char letter = word.charAt(j);

                        if (letter == mysteryWord.charAt(j)) {
                            // green: letter is correct and in correct place
                            fill(0, 255, 0);
                        } else if (mysteryWord.indexOf(letter) >= 0) {
                            fill(255, 255, 0);

                        } else {
                            // gray: letter is not in the word at all
                            fill(120);
                        }

                        // yellow: letter is in the word, but in the incorrect place

                        text(letter, j * 50 + 90, i * 60 + 60);

                    }

                }

                // print the guess
                for (int i = 0; i < guess.length(); i++) {
                    fill(255);
                    text(guess.charAt(i), 90 + (50 * i), guessList.size() * 60 + 60);
                }

                if (isWin()) {
                    fill(255);
                    text("You got it!", 130, 450);
                }

                if (youLose()) {
                    fill(255);
                    text("Loser", 160, 450);
                    text("The correct word is: " + mysteryWord, 90, 490);
                }
                if (guessList.size() > 0 && !isWin() && !youLose()) {//make so appear
                    fill(255);
                    text("Guess Again", 130, 450);
                }
            }

//generate index of array to choose random word
        public int getIndexWord() {

            int x = (int) (Math.random() * wordBank.length);
            return x;
        }

        // mouseclick for start button if mouse clicked reset play game
        public void mouseClicked () {
            // start button
            if (mouseX > 120 && mouseX < 290 && mouseY > 500 && mouseY < 580) {
                playGame();
            }



//            // enter button
//            if (mouseX > 300 && mouseX < 390 && mouseY > 150 && mouseY < 200) ;//fix
//            check();//write method
        }

        public boolean isWin(){
           return (guessList.size()>0 && guessList.get(guessList.size()-1).equals(mysteryWord));
        }

        public boolean youLose() {
            return (guessList.size() == 6 && !isWin());

        }
    public void playGame() {
        guessList=new ArrayList<String>();
        guess="";
       // String word = wordBank[getIndexWord()];

        mysteryWord=wordBank[getIndexWord()];
        System.out.println("Take a guess and click enter to submit!");


        //call to enter method

        //check method

    }


    //key pressed to guess

    public void keyPressed() {

        if(key==DELETE && guess.length()>0){
            guess=guess.substring(0,guess.length()-1);
        }else if ( Character.isAlphabetic(key) && guess.length() < 5&& guessList.size()<6&& !isWin() ) {
            guess = guess + key;
       }


        if(guess.length()==5) {
            guessList.add(guess);
            guess = "";
            System.out.println(guessList);

        }//if(guessList.size()>0&& key=='\n'){
//        public void line(float x1, float y1, float z1,
//        float x2, float y2, float z2) {
//            g.line(x1, y1, z1, x2, y2, z2);
//        }



        }
      // if (guess.length() == 5) {
        //    stateEvaluation();// call state
            // System.out.println("Click Enter!")


      //      guessList(guess);//add to check
      //  }
    //System.out.println(guess);
    }

