package in.ss.data.structures.problems.linkedlist.radisl;

/**
 * @author Satyendra Singh
 * @project Data-Structures
 * @package in.ss.data.structures.problems.linkedlist.radisl
 * @date 11-12-2018
 * @time 22:49
 */
public class RADISLMainTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(53);
        ll.insert(53);
        ll.insert(49);
        ll.insert(49);
        ll.insert(35);
        ll.insert(28);
        ll.insert(28);
        ll.insert(23);
        System.out.println("Before removal of duplicates");
        ll.printListFromRight();
    }

}
