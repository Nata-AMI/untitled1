public class Main {
    public static void main(String[] args) {
        double currentaccount = 100;
        double endaccount;
        double added=1050;
        if (added>=1000) {
            endaccount = currentaccount+added+added*0.01;
        } else {
            endaccount=currentaccount+added;
        }
        System.out.println(endaccount);
    }
}