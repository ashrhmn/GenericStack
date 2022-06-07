import java.lang.reflect.Array;

public class StackBackdated<T> {
    int size;
    int index = 0;
    T[] list;

    public StackBackdated(int size){
        this.size=size;
        list = (T[]) new Object[size];
    }

    public boolean isEmpty(){
        return index==0;
    }

    public boolean isFull(){
        return index==size;
    }

    boolean push(T data){
        if(isFull()) return false;
        list[index++] = data;
        return true;
    }

    T top(){
        if(isEmpty()) return null;
        return list[index-1];
    }

    T pop(){
        if(isEmpty()) return null;
        T last = list[index-1];
        list[index---1] = null;
        return last;
    }

    public void print(){
        System.out.print("Stack : [");
        for (int i = 0; i < list.length; i++) {
            if(list[i]!=null) System.out.print(list[i]);
            if(i+1!=list.length && list[i+1]!=null) System.out.print(", ");
        }
        System.out.print("]\n");
    }
}
