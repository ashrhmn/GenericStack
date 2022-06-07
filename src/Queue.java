import java.util.ArrayList;

public class Queue<T> {
    int size;
    private ArrayList<T> list = new ArrayList<T>();

    public Queue(int size){
        this.size=size;
    }

    public boolean isEmpty(){
        return list.size()==0;
    }

    public boolean isFull(){
        return list.size()==size;
    }

    public boolean add(T data){
        if(isFull()) return false;
        list.add(0,data);
        return true;
    }

    public T peek(){
        if(isEmpty()) return null;
        return list.get(0);
    }

    public T pop(){
        if(isEmpty()) return null;
        T last = peek();
        list.remove(last);
        return last;
    }

    public void print(){
        System.out.print("Queue : [");
        list.forEach((n)-> System.out.print(n+","));
        System.out.print("]\n\n");
    }
}
