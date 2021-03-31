package C1;

public class b7 {

    public void printDay(int month, int year) {
        int[] day = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2) {
            System.out.println("Ngay cua thang " + month + " trong nam " + year + " la " + (day[month] + 1));
            return;
        }
        System.out.println("Ngay cua thang " + month + " trong nam " + year + " la " + day[month]);
    }

    public static void main(String[] args) {
        int month = 1, year = 2022;
        b7 obj = new b7();
        obj.printDay(month, year);
    }
}