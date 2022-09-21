package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.product.Book;
import ru.netology.product.Product;
import ru.netology.product.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    Product book1 = new Book(1, "книга", "Гарри Поттер", 1200, "Д. Роулинг");
    Product book2 = new Book(2, "книга", "Хоббит", 1500, "Д. Толкин");
    Product book3 = new Book(3, "книга", "Властелин колец", 1500, "Д. Толкин");
    Product book4 = new Book(4, "книга", "Сияние", 1000, "С. Кинг");
    Product smartphone1 = new Smartphone(5, "смартфон", "X5", 15000, "Honor");
    Product smartphone2 = new Smartphone(6, "смартфон", "iPhone 13", 80000, "Apple");
    Product smartphone3 = new Smartphone(7, "смартфон", "X5", 36000, "OPPO");
    Product smartphone4 = new Smartphone(8, "смартфон", "3310", 5000, "Nokia");

    @BeforeEach
    public void setup() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);
    }

    @Test
    public void shouldAllProducts() {
        Product[] expected = {smartphone1, smartphone3};
        Product[] actual = manager.searchBy("X5");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOneProduct() {
        Product[] expected = {book2};
        Product[] actual = manager.searchBy("Хоббит");
    }

    @Test
    public void shouldEmpty() {
        Product[] expected = {};
        Product[] actual = manager.searchBy("gyktu");
    }
}
