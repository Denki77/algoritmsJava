package lesson3;

public class ReverseString {
    public ReverseString(String string) {
        MyStack<Character> myStack = new MyStack<Character>();
        for (int i = 0; i < string.length(); i++) {
            myStack.push(string.charAt(i));
        }
        int myStackSize = myStack.size();
        for (int i = 0; i < myStackSize; i++) {
            System.out.print(myStack.pop());
        }
    }
}
