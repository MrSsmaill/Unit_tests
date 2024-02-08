package seminars.first.Shop;

public class Product implements Comparable<Product> {
    private Integer cost;
    private String title;

    public Product() {
    }

    public Integer getCost() {
        return this.cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int compareTo(Product product) {
        return this.getCost().compareTo(product.getCost());
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }
}