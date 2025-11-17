package Chapter3.section2;
import java.util.Scanner;

public class Scheduler {
    private int capacity = 10;
    public Event[] events = new Event[capacity];


    /*
        위 배열은 폴리모피즘(다형성)의 예시이다.
        서브클래스의 객체의 배열을
        각각 만들 필요가 없이 슈퍼 클래스 타입의 배열에 한꺼번에 저장할 수 있게됨.
        "서로 다른 타입의 데이터들을 하나의 배열에 저장할 수가 있다."
     */

    public int n = 0;
    private Scanner kb;

    public void processCommand() {
        kb = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
            String command = kb.next();
            if(command.equals("addevent")) {
                String type = kb.next();
                if(type.equalsIgnoreCase("oneday")) // 대소문자 구분 없이
                    handleAddOneDayEvent();
                else if (type.equalsIgnoreCase("duration"))
                    handleAddDurationEvent();
                else if (type.equalsIgnoreCase("deadline"))
                    handleAddDeadlinedEvent();
            }
            else if(command.equals("list")) {
                handleList();
            }
            else if(command.equals("show")) {

            }
            else if(command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }

    private void handleList() {
        // 사용자가 리스트 명령을 호출했을 때
        // 현재 등록되어있는 모든 이벤트를 화면에 출력
        for(int i = 0; i < n; i++)
            System.out.println("    " + events[i].toString()); // dynamic binding
    }

    private void handleAddDeadlinedEvent() {

    }

    private void handleAddDurationEvent() {
    }

    private void handleAddOneDayEvent() {
        System.out.print("  when: ");
        String dateString = kb.next(); // dateString = "2025/1/1"
        System.out.print("  title: ");
        String title = kb.next();

        MyDate date = parseDateString(dateString);
        OneDayEvent ev = new OneDayEvent(title, date);

        System.out.println(ev.toString());
        addEvent(ev);
    }

    private void addEvent(OneDayEvent ev) {
        if(n >= capacity) // array is full
            reallocate();
        events[n++] = ev; // 다형성 적용 : Event타입 배열에 서브클래스타입인 OneDayEvent타입 객체를 넣고 n을 하나 증가시킨다
    }

    private void reallocate() { // 배열의 크기를 늘리는 메서드
        // 배열 재할당
        Event[] tmp = new Event[capacity * 2]; // 배열의 크기를 두배로 늘림
        for (int i = 0; i < n; i++)
            tmp[i] = events[i]; // 내용을 복사
        events = tmp; // 배열의 이름 : 배열의 시작 주소를 가리키는 참조 변수. 새로운 배열을 가리키도록 함
        capacity *= 2;
    }

    private MyDate parseDateString(String dateString) {
        String[] tokens = dateString.split("/");
        // tokens[0] = "2017";(String type)
        // Integer 클래스 안에 parseInt라는 스태틱 메서드
        int year = Integer.parseInt(tokens[0]); // String to int
        int month = Integer.parseInt(tokens[1]);
        int day = Integer.parseInt(tokens[2]);

        MyDate d = new MyDate(year, month, day);
        return d;
    }

    public static void main(String[] args) {
       Scheduler app = new Scheduler();
       app.processCommand();
    }
}
