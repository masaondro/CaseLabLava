import org.example.LinkedListWorker;
import org.example.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {
    private ListNode head;
    private LinkedListWorker linkedListReversal;

    @Before
    public void setup() {
        head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        linkedListReversal = new LinkedListWorker();
    }

    @Test
    public void testReverseListIterative() {
        ListNode reversedHead = linkedListReversal.reverseList(head);
        int expectedData = 5;
        while (reversedHead != null) {
            Assert.assertEquals(expectedData, reversedHead.getData());
            reversedHead = reversedHead.getNext();
            expectedData--;
        }
    }

    @Test
    public void testReverseListRecursive() {
        ListNode reversedHead = linkedListReversal.reverseListRecursive(head);
        int expectedData = 5;
        while (reversedHead != null) {
            Assert.assertEquals(expectedData, reversedHead.getData());
            reversedHead = reversedHead.getNext();
            expectedData--;
        }
    }
}