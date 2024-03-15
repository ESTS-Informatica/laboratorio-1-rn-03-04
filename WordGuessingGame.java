
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    
    
    public WordGuessingGame (){
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public void setHiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    }
    
    public void setGuessedWord(String guessedWord){
        this.guessedWord = guessedWord;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    public void setNumberOfTries(int numberOfTries){
        this.numberOfTries = numberOfTries;
    }
    
    public String showGuessedWord(){
        return guessedWord;
    }
    
    
}
