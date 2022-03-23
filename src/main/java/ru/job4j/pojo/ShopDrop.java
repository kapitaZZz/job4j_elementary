package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length - 1; i++) {
            Product pr = products[i];
            if (pr == null) {
                products[i] = products[i + 1];
            }
        } // после цикла такая строка
        products[products.length - 1] = null;
        return products;
    }
}
