import java.util.Stack;

public class SentenceBuilder {

    /**
     * Constructor.
     */
    Stack<String> stack;
    public SentenceBuilder() {
        stack = new Stack<>();
    }

    /**
     * Adds a word to the sentence.
     * @param word to be added to the sentence.
     */
    public void addWord(String word) {
        stack.push(word);
    }

    /**
     * Undoes the last word added, and returns it.
     * @return The word most recently added to the sentence, if any; null, otherwise.
     */
    public String undo() {
        if (stack.isEmpty()) return null;
        return stack.pop();
    }

    /**
     * Display all the current words in our sentence.
     * @return string representation of the words currently in the sentence.
     */
    public String getSentenceWords() {
        return stack.toString();
    }
}
