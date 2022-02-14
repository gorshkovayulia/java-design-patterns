package behavioral.iterator;

import java.util.Spliterator;

public interface Iterator {
    // Indicates whether there are more elements to iterate over
    boolean hasNext();
    // Returns the next element
    Object next();
}
