import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // stack  =   LIFO data structure. Last-In First-Out

        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

//        String myFavGame = stack.pop();
//        System.out.println(myFavGame);

//        String checkFirstItem = stack.peek();
//        System.out.println(checkFirstItem);

        System.out.println(stack.search("Minecraft"));


    }
}