package Chapter3.section4;

public class OneDayEvent extends Event {

    public MyDate date;

    public OneDayEvent(String title, MyDate date) {
        super(title); // super class에 디폴트 생성자가 없으니까
        this.date = date;
    }

    public boolean isRelevant(MyDate date) {
        // 이 이벤트가 특정 날짜에 걸리는지 아닌지를 검사하는 메서드
        return this.date.compareTo(date) == 0;
    }

    public String toString() { // method overriding
        return title + ", " + date.toString();
    }

    public MyDate getRepresentativeDate() {
        return date;
    }
}
