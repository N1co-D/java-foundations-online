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
        if (!isEmpty()) {
            head = null;
            System.out.println("Complete!");
        } else {
            System.out.println("Already empty!");
        }
    }

    public Object get(int index) {
        isCorrectIndex(index);
        if (!isEmpty()) {
            Node curNode = head;
            int count = 0;
            while (count != index) {
                curNode = curNode.getNext();
                count++;
            }
            return curNode.getValue();
        }
        return null;
    }

    public Object set(int index, Object element) {
        isCorrectIndex(index);
        if (!isEmpty()) {
            Node curNode = head;
            Object resValue = element;
            int count = 0;
            while (count != index) {
                curNode = curNode.getNext();
                count++;
            }
            curNode.setValue(element);
            return resValue;
        }
        return null;
    }

    public void add(int index, Object element) {

    }

    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    //Node - узел = значение + ссылка на следующий элемент
    //head - первый элемент списка + ссылка на следующий элемент

    public Object remove(int index) {
        checkIndex(index);                               //проверка индекса: если он корректен, в списке есть минимум один элемент
        if (index == 0) {                                //если индекс = 0 (удаление первого элемента)
            Object resValue = head.getValue();           //создается объект со значением первого элемента до дальнейшего возврата
            if (head.getNext() == null) {                //если значение второго (после head) элемента равняется null
                head = null;                             //первому элементу списка также присваивается значение null, потому что он должен быть удален
            } else {                                     //если значение второго (после head) элемента не равняется null
                head = head.getNext();                   //первому элементу списка присваивается значение следующего элемента, потому что первый должен быть удален
            }
            return resValue;                             //возврат удаленного (первого) элемента списка
        }
        //другая ситуация: в списке есть минимум два элемента

        Node curNode = head;                             //создание нового узла для того, чтобы пробегаться по списку с самого начала (head) + это тот элемент, который мы хотим удалить
        Node prevNode = head;                            //создание нового узла для того, чтобы запомнить Node предыдущего элемента списка (Node до curNode)

        if (curNode == null) return null;                //если изначально curNode == null, то null и возвращается

        int count = 0;                                   //создание счетчика
        while ((curNode = curNode.getNext()) != null) {  //пока следующий элемент не будет равняться null мы перемещаем curNode на позицию вперед
            count++;                                     //счетчик увеличивается на 1
            if (count == index) {                        //если счетчик будет равен индексу, производится остановка, так как curNode стал тем элементом, который надо удалить
                break;
            }
            prevNode = prevNode.getNext();               //prevNode будет иметь значение предыдущего элемента до curNode, так как break останавливает цикл раньше, чем prevNode перейдет на следующую позицию
        }

        if (curNode.getNext() == null) {                 //если следующий элемент после curNode = null (дошли до конца списка)
            prevNode.setNext(null);                      //присваиваем последнему элементу в списке значение null
        } else {                                         //если удаляемый элемент стоит в середине списка
            prevNode.setNext(curNode.getNext());         //элементу, стоящему до удаляемого, присваиваем значение элемента, который стоит после удаляемого
            curNode.setNext(null);                       //удаляем сам элемент
        }

        Object resValue = curNode.getValue();            //создается объект со значением удаляемого элемента до дальнейшего возврата
        return resValue;                                 //возврат удаляемого объекта
    }

    public void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Incorrect index");
        }
    }

    public boolean isCorrectIndex(int index) {
        if (index > -1 && index < size()) {
            return true;
        }
        return false;
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
