
import com.main.workerclasses.DiscountBuilder;


import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DiscountBuilderTest {

    @Before
    public void setUp(){

        DiscountBuilder currentDiscountsTest = null;

    }

    @Test
    public void buildDiscountObjectsTest() {

        DiscountBuilder currentDiscountsTest = new DiscountBuilder();

        try {

            int countOfRawObjects = currentDiscountsTest.getRawDiscountInfo().size();
            int countOfDiscountObjectsCreated = currentDiscountsTest.getDiscountsList().size();

            assertEquals(countOfRawObjects,countOfDiscountObjectsCreated);

        } catch (Exception e) {
            fail("buildDiscountObjectsTest Failed!" + e.getMessage());
        }



    }



}
