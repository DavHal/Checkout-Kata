import com.main.workerclasses.Basket;
import com.main.shoppingcartobjects.Item;
import com.main.Order;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

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
        BigDecimal totalPlaceholder;

        try {
            Basket testBasketObject = new Basket();

            testBasketObject.itemList.add(new Item("itemTest", totalTestValue, 'A'));
            testBasketObject.itemList.add(new Item("itemTest", totalTestValue, 'A'));

            totalPlaceholder = BigDecimal.valueOf(totalTestValue*2);

            assertEquals(totalPlaceholder, testBasketObject.totalCost());

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

    @Test
    public void skuFrequencyCountTest() {
        try {
            Basket testBasketObject = new Basket();
            int skuFrequency = 4;

            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));
            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));
            testBasketObject.itemList.add(new Item("Kiwi", .15D, 'D' ));
            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));
            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));

            int returnedSkuFrequency = testBasketObject.skuFrequencyCount('B');

            assertEquals(skuFrequency, returnedSkuFrequency);

        } catch (Exception e) {
            fail("skuFrequencyCountTest Failed!" + e.getMessage());
        }
    }

    @Test
    public void skuFrequencyCountArrayTest(){
        try {
            Basket testBasketObject = new Basket();

            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));
            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));
            testBasketObject.itemList.add(new Item("Kiwi", .15D, 'D' ));
            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));
            testBasketObject.itemList.add(new Item("Banana", .30D, 'B' ));
            testBasketObject.itemList.add(new Item("Apple", .50D, 'A' ));

            int[] returnedArray = testBasketObject.skuFrequencyCount();

            assertEquals(26, returnedArray.length);
            assertEquals(1, returnedArray[0]);
            assertEquals(4, returnedArray[1]);
            assertEquals(1, returnedArray[3]);

        } catch (Exception e) {
            fail("skuFrequencyCountArrayTest Failed" + e.getMessage());
        }
    }
}
