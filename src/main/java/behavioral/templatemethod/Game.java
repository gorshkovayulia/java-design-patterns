package behavioral.templatemethod;

/**
 * Game abstract class defines operations with a template method set to be final so that it cannot be overridden
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method
    public final void play() {

        // initialize the game
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }
}
