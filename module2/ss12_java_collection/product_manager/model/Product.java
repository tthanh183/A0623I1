package ss12_java_collection.product_manager.model;

public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private double value;

    public Product() {
    }

    public Product(String id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Product o) {
        if(this.getValue() > o.getValue()) {
            return 1;
        }else if(this.getValue() == o.getValue()) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
