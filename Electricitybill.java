import java.util.Scanner;

class Bills {
    String cName, type;
    int no, pm, cm;

    Bills(String cc, String t, int n, int p, int c) {
        cName = cc;
        type = t;
        no = n;
        pm = p;
        cm = c;
    }

    double cbilling() {
        if (cm < 100)
            return (cm * 2);
        if (cm < 200)
            return ((cm - 100) * 4.5 + 200);
        if (cm < 500)
            return ((cm - 200) * 6 + 450 + 200);
        return ((cm - 500) * 7 + 1800 + 650);
    }

    double dbilling() {
        if (cm < 100)
            return (cm);
        if (cm < 200)
            return ((cm - 100) * 2.5 + 100);
        if (cm < 500)
            return ((cm - 200) * 4 + 250 + 100);
        return ((cm - 500) * 6 + 1200 + 350);
    }
}

public class Electricity {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Units: ");
        int units = s.nextInt();
        String type = s.next();
        Bills b = new Bills("A3259", type, 100, 100, units);
        if (type.equals("D")) {
            System.out.println("Bill : " + b.dbilling());
        } else if (type.equals("B")) {
            System.out.println("Bill : " + b.cbilling());
        }
    }
}
