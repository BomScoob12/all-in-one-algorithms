import com.bomscoob.algorithms.sort.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

public class SortingArrayTest {

    @Test(timeout = 50)
    public void bubbleSortTest() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] originalArr = new Integer[]{5,6,-7,50,7,0};
        Integer[] expectedOutput = new Integer[]{-7, 0, 5, 6, 7, 50};
        Integer[] sortOutput = bubbleSort.sort(originalArr);

        Assert.assertArrayEquals(expectedOutput, sortOutput);
    }
}
