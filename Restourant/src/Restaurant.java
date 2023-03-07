import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer niko = new Customer(2,"Niko", false);
        Customer sena = new Customer(2,"sena", true);
        Customer tesla = new Customer(4, "Tesla", true);

        customers.add(niko);
        customers.add(sena);
        customers.add(tesla);

        Waiter mark = new Waiter("Mark", "waiter", 25, 1123, 2);

        for(int i = 0; i < customers.size(); i++){
            if(mark.isOrdered(customers.get(i), mark)){
                customers.remove(i);
            }else{
                System.out.println("There are customers that are not served");
            }
        }

    }
}