import com.davhal.Basket;
import com.davhal.Item;
import com.davhal.Order;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class BasketTest {

    @Before
    public void setUp() {
        Basket testBasketObject = null;
    }

    @Test
    public void basketIsInstanceOfTest(){

        Basket testBasketObject = new Basket();

        try {
            assertTrue(testBasketObject instanceof Order);
        }catch (Exception e){
            fail("basketIsInstanceOfTest Failed!" + e.getMessage());
        }
    }

    @Test
    public void totalCostMethodTest(){

        double totalTestValue = 1D;

        try {
            Basket testBasketObject = new Basket();

            testBasketObject.itemList.add(new Item("itemTest", totalTestValue, 'A'));
            testBasketObject.itemList.add(new Item("itemTest", totalTestValue, 'A'));

            assertEquals((totalTestValue*2), testBasketObject.totalCost());

        } catch (Exception e) {
            fail("totalCostMethodTest Failed!" + e.getMessage());
        }
    }

    @Test
    public void skusContainedInBasketTest() {

        try {
            Basket testBasketObject = new Basket();
            char expectAmountOfItems = 'A';

            testBasketObject.itemList.add(new Item("itemTest", 0.50D, 'A'));
            testBasketObject.itemList.add(new Item("itemTest", 0.50D, 'A'));
            testBasketObject.itemList.add(new Item("itemTest", 0.50D, 'A'));

            char returnedArray[] = testBasketObject.skusContainedInBasket();

            assertEquals(expectAmountOfItems, returnedArray[0]);
            assertEquals(expectAmountOfItems, returnedArray[1]);
            assertEquals(expectAmountOfItems, returnedArray[2]);

        } catch (Exception e) {
            fail("skusContainedInBasketTest Failed!" + e.getMessage());
        }
    }

    @Test
    public void getItemPriceTest(){
        try {
            Basket testBasketObject = new Basket();
            double itemPrice = 0.30D;
            testBasketObject.itemList.add(new Item("itemTest", itemPrice, 'A'));
            double returnedItemPrice = testBasketObject.getItemPrice('A');

            assertEquals(itemPrice, returnedItemPrice);

        } catch (Exception e) {
            fail("getItemPriceTest Failed!" + e.getMessage());
        }
    }


}
