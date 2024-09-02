import java.util.Scanner;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public ArrayQueue(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Function to remove the front element of the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removing " + queue[front]);

        front = (front + 1) % capacity;
        count--;
    }

    // Function to add an item to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        queue[rear] = item;
        count++;
    }

    // Function to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front];
    }

    // Function to return the size of the queue
    public int size() {
        return count;
    }

    // Function to check if the queue is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }

    // Function to check if the queue is full or not
    public boolean isFull() {
        return (size() == capacity);
    }

    // Function to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int size = scanner.nextInt();
        ArrayQueue queue = new ArrayQueue(size);

        boolean running = true;
        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if empty");
            System.out.println("6. Check if full");
            System.out.println("7. Get size");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int front = queue.peek();
                    if (front != -1) {
                        System.out.println("Front element is: " + front);
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 6:
                    if (queue.isFull()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
                    }
                    break;
                case 7:
                    System.out.println("Queue size is: " + queue.size());
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
