package ru.mirea.practice8;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @param <E>
 */
public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;

    /**
     *
     */
    public WaitList(){
        this.content = new ConcurrentLinkedQueue();
    }

    /**
     * @param content
     */
    public WaitList(Collection<E> content){
        this.content = new ConcurrentLinkedQueue(content);
    }

    /**
     * @param element
     */
    @Override
    public void add(E element) {
        this.content.add(element);
    }

    /**
     * @return
     */
    @Override
    public E remove() {
        return this.content.remove();
    }

    /**
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     * @param contentCheck
     * @return
     */
    @Override
    public boolean containsAll(Collection<E> contentCheck) {
        return content.containsAll(contentCheck);
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /**
     * @return
     */
    @Override
    public String toString(){
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
