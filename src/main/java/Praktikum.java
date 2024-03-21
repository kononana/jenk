public class Praktikum {

    public static void main(String[] args) {
        String name = "Kate Loons";
        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println("Имя " + name + " можно использовать для печати на банковской карте.");
        } else {
            System.out.println("Имя " + name + " нельзя использовать для печати на банковской карте.");
        }
    }

}