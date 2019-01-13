import com.main.workerclasses.DiscountBuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DiscountBuilderTest {


    @Test
    public void buildDiscountObjectsTest() {

        DiscountBuilder discountComputerTest = new DiscountBuilder();

        try {

            int countOfRawObjects = discountComputerTest.getRawDiscountInfo().size();
            int countOfDiscountObjectsCreated = discountComputerTest.getDiscountsList().size();

            assertEquals(countOfRawObjects,countOfDiscountObjectsCreated);



        } catch (Exception e) {
            fail("buildDiscountObjectsTest Failed!" + e.getMessage());
        }



    }


}
