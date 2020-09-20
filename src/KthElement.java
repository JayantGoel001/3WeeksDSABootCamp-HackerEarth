import java.util.Scanner;

public class KthElement {
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
        Scanner sc = new Scanner(System.in);
        LinkedListCustom linkedList = new LinkedListCustom();
        while (true){
            int x = sc.nextInt();
            if (x==-1){
                break;
            }
            linkedList.add(x);
        }
        int k =sc.nextInt();
        Node head = linkedList.head;
        Node startHead = linkedList.head;
        while (k!=0 && head!=null){
            head = head.next;
            k--;
        }
        while (head!=null){
            startHead = startHead.next;
            head = head.next;
        }
        assert startHead != null;
        System.out.println(startHead.data);
    }
}
