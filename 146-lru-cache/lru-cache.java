class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key_,int value){
            key=key_;
            val=value;
        }
    }
    Node head= new Node(-1,-1);
    Node tail= new Node(-1,-1);

    HashMap<Integer,Node> h= new HashMap<>();
    int cap;

    void delete(Node t){
        Node t1=t.prev;
        Node t2= t.next;
        t1.next=t2;
        t2.prev=t1;

    }

     void add(Node t){
        Node t1=head.next;
        head.next=t;
        t.prev=head;
        t.next=t1;
        t1.prev=t;
    }

    public LRUCache(int capacity) {
        cap=capacity;
        head.next= tail;
        tail.prev= head;
    }
    
    public int get(int key) {
        if(!h.containsKey(key)) return -1;
        Node t= h.get(key);
        h.remove(key);
        delete(t);
        add(t);
        h.put(key,head.next);

        return t.val;
    }
    
    public void put(int key, int value) {
        if(h.containsKey(key)){
            Node t= h.get(key);
            h.remove(key);
            delete(t);
            add( new Node(key,value));
            h.put(key,head.next);
        }
        else{
            if(h.size()==cap){
                h.remove(tail.prev.key);
                delete(tail.prev);
            }
         Node t= new Node(key,value);
         add(t);
         h.put(key,t);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */