
public class Stack_23 {
    public static void main(String[] args) {
        Stack nums = new Stack();

        nums.push(10);
        nums.push(30);
        System.out.println(nums.pop());
        nums.push(70);
        nums.push(20);
        System.out.println(nums.peek());
        nums.push(50);
        nums.push(90);

        nums.printStack();
    }
}