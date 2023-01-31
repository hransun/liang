package linkedlist.episode1;

import javax.swing.text.StyledEditorKit;

/**
 *  define linked list
 */
class LinkNode {
    int val;
    LinkNode next;
    LinkNode() {
        val = 0;
        next = null;
    }
    LinkNode(int val , LinkNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkMain {
    public static void main(String[] args) {
        LinkNode head = create();
        LinkNode p = head;

        System.out.println("original linked list");
        while (p != null) {
            System.out.printf("%d\t",p.val);
            p = p.next;
        }

        // insert a node
        head = insert(head,10);
        p = head;
        while (p != null) {
            System.out.printf("%d\t",p.val);
            p = p.next;
        }
        System.out.println();

        // delete node "4"
        head = delete(head,4);
        p = head;
        System.out.println("\n insert node 4 in linkedlist");
        while (p != null) {
            System.out.printf("%d\t",p.val);
            p = p.next;
        }
        System.out.println();

        LinkNode r = find(head,6);
        if (r == null) {
            System.out.println(" not able to find 6th node");
        } else {
            System.out.println("the 6th node is " + r.val);
        }
        System.out.println();

        boolean ans = update(head,2,100);
        p = head;
        System.out.println("update 2nd node is 100");
        while (p != null){
            System.out.printf("%d\t",p.val);
            p = p.next;
        }
        System.out.println();


    }

    // find kth node start from 1
    private static LinkNode find(LinkNode head, int k) {
        if (head == null) {
            return null;
        }
        int cnt =1;
        LinkNode p = head;
        while (p.next != null && cnt < k) {
            p = p.next;
            cnt++;
        }
        if (cnt < k) {
            return null;
        }
        return p ;
    }

    private static LinkNode create() {
    }
}
