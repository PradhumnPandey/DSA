public class Maxheap {
    int root;
    int size;
    int maxSize;
    int heap[];
    Maxheap(int size)
    {
        this.maxSize=size;
        this.size=0;
        this.heap=new int[this.maxSize];
    }
    void swapDown(int i)
    {
        int left=2*i + 1;
        int right=left+1;
        int temp;
        if(this.heap[left]>this.heap[right])
        {
            if(this.heap[i]>this.heap[left])
            {
                temp=this.heap[i];
                this.heap[i]=this.heap[left];
                this.heap[left]=temp;
                i=left;
            }
        }
        else if(this.heap[left]<this.heap[right])
        {
            if(this.heap[i]>this.heap[right])
            {
                temp=this.heap[i];
                this.heap[i]=this.heap[right];
                this.heap[right]=temp;
                i=right;
            }
        }
        swapDown(i);
    }
    void swapUp(int i)
    {
        if(i==0) return;
        int parent=(i-1)/2;
        if(this.heap[parent]>this.heap[i]) return;
        int temp=this.heap[i];
        this.heap[i]=this.heap[parent];
        this.heap[parent]=temp;
        i=parent;
        swapUp(i);
    }
    void insert(int n)
    {
        if(this.size==this.maxSize)
        {
            return;
        }
        else
        {
            heap[size]=n;
            swapUp(size);
            size++;
        }
    }
    int delete()
    {
        int out=this.heap[0];
        int temp=this.heap[0];
        this.heap[0]=this.heap[size];
        this.heap[size]=temp;
        size--;
        swapDown(0);
        return out;
    }
    public static void main(String[] args) {
        Maxheap heap=new Maxheap(5);
        heap.insert(1);
        heap.insert(2);
        heap.insert(-10);
        heap.insert(8);
        heap.insert(0);
        heap.insert(21);
        while(heap.size>0)
        {
            System.out.print(heap.delete());
        }
    }
}
