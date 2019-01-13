import com.main.shoppingcartobjects.Item;
import com.main.workerclasses.Basket;
import com.main.workerclasses.DiscountBuilder;
import com.main.workerclasses.DiscountComputer;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DiscountComputerTest {

    @Before
    public void setUp(){
        Basket customerBasketTest = null;
        DiscountBuilder currentDiscountsTest = null;
        DiscountComputer discountComputerTest = null;
    }

    @Test
    public void applyDiscountsWithNoneToApplyTest() {

        Basket customerBasketTest = new Basket();
        DiscountComputer discountComputerTest = new DiscountComputer();

        double testPrice = .51D;
        BigDecimal expectedTestTotal = BigDecimal.valueOf(2.04);

        customerBasketTest.itemList.add(new Item("Apple", testPrice, 'A' ));
        customerBasketTest.itemList.add(new Item("Pear", testPrice, 'C' ));
        customerBasketTest.itemList.add(new Item("Banana", testPrice, 'B' ));
        customerBasketTest.itemList.add(new Item("Kiwi", testPrice, 'D' ));

        try{

            BigDecimal testTotal = discountComputerTest.applyDiscounts(customerBasketTest);

            assertEquals(expectedTestTotal,testTotal);

        }catch (Exception e) {
            fail("applyDiscountsWithNoneToApplyTest Failed!" + e.getMessage());
        }

    }

    @Test
    public void applyDiscountsTest() {
        try {
            Basket customerBasketTest = new Basket();
            DiscountBuilder currentDiscountsTest = new DiscountBuilder();
            DiscountComputer discountComputerTest = new DiscountComputer();

            customerBasketTest.itemList.add(new Item("Apple", .50D, 'A' ));
            customerBasketTest.itemList.add(new Item("Apple", .50D, 'A' ));
            customerBasketTest.itemList.add(new Item("Banana", .30D, 'B' ));
            customerBasketTest.itemList.add(new Item("Apple", .50D, 'A' ));
            customerBasketTest.itemList.add(new Item("Kiwi", .15D, 'D' ));
            customerBasketTest.itemList.add(new Item("Apple", .50D, 'A' ));

            BigDecimal expectedDiscountedPrice = BigDecimal.valueOf(2.25);

            BigDecimal returnedDiscountedPrice = discountComputerTest.applyDiscounts(customerBasketTest);

            assertEquals(expectedDiscountedPrice, returnedDiscountedPrice);

        } catch (Exception e) {
            fail("applyDiscountsTest Failed!" + e.getMessage());
        }
    }

    @Test
    public void totalSavingsTest(){
        try {
            Basket customerBasketTest = new Basket();
            DiscountBuilder currentDiscountsTest = new DiscountBuilder();
            DiscountComputer discountComputerTest = new DiscountComputer();

            BigDecimal expectedTotalSavings = BigDecimal.valueOf(0.15);

            customerBasketTest.itemList.add(new Item("Apple", .50D, 'A' ));
            customerBasketTest.itemList.add(new Item("Banana", .30D, 'B' ));
            customerBasketTest.itemList.add(new Item("Banana", .30D, 'B' ));
            customerBasketTest.itemList.add(new Item("Kiwi", .15D, 'D' ));
            customerBasketTest.itemList.add(new Item("Apple", .50D, 'A' ));

            discountComputerTest.applyDiscounts(customerBasketTest);

            BigDecimal returnedTotalSavings = discountComputerTest.getTotalSavings();

            assertEquals(expectedTotalSavings, returnedTotalSavings);

        } catch (Exception e) {
            fail("totalSavingsTest Failed!" + e.getMessage());
        }
    }

}
