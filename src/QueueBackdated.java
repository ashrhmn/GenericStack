public class QueueBackdated<T> {
    int size;
    int index = 0;
    T[] list;

    public QueueBackdated(int size){
        list = (T[]) new Object[size];
        this.size = size;
    }

    public boolean isEmpty(){
        return index==0;
    }

    public boolean isFull(){
        return index==size;
    }

    public boolean push(T data){
        if(isFull()) return false;
        for (int i = size-2; i > 0; i--) {
            list[i] = list[i-1];
        }
        list[0] = data;
        index++;
        return true;
    }

    public T head(){
        if(isEmpty()) return null;
        return list[index-1];
    }

    public T pop(){
        if(isEmpty()) return null;
        T head = head();
        list[--index] = null;
        return head;
    }

    public void print(){
        System.out.print("Queue : [");
        for (int i = 0; i < list.length; i++) {
            if(list[i]!=null) System.out.print(list[i]);
            if(i+1!=list.length && list[i+1]!=null) System.out.print(", ");
        }
        System.out.print("]\n");
    }
}
