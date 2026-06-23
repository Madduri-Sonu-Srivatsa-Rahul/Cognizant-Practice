package JunitExcercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {
    private CartService cart;

    @BeforeEach
    void setup(){
        cart = new CartService();
    }

    @AfterEach
    void tearDown(){
        cart.clearCart();
        cart = null;
    }

    @Test
    void addItem(){
        cart.addItem("Tablet");
        assertEquals(1,cart.getItemCount());
    }

    @Test
    void emptyCart(){
        assertEquals(0,cart.getItemCount());
    }

    @Test
    void testClearCart(){
        //Arrange
        cart.addItem("Laptop");
        //Act
        cart.clearCart();
        //Assert
        emptyCart();
    }


}