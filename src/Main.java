public class Main {
    public static void main(String[] args) {
        double currentAccount = 100;
        double endAccount;
        double added = 1050;
        if (added >= 1000) {
            endAccount = currentAccount + added + added * 0.01;
        } else {
            endAccount = currentAccount + added;
        }
        System.out.println(endAccount);
    }
}