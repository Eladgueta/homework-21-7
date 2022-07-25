import org.junit.Assert;
import org.junit.Test;

public class ClacTest {
    Clac c = new Clac();

    @Test
    public void test_div() {
        int inputA = 4;
        int inputB = 2;
        int expected = 4;
        int actul = c.div(inputA, inputB);
        Assert.assertEquals(expected, actul);
    }

    @Test
    public void test_div_N() {
        int inputA = 8;
        int inputB = 0;
        int expected = -1;
        int actul = c.div(inputA, inputB);
        Assert.assertEquals(expected, actul);
    }

    @Test
    public void test_mult() {
        int inputA = 15;
        int inputB = 30;
        int exp = 450;
        int act = c.multi(inputA, inputB);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_mult_n() {
        int inputA = 15;
        int inputB = 0;
        int exp = -1;
        int act = c.multi(inputA, inputB);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_subt() {
        int inputA = 75;
        int inputB = 25;
        int exp = 50;
        int act = c.subt(inputA, inputB);
        Assert.assertEquals(exp, act);
    }


    @Test
    public void test_sum() {
        int inputA = 1500;
        int inputB = 2000;
        int exp = 3500;
        int act = c.sum(inputA, inputB);
        Assert.assertEquals(exp, act);
    }

    }
