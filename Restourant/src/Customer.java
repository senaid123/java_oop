public class Customer implements Orders {
    private int table;
    private String name;
    private boolean ordered;

    public Customer(int table, String name, boolean ordered) {
        this.table = table;
        this.name = name;
        this.ordered = ordered;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    @Override
    public void order() {
        ordered = true;
    }
}
