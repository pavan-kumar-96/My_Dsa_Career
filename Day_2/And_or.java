// "||" it is an or operator,it will execute the code if one of condition is
// true
// "&&" it is an and operator,it will execute the code if both the condtions are
// true

public class And_or {
    public static void main(String[] args) {

        if (6 % 3 == 0 || 6 % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (6 % 3 == 0 && 6 % 4 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
