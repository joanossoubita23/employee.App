public class hourlyEmployee extends employee{
    public hourlyEmployee(int id) {
        super(id);
    }
    private int hourWork;

    public int getHourWork() {
        return hourWork;
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" +
                "hourWork=" + hourWork +
                "} " + super.toString();
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    public hourlyEmployee(String name, String email, long salary) {
        super(name, email, salary);
    }
}
