import java.util.Arrays;

public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    public InputReader reader;
    private String letter;
    
    public WordGuessingGame (){
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        this.reader = reader;
    }
    
    private String getHiddenWord(){
        return hiddenWord;
    }
    
    private void setHiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord;
    }
    
    private String getGuessedWord(){
        return guessedWord;
    }
    
    private void setGuessedWord(String guessedWord){
        this.guessedWord = guessedWord;
    }
    
    private int getNumberOfTries(){
        return numberOfTries;
    }
    
    private void setNumberOfTries(int numberOfTries){
        this.numberOfTries = numberOfTries;
    }
    
    private String showGuessedWord(){
        return guessedWord;
    }
    
    
    public void play(){
        
    }
    
    private String showWelcome(){
        String str = "Bem vindo :)" ;
        return str;
    }
    
    public char[] guess(String letter){
        this.letter = letter;
        char[] hiddenChars = hiddenWord.toCharArray();
        char[] guessedChars = guessedWord.toCharArray();
        int num = 0;
        int a = 0;
        for (String x: hiddenChars.toString()){
            if (x.equals(letter)){
                guessedChars[num] = hiddenChars[i];
            }
            System.out.println("ui");
        }
        num++;
        return guessedChars; 
      
    }
}
