package Chapter3.section4;

public class DeadlinedEvent extends Event {
    public MyDate deadline;

    public DeadlinedEvent(String title, MyDate date) {
        super(title);
        this.deadline = date;
    }

    public boolean isRelevant(MyDate date) {
        // 이 이벤트가 특정 날짜에 걸리는지 아닌지를 검사하는 메서드
        return deadline.compareTo(date) >= 0;
    }

    public String toString() {
        return title + ", " + deadline.toString();
    }

    public MyDate getRepresentativeDate() {
        return deadline;
    }
}
