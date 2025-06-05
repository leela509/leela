import java.util.Scanner;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("Popped: " + stackArray[top--]);
        } else {
            System.out.println("Stack Underflow");
        }
    }

    public void peek() {
        if (top >= 0) {
            System.out.println("Top Element: " + stackArray[top]);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.print("Stack Elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(5);
        int choice;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = scanner.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
