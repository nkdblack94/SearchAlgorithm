import java.util.*;

public class FindTheLargestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> listMax = new LinkedList<Character>();
        LinkedList<Character> list = new LinkedList<Character>();

        //yêu cầu người dùng nhập chuỗi
        System.out.print("Enter a string: ");
        String string = input.nextLine();
            //duyệt chuỗi nhập
        for (int i = 0; i < string.length(); i++) {
            // kiểm tra list.size và, so sánh kí tự ở vị trí i của chỗi với kí tự cuối của list
            if (list.size() >= 1 && string.charAt(i) <= list.getLast()) {
                // nếu thỏa mãn 2 điều kiện trên thì xóa toàn bộ phần tử trong list
                list.clear();
            }

            // nếu ko thỏa mãn điều kiện trên thì add phần tử ở vị trí i trong chuỗi vào list.
            list.add(string.charAt(i));
            // kiểm tra nếu size của list lớn hơn size của max.
            if (list.size() > listMax.size()) {
                //thì xóa hết phần tử trong max
                listMax.clear();
                //add toàn bộ phần tử trong list vào max
                listMax.addAll(list);
            }
        }

        // in ra chuỗi con được sắp xếp theo thứ tự có độ dài lớn nhất
        for (Character ch : listMax) {
            System.out.print(ch);
        }
        System.out.println();
    }
}