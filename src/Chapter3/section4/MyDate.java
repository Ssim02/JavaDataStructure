package Chapter3.section4;

public class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate(int y, int m, int d) { // 생성자
        year = y;
        month = m;
        day = d;
    }

    public int compareTo(MyDate other) {
        // 두 날짜를 비교해 누가 더 큰지 작은지를 검사해서 숫자로 리턴해주는 메서드
        if(year < other.year || year == other.year && month < other.month
                || year == other.year && month == other.month && day < other.day)
            return -1;
        else if (year > other.year || year == other.year && month > other.month
                || year == other.year && month == other.month && day > other.day)
            return 1;
        else
            return 0;
    }

    public String toString() {
        return year + "/" + month + "/" + day;
    }
}
