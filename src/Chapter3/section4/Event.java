package Chapter3.section4;

public abstract class Event implements Comparable {
    public String title;
    public Event(String title) {
        this.title = title;
    }

    public abstract boolean isRelevant(MyDate date);
    // 그 이벤트에 대표 날짜를 리턴해주는 메서드
    public abstract MyDate getRepresentativeDate();

    public int compareTo(Object other) {
        MyDate mine = getRepresentativeDate();
        MyDate yours = ((Event)other).getRepresentativeDate();
        return mine.compareTo(yours);
    }
}
