
public class example1 {

    private double principal;
    private double rate;
    private int time;

    example1(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateCompoundInterest() {
        double compoundInterest = principal * Math.pow(1 + (rate / 100), time) - principal;
        return compoundInterest;
    }

    // Setters and getters if needed
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTime() {
        return time;
    }

    public static void main(String[] args) {
        // Example usage
        example1 calculator1 = new example1(1000, 5, 2);
        example1 calculator2 = new example1(1500, 6, 3);

        double interest1 = calculator1.calculateCompoundInterest();
        double interest2 = calculator2.calculateCompoundInterest();

        System.out.println("Compound Interest for Calculator 1: " + interest1);
        System.out.println("Compound Interest for Calculator 2: " + interest2);
    }
}