package ru.itsjava.collections.lists.linkedList;

public class MyLinkedList {
    private Node head;

    public int size() {
        if (head != null) {
            Node curNode = head;
            int size = 0;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                size++;
            }
            return size + 1;
        }
        return 0;
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }

    public boolean contains(Object o) {
        if (head != null) {
            Node curNode = head;
            while (curNode.getNext() != null) {
                if (curNode.getValue() == o) {
                    return true;
                }
                curNode = curNode.getNext();
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
