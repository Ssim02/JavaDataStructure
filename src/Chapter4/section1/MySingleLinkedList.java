package Chapter4.section1;

public class MySingleLinkedList<T> {

    public Node<T> head;
    public int size;

    public MySingleLinkedList() {
        head = null;
        size = 0; // node number
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<T>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAfter(Node<T> before, T item) {
        Node<T> temp = new Node<T>(item);
        temp.next = before.next;
        before.next = temp;
        size++;
    }

    public T removeFirst() { // 연결리스트의 첫번째 노드를 삭제하는 메서드
        // 단, head가 null이 아니어야함.
        if(head == null) {
            return null;
        }
        else {
            T temp = head.data; // 원래 head의 다음 노드의 데이터를 잃어버리게 되므로 미리 저장
            head = head.next; // 첫번째 노드에 연결되어있던 노드에 head를 연결
            size--;
            return temp; // 삭제한 노드의 data를 리턴
        }

    }

    public T removeAfter(Node<T> before) {
        if(before.next == null) {
            return null;
        }
        else {
            T temp = before.next.data;
            before.next = before.next.next;
            size--;
            return temp;
        }
    }

    public int indexOf(T item) { // search 메서드
        Node<T> p = head;
        int index = 0;
        while(p != null) {
            if(p.data.equals(item)) {
                return index;
            }
            p = p.next; // 그 다음 노드를 가리키도록(한 칸 전진)
            index++;
        }
        return -1; // 모든 노드를 순회했으므로
    }
    
    // 42번강의 - 5:19부터
}














