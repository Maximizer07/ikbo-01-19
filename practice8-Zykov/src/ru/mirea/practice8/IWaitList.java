package ru.mirea.practice8;
import java.util.Collection;

/**
 * @param <E>
 */
public interface IWaitList<E>{
    /**
     * @param element
     */
    public void add(E element);

    /**
     * @return
     */
    E remove();

    /**
     * @param element
     * @return
     */
    public boolean contains(E element);

    /**
     * @param contentCheck
     * @return
     */
    public boolean containsAll(Collection<E> contentCheck);

    /**
     * @return
     */
    public boolean isEmpty();
}
