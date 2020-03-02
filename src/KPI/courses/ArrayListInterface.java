package KPI.courses;

public interface ArrayListInterface<E> {
    boolean add(E e);
    E get(int index);
    int size();
    void update(int index, E e);
}
