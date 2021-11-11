package artemisaix.ejercicios;

public class Customer {

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    private int id;
    private String name;

    
    // getters/setters, custom hashcode/equals

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
