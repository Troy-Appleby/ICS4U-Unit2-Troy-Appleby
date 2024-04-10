/*
 * This program uses a basic class to make an array of intergers
 *
 * @author  Troy Appleby
 * @version 1.0
 * @since   2024-04-07
 */

/**
 * This is the program.
 */
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called.
     *
     * @throws IllegalStateException if this is ever called
     * 
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Add fruit stack
        final MrCoxallStack fruitsStack = new MrCoxallStack();
        fruitsStack.push("apple");
        fruitsStack.push("banana");
        fruitsStack.push("cherry");
        System.out.println("fruits: " + fruitsStack.showStack());

        // Add color stack
        final MrCoxallStack colorsStack = new MrCoxallStack();
        colorsStack.push("red");
        colorsStack.push("green");
        colorsStack.push("blue");
        System.out.println("colors: " + colorsStack.showStack());

        // Add dog stack
        final MrCoxallStack dogsStack = new MrCoxallStack();
        dogsStack.push("poodle");
        dogsStack.push("retriever");
        dogsStack.push("beagle");
        System.out.println("dogs: " + dogsStack.showStack());

        System.out.println("\nDone.");
    }
}
