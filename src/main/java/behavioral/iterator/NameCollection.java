package behavioral.iterator;

public class NameCollection implements Collection {
    public static final int MAX_ITEMS = 10;
    int numberOfItems = 0;
    Name[] nameList;

    public NameCollection() {
        nameList = new Name[MAX_ITEMS];
    }

    public void addName(Name name) {
        if(numberOfItems >= MAX_ITEMS) {
            throw new IndexOutOfBoundsException("Collection is full!");
        } else {
            nameList[numberOfItems] = name;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NameIterator(nameList);
    }
}
