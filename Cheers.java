//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0].toUpperCase();
                int number = Integer.parseInt(args[1]);
                String s; // s indicated a or an
                for (int i = 0; i < name.length(); i++) {
                        char c = name.charAt(i); // c indicates the char at index i
                        if (c == 'A' || c == 'E' || c == 'F' || c == 'H' || c == 'I' || c == 'L' || c == 'M' || c == 'N' |c == 'O' || c == 'R' || c == 'S' || c == 'X')
                                s = "an ";
                        else
                                s = "a  ";
                        System.out.println("Give me " + s + c + ": " + c + "!");
                }
                System.out.println("What does that spell?");
                for(int j = 0; j < number; j++)
                        System.out.println(name + "!!!");
        }
}
