
package pa6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxHeapTest {

    @Test
    void testInsert() {
        MaxHeap heap = new MaxHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(8, heap.peek());
        assertEquals(5, heap.size());
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testInsert_full() {
        MaxHeap heap = new MaxHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        heap.insert(4);
        assertEquals(8, heap.peek());
        assertEquals(5, heap.size());
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testisEmpty() {
        MaxHeap heap = new MaxHeap(5);
        assertEquals(true, heap.isEmpty());
    }
    @Test
    void testisEmpty_not() {
        MaxHeap heap = new MaxHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testDelete() {
        MaxHeap heap = new MaxHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(8, heap.peek());
        assertEquals(5, heap.size());
        assertEquals(false, heap.isEmpty());
        assertEquals(8, heap.delete());
        heap.print();
        assertEquals(7, heap.peek());
        assertEquals(4, heap.size());
    }

    @Test
    void testDelete_empty() {
        MaxHeap heap = new MaxHeap(5);
        assertEquals(0, heap.delete());
    }

        
    @Test
    void testSize() {
        MaxHeap heap = new MaxHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(8, heap.peek());
        assertEquals(5, heap.size());
    }

    @Test
    void sortedArray() {
        int[] unsortedArray = {5, 3, 8, 1, 2};
        int[] sortedArray = MaxHeap.heapSort(unsortedArray);
        int[] expectedArray = {8, 5, 3, 2, 1};
        assertArrayEquals(expectedArray,sortedArray);

    }

    


}
