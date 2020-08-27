import java.util.*;

class FlattenedIterator<T> implements Iterator {
    private Queue<T> flattenedIterator;

    public FlattenedIterator(Iterator<T>[] iterators){
        flattenedIterator = new ArrayDeque<>();

        boolean complete = false;
        while (!complete) {
            complete = true;
            for (int i = 0; i < iterators.length; i++) {
                if (iterators[i].hasNext()) {
                    flattenedIterator.add(iterators[i].next());
                    complete = false;
                }
            }
        }
    }

    public T next() throws NoSuchElementException{
        if (flattenedIterator.size() < 1) {
            throw new NoSuchElementException();
        }
        return flattenedIterator.poll();
    }

    public boolean hasNext() {
        return flattenedIterator.size() > 0;
    }
}