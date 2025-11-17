package Chapter3.section4_2;

public class MyUtilities {
    // 이 bubbleSort메서드가 왜 컴파일이 되는지를 이해하기
    // 아래와 같이 구현하면, 어떤 타입의 데이터이던 MyComaprable 인터페이스를
    // 구현하고 있기만 하다면, 아래의 bubbleSort알고리즘으로 정렬이 가능하다.
    // 즉, 이 bubbleSort알고리즘은 어디에 존재하던 하나만 존재하기만 하면
    // 위의 조건을 만족한다면 다 정렬이 가능해진다.
    // 즉, generic해진다.
    public static void bubbleSort(MyComparable[] data, int size) {
        for(int i = size-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(data[j].compareTo(data[j+1]) > 0) {
                    MyComparable tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
    }
}
