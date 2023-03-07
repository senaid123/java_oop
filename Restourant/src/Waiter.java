public class Waiter extends Worker {
    public int table;

    public Waiter(String name, String role, int age, int ID, int table) {
        super(name,role,age,ID);
        this.table = table;
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

    public boolean isOrdered(Customer customer, Waiter waiter){
        if (customer.getTable() == waiter.getTable()){
            return customer.getOrdered();
        }else {
            return false;
        }
    }
}
