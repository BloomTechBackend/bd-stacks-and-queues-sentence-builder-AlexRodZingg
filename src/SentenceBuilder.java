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
        if (stack.isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (String s : stack) {
            sb.append(s + ", ");
        }
        // Remove the last ", "
        String ans = sb.toString().substring(0, sb.length() - 2);
        ans += "]";
        return ans;
    }
}
