import java.util.LinkedList;
import java.util.Scanner;

public class FindLargestString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<Character>();
        LinkedList<Character> listMax = new LinkedList<Character>();
        System.out.println("Enter String");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++){
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++){
                if (list.getLast() < string.charAt(j)){
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > listMax.size()){
                listMax.clear();
                listMax.addAll(list);
            }
            list.clear();
        }

        for (Character ch: listMax){
            System.out.printf("%s", ch);
        }
    }
}
