package Chapter3.section4;

public class DurationEvent extends Event {

    public MyDate begin;
    public MyDate end;

    public DurationEvent(String title, MyDate b, MyDate e) {
        super(title);
        begin = b;
        end = e;
    }

    public boolean isRelevant(MyDate date) {
        // 이 이벤트가 특정 날짜에 걸리는지 아닌지를 검사하는 메서드
        // begin <= date <= end is true, else false
        return begin.compareTo(date) <= 0 && end.compareTo(date) >= 0;
    }

    public String toString() {
        return title + ", " + begin.toString() + "~" + end.toString();
    }

    public MyDate getRepresentativeDate() {
        return begin;
    }
}
