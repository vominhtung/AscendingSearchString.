import java.util.LinkedList;
import java.util.Scanner;

public class StringUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhập chuỗi");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i =1;j <string.length();j++){
                if (string.charAt(j) >list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character c : max){
            System.out.println(c);
        }
        System.out.println();
    }
}
