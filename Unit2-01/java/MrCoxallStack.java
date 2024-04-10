/*
 * This class defines a string stack
 *
 * @author  Troy Appleby
 * @version 1.0
 * @since   2024-04-07
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class.
*/
public class MrCoxallStack {
    /**
     * Adds strings to an array.
     *
     * @param array contains the array of strings
     */
    private List<String> stackAsList;

    /**
    * Constructs a new instance of MrCoxallStack.
    * Initializes the stack with an empty ArrayList.
    *
    */
    public MrCoxallStack() {
        stackAsList = new ArrayList<>();
    }

    /**
     * The push method.
     *
     * @param input from Main.java
    */
    public void push(String input) {
        stackAsList.add(input);
    }

    /**
     * The showStack method.
     *
     * @return the values as a string
     */
    public String showStack() {
        String values = "";
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values += stackAsList.get(counter);
            if (counter < stackAsList.size() - 1) {
                values += ", ";
            }

        return values;
    }
}
