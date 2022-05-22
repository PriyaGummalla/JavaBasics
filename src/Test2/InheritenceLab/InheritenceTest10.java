package Test2.InheritenceLab;


class Account {
    public void show() {
        System.out.println("Inside Account");
    }
}


public class InheritenceTest10 extends Account{

    public void show() {
        System.out.println("Inside savings account");
    }

    public static void main(String[] args) {
        Account account = new InheritenceTest10();
        account.show();
    }
}
