package ru.itsjava.collections.lists.arrayList;

public class MyArrayList {
    private int realSize;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == o) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        for (int i = delIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        array[index] = element;
        return element;
    }

//    public void add(int index, Object element) {
//        checkIndex(index);
//        Object[] resArray = new Object[array.length + 1];
//        for (int i = 0; i < index; i++) {
//            resArray[i] = array[i];
//        }
//        resArray[index] = element;
//        for (int j = index + 1; j < resArray.length; j++) {
//            resArray[j] = array[j - 1];
//        }
//        array = resArray;
//        realSize++;
//    }

    public void add(int index, Object element) {
        checkIndex(index);
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, index);
            resArray[index] = element;
            if (array.length + 1 - (index + 1) >= 0)
                System.arraycopy(array, index + 1 - 1, resArray, index + 1, array.length + 1 - (index + 1));
            array = resArray;
        } else {
            for (int i = realSize; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
        }
        realSize++;
    }

    public Object remove(int index) {
        checkIndex(index);
        Object resElement = array[index];
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }

    public void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Incorrect index");
        }
    }

    public boolean isCorrectIndex(int index) { // было private
        if (index > -1 && index < realSize) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int lastIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{ ");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
