public class employee {
    private  String name;
    private String email;
    private long salary;
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public employee(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public employee(String name, String email, long salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
}
