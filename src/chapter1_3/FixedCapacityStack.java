package chapter1_3;

/** 泛型定容栈 */
public class FixedCapacityStack<Item> {

    private Item[] a;
    private int N; // 栈顶元素+1的索引(考虑N为栈的大小，栈的元素【0-N-1】,显然N为栈顶元素索引+1)
    public FixedCapacityStack(int cap){
        a = (Item[])new Object[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(Item item){

        // 栈满了，扩容
        if(N == a.length){
            reSize(2 * a.length);
        }
        a[N++] = item;
    }

    public Item pop(){
        Item item = a[--N];
        a[N] = null;  // 避免对象游离，这样置为Null，方便垃圾回收

        // 当前栈顶元素小于栈大小的4分之一, 重新分配栈的大小
        if(N>0 && N < a.length / 4){
            reSize(a.length / 2);
        }
        return item;
    }

    private void reSize(int max){
        Item[] temp = (Item[])new Object[max];
        for(int i=0; i<N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }
}
