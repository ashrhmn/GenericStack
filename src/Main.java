import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        StackBackdated<Integer> stack;
        QueueBackdated<Integer> queue;

        System.out.println("Stack Size : ");
        int stackSize = s.nextInt();
        System.out.println("Queue Size : ");
        int queueSize = s.nextInt();

        stack = new StackBackdated<>(stackSize);
        queue = new QueueBackdated<>(queueSize);

        while (true){
            System.out.print("1. Push to Queue\n2. Queue Pop\n3. Push to Stack\n4. Stack Pop\n0. Exit\n\nEnter a option: ");
            int option = s.nextInt();
            if(option==0) break;
            switch (option){
                case 1:
                    System.out.print("Enter a value : ");
                    int queuePushInput = s.nextInt();
                    queue.push(queuePushInput);
                    queue.print();
                    break;
                case 2:
                    int queuePop = queue.pop();
                    System.out.println(queuePop+" popped");
                    queue.print();
                    break;
                case 3:
                    System.out.print("Enter a value : ");
                    int stackPushInput = s.nextInt();
                    stack.push(stackPushInput);
                    stack.print();
                    break;
                case 4:
                    int stackPop = stack.pop();
                    System.out.println(stackPop+" popped");
                    stack.print();
                    break;
            }
        }

//        StackBackdated<Integer> sb = new StackBackdated<>(10);
//        sb.print();
//        sb.push(10);
//        sb.push(30);
//        sb.push(20);
//        sb.print();
//        sb.pop();
//        sb.print();
//        System.out.println(sb.top());

//        QueueBackdated<Integer> qb = new QueueBackdated<>(10);
//        qb.push(10);
//        qb.push(20);
//        qb.push(30);
//        qb.print();
//        System.out.println(qb.head());
//        qb.pop();
//        qb.print();




//        System.out.println("Hello World");
//        Queue<Integer> q = new Queue<Integer>(10);
//        Stack<Integer> s = new Stack<Integer>(20);
//
//        q.print();
//        s.print();
//
//        q.add(2);
//        s.push(2);
//
//        q.print();
//        s.print();
//
//        q.add(3);
//        s.push(3);
//
//        q.print();
//        s.print();
//
//        q.add(4);
//        s.push(4);
//
//        q.print();
//        s.print();
//
//        System.out.println(q.peek());
//        System.out.println(s.top());
//
//        System.out.println(q.pop());
//        System.out.println(s.pop());
//
//        q.print();
//        s.print();
    }
}
