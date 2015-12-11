import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MathTest
{
    @DataPoints
    public static int[][] integers()
    {
        return new int[][]{{1, 1}, {2, 4}, {3, 9}, {4, 16}, {5, 25}};
    }

    @Theory
    public void squeredTest(final int[] inputs)
    {
        Assert.assertEquals(inputs[1], Math.squared(inputs[0]));
    }

}