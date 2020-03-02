package KPI.courses;

public class SimpleArrayList<E> implements ArrayListInterface<E> {
    private E[] values;
    private int size;


    public SimpleArrayList() {
        values = (E[]) new Object[4];
        size = 0;
    }


    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            if (size == values.length - 1){
                values = (E[]) new Object[(int) (temp.length*1.5)];
                System.arraycopy(temp, 0, values, 0, temp.length);
            }
            values[size] = e;
            size++;

            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

}
