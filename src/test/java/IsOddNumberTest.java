import org.junit.Assert;
import org.junit.Test;

/**
 * @author cuiyunhong.
 * Created by cuiyunhong on 2019/3/6.
 */
public class IsOddNumberTest {

    @Test
    public void test() {
        IsOddNumber isOddNumber = new IsOddNumber();
        boolean odd = isOddNumber.isOdd(3);
        Assert.assertTrue(odd);
    }

}
