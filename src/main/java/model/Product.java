package model;


public class Product {
    private  int id ;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
