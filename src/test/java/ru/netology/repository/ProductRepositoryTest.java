package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.product.Book;
import ru.netology.product.Product;
import ru.netology.product.Smartphone;

public class ProductRepositoryTest {

    Product book1 = new Book(1, "книга", "Гарри Поттер", 1200, "Д. Роулинг");
    Product book2 = new Book(2, "книга", "Хоббит", 1500, "Д. Толкин");
    Product book3 = new Book(3, "книга", "Властелин колец", 1500, "Д. Толкин");
    Product book4 = new Book(4, "книга", "Сияние", 1000, "С. Кинг");
    Product smartphone1 = new Smartphone(5, "смартфон", "X5", 15000, "Honor");
    Product smartphone2 = new Smartphone(6, "смартфон", "iPhone 13", 80000, "Apple");
    Product smartphone3 = new Smartphone(7, "смартфон", "A55", 36000, "OPPO");
    Product smartphone4 = new Smartphone(8, "смартфон", "3310", 5000, "Nokia");

    @Test
    public void shouldAllSave() {
        ProductRepository repository = new ProductRepository();
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);
        repository.save(book4);
        repository.save(smartphone1);
        repository.save(smartphone2);
        repository.save(smartphone3);
        repository.save(smartphone4);

        Product[] expected = {book1, book2, book3, book4, smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEmpty() {
        ProductRepository repository = new ProductRepository();
        Product[] expected = {};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOne() {
        ProductRepository repository = new ProductRepository();
        repository.save(book1);
        Product[] expected = {book1};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveById() {
        ProductRepository repository = new ProductRepository();
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);
        repository.save(book4);
        repository.save(smartphone1);
        repository.save(smartphone2);
        repository.save(smartphone3);
        repository.save(smartphone4);
        repository.removeById(4);

        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByIdOne() {
        ProductRepository repository = new ProductRepository();
        repository.save(book1);
        repository.removeById(1);
        Product[] expected = {};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


}
