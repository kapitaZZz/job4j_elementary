package ru.job4j.pojo;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ShopDropTest {
    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }
}