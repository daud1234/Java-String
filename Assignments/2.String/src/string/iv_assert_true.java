package string;


import static org.junit.Assert.assertTrue;
 
import org.junit.Before;
import org.junit.Test;
 
public class iv_assert_true {
     
    int f1 = 0;
    int f2 = 10;
     
    @Before
    public void setData(){
        f1 = 9;
    }
     
    @Test
    public void testAssertions() {
        assertTrue((f1 != f2));
    }
     
    @Test
    public void testAssertFalse() {
        assertTrue((f1 == f2));
    }
     
    @Test
    public void testAssertTrueWithMessage(){
        assertTrue("Is totl num appl acpl?",(f1 != f2));
    }
}