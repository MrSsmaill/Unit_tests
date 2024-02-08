package seminars.first.Shop;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {
        Shop testShop = new Shop();
        testShop.setProducts(getShuffleListProducts(getTestListProducts()));
        Assertions.assertThat(testShop.getProducts()).hasSize(4);
        Assertions.assertThat(testShop.getMostExpensiveProduct().getTitle()).isEqualTo(((Product)getTestListProducts().get(3)).getTitle());
        Assertions.assertThat(((Product)testShop.getSortedListProducts().get(0)).getCost()).isEqualTo(100);
        Assertions.assertThat(((Product)testShop.getSortedListProducts().get(1)).getCost()).isEqualTo(200);
        Assertions.assertThat(((Product)testShop.getSortedListProducts().get(2)).getCost()).isEqualTo(300);
        Assertions.assertThat(((Product)testShop.getSortedListProducts().get(3)).getCost()).isEqualTo(400);
    }

    static List<Product> getTestListProducts() {
        Product productA = new Product();
        productA.setTitle("iPhone");
        productA.setCost(100);
        Product productB = new Product();
        productB.setTitle("Samsung");
        productB.setCost(200);
        Product productC = new Product();
        productC.setTitle("Xiaomi");
        productC.setCost(300);
        Product productD = new Product();
        productD.setTitle("Dyson");
        productD.setCost(400);
        List<Product> productList = new ArrayList();
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);
        return productList;
    }

    static List<Product> getShuffleListProducts(List<Product> productList) {
        Collections.shuffle(productList);
        return productList;
    }

}