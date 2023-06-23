package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CartTest
{
    /**
     * Rigorous Test :-)
     */

    Cart cart = new Cart();
    @Test
    public void shouldBeAbleToAddItem()
    {
        assertTrue(cart.addItem("Apple Pencil") );
        assertTrue(cart.addItem("Sony Wireless headphone") );
    }
}
