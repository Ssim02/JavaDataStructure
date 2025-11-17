package Chapter3.section2;

public class OneDayEvent extends Event {

    public MyDate date;

    public OneDayEvent(String title, MyDate date) {
        super(title); // super class에 디폴트 생성자가 없으니까
        this.date = date;
    }

    public String toString() { // method overriding
        return title + ", " + date.toString();
    }
}
