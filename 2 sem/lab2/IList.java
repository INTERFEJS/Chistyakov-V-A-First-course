package lab2;

import java.util.function.Predicate;

public interface IList {

    /**
     * adds element into list tail
     * @param value - specified
     */
    void add(int value);

    /**
     * adds element into list by index
     * @param idx - index
     * @param value - specified
     */
    void add(int idx, int value);

    /**
     * removes element by its index
     * @param idx - element index
     */
    void remove(int idx);

    /**
     * removes element by condition
     * @param condition - specified, example: if element == 5
     */
    void remove(Predicate<Integer> condition);

    /**
     * returns element by its index
     * @param idx - element index
     * @return value
     */
    int get(int idx);
}
