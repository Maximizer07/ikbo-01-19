package ru.mirea.practice11;
public class Test {
    public static void main(String[] args) {
        System.out.println("Тестируем LinkedQueue:");
        LinkedQueue linkedqueue = new LinkedQueue();
        System.out.println("Очередь пуста? - " + linkedqueue.isEmpty());
        System.out.println("Добавляем элементы..");
        linkedqueue.enqueue(46);
        linkedqueue.enqueue("lol");
        linkedqueue.enqueue(0.55);
        linkedqueue.enqueue("-123");
        linkedqueue.enqueue(-234);
        System.out.println("А теперь? - "+linkedqueue.isEmpty());
        System.out.println("Первый элемент в очереди: "+linkedqueue.element());
        System.out.println("Размер очереди: "+linkedqueue.size());
        System.out.println("Удаляем и возвращаем первый элемент в очереди: "+linkedqueue.dequeue());
        System.out.println("Удаляем очередь.. ");
        linkedqueue.clear();
        System.out.println("Размер очереди - "+linkedqueue.size()+"\n");

        System.out.println("Тестируем ArrayQueue:");
        ArrayQueue arrayqueue = new ArrayQueue();
        System.out.println("Очередь пуста? - " + arrayqueue.isEmpty());
        System.out.println("Добавляем элементы..");
        arrayqueue.enqueue(46);
        arrayqueue.enqueue("lol");
        arrayqueue.enqueue(0.55);
        arrayqueue.enqueue("-123");
        arrayqueue.enqueue(-234);
        System.out.println("А теперь? - "+arrayqueue.isEmpty());
        System.out.println("Первый элемент в очереди: "+arrayqueue.element());
        System.out.println("Размер очереди: "+arrayqueue.size());
        System.out.println("Удаляем и возвращаем первый элемент в очереди: "+arrayqueue.dequeue());
        System.out.println("Удаляем очередь.. ");
        arrayqueue.clear();
        System.out.println("Размер очереди - "+arrayqueue.size());
        System.out.println("Удаление завершено");

    }
}
