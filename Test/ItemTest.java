import com.davhal.Item;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

public class ItemTest {

   @Before
    public void initialize() {
        Item testItemObject = null;
    }

    @Test
    public void itemObjectFieldsTest(){

       String itemName = "itemName";
       double itemPrice = 0.30D;
       char itemSku = 'A';

       try {
           Item testItemObject = new Item(itemName,itemPrice, itemSku);
           assertTrue(testItemObject instanceof Item);
       }catch(Exception e){
           fail("itemObjectFieldsTest Failed!" + e.getMessage());
       }
    }

}
