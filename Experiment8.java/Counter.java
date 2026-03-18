class Counter {

    static int count = 0;

    int id;

    Counter() {
        count++;
        id = count;
    }
    void display() {
        System.out.println("Count (static): " + count + " | ID (instance): " + id);
    }
    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.display();
        obj2.display();
        obj3.display();
    }
}

