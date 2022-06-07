import java.util.ArrayList;

public class Stack<T> {
    int size;
    private ArrayList<T> list = new ArrayList<T>();

    public Stack(int size){
        this.size = size;
    }

    public boolean isFull(){
        return list.size()==size;
    }

    public boolean isEmpty(){
        return list.size()==0;
    }

    public boolean push(T data){
        if(isFull()) return false;
        list.add(data);
        return true;
    }

    public T top(){
        return isEmpty()?null:list.get(list.size()-1);
    }

    public T pop(){
        if(isEmpty()) return null;
        T last = list.get(list.size()-1);
        list.remove(last);
        return last;
    }

    public void print(){
        System.out.print("Stack : [");
        list.forEach((n)-> System.out.print(n+","));
        System.out.print("]\n\n");
    }

}
