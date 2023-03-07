public class Worker {
    protected String name;

    protected String role;
    protected int age;
    protected int ID;

    public Worker(String name, String role, int age, int ID) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
