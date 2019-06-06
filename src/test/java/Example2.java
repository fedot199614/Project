import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners({CustomTestNGListener.class})
public class Example2 {
    public void test1(){

    }
    public void test2(){

    }
    public void test3(){

    }
    public void test4(){

    }
    public void test5(){

    }
    public void test6(){

    }

    public void test7(){

    }

    public void test8(){
        Assert.assertEquals("s","r");
    }
    public void test9(){
        Assert.assertEquals("s","r");
    }
    public void test10(){
        Assert.assertEquals("s","r");
    }

    public void test11(){
        Assert.assertEquals("s","r");
    }


}
