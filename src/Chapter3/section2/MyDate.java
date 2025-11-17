package Chapter3.section2;

public class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate(int y, int m, int d) { // 생성자
        year = y;
        month = m;
        day = d;
    }

    public String toString() {
        return year + "/" + month + "/" + day;
    }
}
