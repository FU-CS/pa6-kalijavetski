package pa6;

// Uncomment the following class to get started

public class MinHeap implements Heap {
    private int[] data;
    private int size=0;
    private int maxcap;

    public MinHeap(int maxcap){
        this.maxcap = maxcap;
        this.data = new int[this.maxcap];
    }

    public void insert(int value){
        if (this.size >= this.maxcap){
            return;
        }
        this.data[this.size] = value;
        this.size = this.size + 1;
    //compare element with its parent and swap if parent is < element
    //repeat until we reach root (this.data[0])
        int i = this.size - 1;
        while (data[i] < data[(i)/2]){
            int parent_idx = (i)/2;
            this.swap(i, parent_idx);
            i = parent_idx;
        }
    }

    private void swap(int i, int j){
        int tmp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = tmp;
    }

    public int delete(){
        if (this.size==0){
            return 0;
        }
        int root = this.data[0];
        this.data[0] = this.data[this.size-1];
        this.size = this.size - 1;
        deleteHelper(0);
        return root;
    }
    public void deleteHelper(int node){
        int smallest = node;
        int left = (2*node)+1;
        int right = (2*node)+2;
        if (left<this.size && data[left]<data[right]){
            if (data[left] < data[smallest]){
                smallest = left;
            }
        }
        else if (right<this.size && data[right]<data[left]){
            if (data[right] < data[smallest]){      
                smallest=right;
            }
        }  
        if (smallest!= node){
            swap(smallest,node);
            deleteHelper(smallest);
        }   
    }

    public int peek(){
        if (isEmpty())
            return 0;
        return this.data[0];
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if (this.size == 0)
            return true;
        else
            return false;
    }

    public void print(){
        String result = "";
        System.out.println(printHelper(0, result));
    }

    private String printHelper(int i, String result){
        if (i > this.size-1){
            return result;
        }
        result = result + this.data[i] + " ";
        return printHelper(i+1, result);
    }
    
    static int[] heapSort(int[] array){
        MinHeap heap = new MinHeap(array.length);
        
        for (int i=0;i<array.length;i++) {
            heap.insert(array[i]);
        }

        int[] sortedArray = new int[array.length];

        for (int j = 0; j < sortedArray.length; j++) {
            sortedArray[j] = heap.delete();
        }
        
        return sortedArray;
    }
}


