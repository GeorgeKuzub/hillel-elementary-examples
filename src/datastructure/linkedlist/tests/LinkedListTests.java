package datastructure.linkedlist.tests;

import datastructure.linkedlist.LinkedList;
import datastructure.linkedlist.Node;
import org.junit.*;

public class LinkedListTests {
    private static LinkedList linkedList;

    // This method will run once before run all test methods
    @BeforeClass
    public static void globalInit() {
        linkedList = new LinkedList();
    }

    // This method will run once after finish run all test methods
    @AfterClass
    public static void globalFinish() {
        linkedList = null;
    }

    @Before
    public void beforeEachTest() {
        // This method will start before start each test-method
        linkedList = new LinkedList();
    }

    @After
    public void afterEachTest() {
        // This method will start after finish each test-method

    }

    @Test
    public void getHeadElement() {
        String headData = "A";
        String notHeadData = "B";

        linkedList.insertAfter(headData);
        linkedList.insertAfter(notHeadData);
        Assert.assertEquals(headData, linkedList.getHead().getData());
    }


    @Test
    public void getTailElement() {
        String notTailElement1 = "A";
        String notTailElement2 = "B";
        String tailElement = "C";

        linkedList.insertAfter(notTailElement1);
        linkedList.insertAfter(notTailElement2);
        linkedList.insertAfter(tailElement);

        Assert.assertEquals(tailElement, linkedList.getTail().getData());
    }

    @Test
    public void findElement() {
        String element1 = "A";
        String element2 = "B";
        String element3 = "C";

        linkedList.insertAfter(element1);
        linkedList.insertAfter(element2);
        linkedList.insertAfter(element3);

        Node node = linkedList.find(element2);

        Assert.assertEquals(element2, node.getData());
    }

    //    @Test(expected = Exeption.class)
    @Test
    public void removeAllElementsWhenLinkedListIsEmpty() {
        linkedList.removeAll();
    }
}
