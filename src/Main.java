import processing.core.PApplet;

import java.util.ArrayList;




public class Main extends PApplet {
    private final String[] wordBank= {"towel", "phone", "sound", "watch"};
    private String guess="";
    private ArrayList<String> guessList = new ArrayList<String>();

    private String mysteryWord="found";
    public static Main app;

    public static void main (String[] args){
        PApplet.main("Main");
    }

    public Main(){
        super();
        app = this;
    }

    public void setup() {

//
//
//        board = Board(200, 100, 200, 500);


    }


        public void settings () {
            size(400, 800);
        }

        public void draw () {
            //start button
           // rect(100, 200, 100, 50);

            //enter button

         //   rect(300, 200, 90, 50);

            //example of object to create

            //draw print letters
           // for(int i=i;i<)
//            board.draw();

            // print the guess list
            for(int i=0; i<guessList.size();i++) {
                String word = guessList.get(i);
                for (int j = 0; j < word.length(); j++) {
                    char letter = word.charAt(j);

                    if(letter==mysteryWord.charAt(j)) {
                        // green: letter is correct and in correct place
                        fill(0, 255, 0);
                    } else if(mysteryWord.indexOf(letter)>=0){
                        fill(255,255,0);

                    }

                    else {
                        // gray: letter is not in the word at all
                        fill(120);
                    }

                    // yellow: letter is in the word, but in the incorrect place
                    text(letter, j * 50 + 50, i * 60 + 60);
                }
            }

            // print the guess
            for(int i=0;i<guess.length();i++){
                fill(255);
                text(guess.charAt(i),50+(50*i),guessList.size() * 60 + 60);
            }

           if(isWin()) {
               fill(255);
               text("You got it!", 180, 400);
           }

           if(youLose()){
               fill(255);
               text("Loser",180,400);
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
            if (mouseX > 0 && mouseX < 100 && mouseY > 150 && mouseY < 200) {
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
        String word = wordBank[getIndexWord()];
        System.out.println("Take a guess and click enter to submit!");

        //call to enter method

        //check method

    }


    //key pressed to guess

    public void keyPressed() {
        if ( guess.length() < 5&& guessList.size()<6) {
            guess = guess + key;
       }
        if(guess.length()==5){
            guessList.add(guess);
            guess = "";
            System.out.println(guessList);



        }
      // if (guess.length() == 5) {
        //    stateEvaluation();// call state
            // System.out.println("Click Enter!")


      //      guessList(guess);//add to check
      //  }
    System.out.println(guess);
    }
}
