import java.util.ArrayList;

    public class Board {

        private int x;

        private int y;
        private int size;
        private int row;
        private int column;
        private SquareState squarestate;//make class
        private String word;

        private ArrayList<String>guessList=new ArrayList<String>();

        public Board(int x, int y, int size, int row, int column, SquareState squareState,String word){//constructor is customizable board
            super();
            this.x=x;
            this.y=y;
            this.size = size;
            this.row = row;
            this.column = column;
            this.squareState=BLANK;
            this.word=getGuess();


        }

        public Board(){
            super();
            this.x=0;
            this.y=0;
            this.size =[6][5] ;
            this.row =0;
            this.column = 0;
            this.squareState=BLANK;
            this.word=getGuess();


        }



        public int getHeight() {
            return row;
        }

        public int getWidth() {
            return col;
        }

        public int countOfGuesses() {//make arraylist to hold all guess list
            return guessList.size();
        }

        //boolean method to indicate if game is still going or over
        public boolean isGameOver() {
            if (guessCorrect || countOfGuesses == getHeight()) {
                return true;
            }
        }

        //arraylist holding all guesses in respective game
        public void guessList(String guess) {//arrarylist that holds all guesses in new game
            while (!isGameOver) {
                if (guess.size() == 5) {
                    guessList.add(guess);
                }
            }
        }


//compares guess to word to evaluate which color each square will be
        public void stateEvaluation(){
            if(guess.equals(word)){
              for(int i=0;i<getRow().length;i++) {
                  squareState = SquareState.GREEN;
                  isGameOver() == true;
              }
            } else{
                for(int i=0;i<guess.size();i++){
                    if(guess.charAt(i)==word.charAt(i)) {
                        squarestate = SquareState.GREEN;
                    }else if(word.contains(guess.charAt(i))){
                        squarestate = SquareState.YELLOW;
                    }else{
                        squarestate = SquareState.BLANK;
                    }
                }


        //draws color of each letter in row according to state evaluation

        public void display(){
            if(squarestate== SquareState.GREEN){
                Main.app.fill(83, 207, 58);
            }
            else if (squarestate== SquareState.YELLOW){
                Main.app.fill(247, 223, 84);
            }
            else{
                Main.app.fill(255);
            }
            Main.app.rect(x,y,size,size);

        }

    }
}
