public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 40);

        System.out.print("Before: ");
        list.display();

        list.add(2, 30);

        System.out.print("After: ");
        list.display();
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class MyList<T> {
    Node<T> head;
    int size = 0;

    void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                // Type the print statement here while recording.
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    void display() {
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
