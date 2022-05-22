package Test1.InheritenceLab;

public class AbstractTest4 {
    public static void main(String[] args) {
        LCD lcd = new LCD();
        lcd.display();
    }
}

class LCD extends Television implements Monitor {
    // code goes here
}

abstract class Television {
    public void display() {
        System.out.println("In Television class");
    }
}

interface Monitor {
    public void display();
}
