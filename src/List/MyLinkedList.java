package List;

public class MyLinkedList implements SeqList {
    private int size;
    private Node head;
    @Override
    public void add(int val) {
        add(size,val);
    }
    public void addFirst(int val) {
        // 1.产生新节点
        Node node = new Node(val);
        // 2.将新节点挂载在原先的火车头之前
        node.next = head;
        // 3.将head指向当前的新的头节点node
        head = node;
        size ++;
    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add index illegal!");
        }
        if (index == 0) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        Node pre = head;
        for (int i = 0; i < index-1; i++) {
            pre = pre.next;
        }
        node.next = pre.next;
        pre.next = node;
        size++;
    }

    @Override
    public boolean contains(int val) {
        for (Node x = head; x != null ; x = x.next) {
            if(x.val == val)
                return true;
        }
        return false;
    }

    private boolean rangCheck(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        return true;
    }

    @Override
    public int get(int index) {
        int count = 0;
        for (Node x = head; x != null ; x = x.next) {
            if(index == count){
                return x.val;
            }
            count++;
        }
        throw new IllegalArgumentException("get index illegal!");
    }

    @Override
    public int set(int index, int newVal) {
        int count = 0;
        for (Node x = head; x != null ; x = x.next) {
            if(index == count){
                int a = x.val;
                x.val = newVal;
                return a;
            }
            count++;
        }
        throw new IllegalArgumentException("set index illegal!");
    }

    @Override
    public int removeByIndex(int index) {
        if(index== 0){
            Node node = head;
            head = head.next;
            node.next = null;
            size--;
            return node.val;
        }
        Node cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        int a = cur.next.val;
        cur.next = cur.next.next;
        size--;
        return a;
    }

    @Override
    public void removeByValueOnce(int val) {
        if (head == null) {
            return;
        }
        if(head.val == val){
            head = head.next;
            size--;
            return;
        }
        Node pre = head;
        while (pre.next != null){
            if (pre.next.val == val) {
                Node cur = pre.next;//这个位置避免空指针异常
                pre.next = cur.next; //cur为局部变量
                size--;
                return;
            }
            pre = pre.next;
        }
    }

    @Override
    public void removeAllValue(int val) {
        if (head == null) {
            return;
        }
        while (head != null && head.val == val){
            head = head.next;
            size--;
        }
        if (head == null) {
            return;
        }
        Node pre = head;
        while (pre.next != null){
            while (pre.next != null && pre.next.val == val) {
                Node cur = pre.next;
                pre.next = cur.next;
                size--;
            }
            if(pre.next != null)
                pre = pre.next;
        }
        if (pre.val == val)
            pre = null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // 链表的遍历只能从头结点开始依次向后移动直到尾结点
        // 此处能否直接使用head进行遍历？不能，若直接用head进行遍历，遍历一次之后，头结点的地址就没了~(我三级头呢？)
        for (Node x = head;x != null;x = x.next) {
            sb.append(x.val);
            sb.append("->");
            // 若此时x走到尾结点，拼接NULL
            if (x.next == null) {
                sb.append("NULL");
            }
        }
        return sb.toString();
    }
    private static class Node {
        private int val;
        // 钩子 ~~
        private Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    public void printReverse() {
        printReverse(head);
    }
    private void printReverse(Node head){
        if(head == null)
            return;
        printReverse(head.next);
        System.out.print(head.val+" ");
    }

}
