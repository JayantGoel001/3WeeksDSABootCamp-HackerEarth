import java.util.HashSet;
import java.util.Scanner;

public class CircularList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class LinkedListCustom{
        Node head;
        void add(int element){
            if (head==null){
                head = new Node(element);
            }else {
                Node temp = head;
                while (temp.next!=null){
                    temp = temp.next;
                }
                temp.next = new Node(element);
            }
        }
    }
    public static void main(String[] args) {
        LinkedListCustom linkedListCustom = new LinkedListCustom();
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        while (true){
            int x = scanner.nextInt();
            if (x==-1 || hashSet.contains(x)){
                break;
            }
            linkedListCustom.add(x);
            hashSet.add(x);
        }
        while (linkedListCustom.head!=null){
            System.out.print(linkedListCustom.head.data+" ");
            linkedListCustom.head = linkedListCustom.head.next;
        }
    }
}
