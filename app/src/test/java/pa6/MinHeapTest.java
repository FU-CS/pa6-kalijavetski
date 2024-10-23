
package pa6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinHeapTest {

    @Test
    void testInsert() {
        MinHeap heap = new MinHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(1, heap.peek());
        assertEquals(5, heap.size());
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testInsert_full() {
        MinHeap heap = new MinHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        heap.insert(4);
        assertEquals(1, heap.peek());
        assertEquals(5, heap.size());
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testisEmpty() {
        MinHeap heap = new MinHeap(5);
        assertEquals(true, heap.isEmpty());
    }
    @Test
    void testisEmpty_not() {
        MinHeap heap = new MinHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testDelete() {
        MinHeap heap = new MinHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(1, heap.peek());
        assertEquals(5, heap.size());
        assertEquals(false, heap.isEmpty());
        assertEquals(1, heap.delete());
        heap.print();
        assertEquals(2, heap.peek());
        assertEquals(4, heap.size());
    }

    @Test
    void testDelete_empty() {
        MinHeap heap = new MinHeap(5);
        assertEquals(0, heap.delete());
    }

        
    @Test
    void testSize() {
        MinHeap heap = new MinHeap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(1, heap.peek());
        assertEquals(5, heap.size());
    }
    @Test
    void sortedArray() {
        int[] unsortedArray = {5, 3, 8, 1, 2};
        int[] sortedArray = MinHeap.heapSort(unsortedArray);
        int[] expectedArray = {1, 2, 3, 5, 8};
        assertArrayEquals(expectedArray,sortedArray);

    }

    


}
