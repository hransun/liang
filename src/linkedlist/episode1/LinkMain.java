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
            System.out.printf("%d\t", p.val);
            p = p.next;
        }
        System.out.println();

        System.out.println("insert 10 to the end of list");
        // insert a node
        head = insert(head, 10);
        p = head;
        while (p != null) {
            System.out.printf("%d\t", p.val);
            p = p.next;
        }
        System.out.println();

        // delete node "4"
        head = delete(head, 4);
        p = head;
        System.out.println("\n delete node.val == 4 in linkedlist");
        while (p != null) {
            System.out.printf("%d\t", p.val);
            p = p.next;
        }
        System.out.println();

        LinkNode r = find(head, 6);
        if (r == null) {
            System.out.println(" not able to find 6th node");
        } else {
            System.out.println("the 6th node is " + r.val);
        }
        System.out.println();

        boolean ans = update(head, 2, 100);
        p = head;
        System.out.println("update 2nd node is 100");
        while (p != null) {
            System.out.printf("%d\t", p.val);
            p = p.next;
        }
        System.out.println();


    }

    // create a  list
    private static LinkNode create() {
        LinkNode head = new LinkNode(0, null);
        LinkNode p = head;
        for (int i = 1; i < 5; i++) {
            p.next = new LinkNode(i * 2, null);
            p = p.next;
        }
        return head;
    }

    // insert a node with val
    private static LinkNode insert(LinkNode head, int val) {
        LinkNode target = new LinkNode(val, null);
        LinkNode p = head;
        if (head == null || head.val >= val) {
            target.next = head;
            return target;
        }
        while (p.next != null && p.next.val < val) {
            p = p.next;
        }
        // insert pos
        target.next = p.next;
        p.next = target;
        return head;

    }

    //delete node with val
    private static LinkNode delete(LinkNode head, int val) {
        if (head == null) return head;
        // deal with header corner case
        if (head.val == val) {
            LinkNode newHead = head.next;
            head.next = null;
            return newHead;
        }

        LinkNode p = head;
        while (p.next != null && p.next.val != val) {
            p = p.next;
        }
        // either p.next == null or p.next.val = val
        if (p.next != null) {
            LinkNode target = p.next;
            p.next = target.next;
            target.next = null;
        }
        return head;

    }

    // update kth node start with 1 , with val
    private static boolean update(LinkNode head, int k, int val) {
        if (head == null) return false;
        int cnt = 1;
        LinkNode p = head;
        while(p.next !=null && cnt<k) {
            p = p.next;
            cnt++;
        }
        if  (cnt < k) {
            return false;
        }
        p.val = val;
        return true;
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

}
