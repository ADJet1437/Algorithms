public class MyHashMap {

    private Node[] buckets;
    private int size;
    private static final double LOAD_FACTOR = 0.75;

    class Node {
        private int key, value;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public MyHashMap() {
        size = 0;
        buckets = new Node[16];
    }

    public int size() {
        return size;
    }

    public void put(int key, int value) {
        // Get the hash (index)
        // Get the head
        // check key if exists: 1) existed: update value, 2) not existed: add node to
        // head
        int index = key % buckets.length;
        Node head = buckets[index];

        while (head != null && head.key != key) {
            head = head.next;
        }
        if (head != null) {
            head.value = value;
        } else {
            // Add to head
            Node newNode = new Node(key, value);
            newNode.next = head;
            buckets[index] = newNode;
            size++;
        }
        // expand
        if (size >= buckets.length * LOAD_FACTOR) {
            expand();
        }
    }

    private void expand() {
        Node[] oldBuckets = buckets;
        Node[] newBuckets = new Node[buckets.length * 2];

        buckets = newBuckets;

        for (Node node : oldBuckets) {
            put(node.key, node.value);
        }
    }

    public int get(int key) {
        // Get the hash (index)
        // Get the head
        // Check in the chain starts with the head, if key exists, return the value
        int index = key % buckets.length;
        Node head = buckets[index];

        while (head != null && head.key != key) {
            head = head.next;
        }

        return head == null ? -1 : head.value;
    }

    public void remove(int key) {
        // Get the hash (index)
        // Get the head
        // Check in the chain starts with the head, if key exists, remove node
        int index = key % buckets.length;
        Node head = buckets[index];

        Node dummy = new Node(0, 0), cur = dummy;
        dummy.next = head;

        while (cur.next != null) {
            if (cur.next.key == key) {
                cur.next = cur.next.next;
                break;
            } else {
                cur = cur.next;
            }

        }
        buckets[index] = dummy.next;

    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 4);
        System.out.println(map.get(1));

        map.remove(0);
        System.out.println(map.get(1));

        map.remove(1);
        System.out.println(map.get(1));

        map.put(2, 5);
        map.put(2, 6);
        System.out.println(map.get(2));
    }
}
