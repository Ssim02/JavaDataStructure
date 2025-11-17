package Chapter3.section4_2;

import java.util.Arrays;
import java.util.Scanner;

public class ShapeApplication {

    private int capacity = 10;
    private Shape[] shapes = new Shape[capacity]; // 실제 도형이 저장될 배열
    private int n = 0; // 저장된 도형의 개수
    private Scanner kb = new Scanner(System.in);


    public void processCommand() {
        while(true) {
            System.out.print("$ ");
            String command = kb.next();
            if (command.equals("add"))
                handleAdd();
            else if (command.equals("show") || command.equals("showdetail"))
                handleShow(command.equals("showdetail"));
            else if (command.equals("sort")) {
                // MyUtilities.bubbleSort(shapes, n);
                Arrays.sort(shapes, 0, n); // 기본 제공 sort 메서드. generic method
            }
            else if (command.equals("exit"))
                break;
        } 
        kb.close();
    }

//    private void bubbleSort() { // 이거 작동하는거 손으로 써보기
//        for (int i = n-1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (shapes[j].computeArea() > shapes[j+1].computeArea()) {
//                    Shape tmp = shapes[j];
//                    shapes[j] = shapes[j+1];
//                    shapes[j+1] = tmp;
//                }
//            }
//        }
//    }




    private void handleShow(boolean detailed) {
        // detailed로 입력이 "show"인지 "showdetail"인지 구분
        for(int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + shapes[i].toString());
            if(detailed) {
                System.out.println("        The area is " + shapes[i].computeArea());
                System.out.println("        The area is " + shapes[i].computePerimeter());
            }
        }
    }

    private void handleAdd() {
        String type = kb.next();
        switch(type) {
            case "R":
                addShape(new Rectangle(kb.nextInt(), kb.nextInt())); // shape타입 배열에 도형을 추가하는 메서드
                break;
            case "C":
                addShape(new Circle(kb.nextInt()));
                break;
            case "T":
                // omitted
        }
    }

    private void addShape(Shape shape) {
        if(n >= capacity)
            reallocate();
        shapes[n++] = shape;
    }
    // array reallocate 구현 메서드 작성
    private void reallocate() {
        capacity *= 2;
        Shape[] temp = new Shape[capacity];
        // arraycopy() 메서드 : 한 배열을 다른 배열로 복사시켜주는 메서드
        System.arraycopy(shapes, 0, temp, 0, shapes.length);
        shapes = temp;
    }
    public static void main(String[] args) {
        ShapeApplication app = new ShapeApplication();
        app.processCommand();
    }
}
