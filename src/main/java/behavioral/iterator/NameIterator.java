package behavioral.iterator;

public class NameIterator implements Iterator {
    Name[] nameList;

    int position; // current position of iterator over the array

    public NameIterator(Name[] nameList) {
        this.nameList = nameList;
    }

    @Override
    public boolean hasNext() {
        return position < nameList.length && nameList[position] != null;
    }

    // Returns next element in the array and increments position
    @Override
    public Object next() {
        Name name = nameList[position];
        position += 1;
        return name;
    }
}
