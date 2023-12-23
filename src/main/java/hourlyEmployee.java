public class hourlyEmployee extends employee{
    private  int timeWork;

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" +
                "timeWork=" + timeWork +
                "} " + super.toString();
    }

    public hourlyEmployee(String name, String email, long salary, int timeWork) {
        super(name, email, salary);
        this.timeWork = timeWork;
    }


}
