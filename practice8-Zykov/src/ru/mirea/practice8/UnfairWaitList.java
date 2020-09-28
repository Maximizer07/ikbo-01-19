package ru.mirea.practice8;

/**
 * @param <E>
 */
public class UnfairWaitList<E> extends WaitList<E> {
    /**
     *
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * @param element
     */
    public void remove(E element){
        this.remove(element);
    }

    /**
     * @param element
     */
    public void moveToBack(E element){
        super.add(element);
    }
}
