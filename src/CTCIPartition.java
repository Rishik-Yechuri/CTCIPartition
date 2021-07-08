public class CTCIPartition {
    public static void main(String[] args) {
        ListNode inputList = new ListNode(1);
        ListNode inputListRunner = inputList;
        inputListRunner.next = new ListNode(2);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(3);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(9);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(6);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(5);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(4);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(8);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(6);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(2);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(10);
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode(1);
        inputList = partitionList(inputList,6);
        System.out.println(inputList);
        inputList = inputListRunner;
    }

    public static ListNode partitionList(ListNode originalList,int numToPartition) {
        ListNode runner = originalList;
        ListNode smallerList = new ListNode();
        ListNode largerList = new ListNode();
        ListNode largerListHolder = largerList;
        ListNode smallerListHolder = smallerList;
        while(runner != null){
            if(runner.val < numToPartition){
                smallerList.val = runner.val;
                smallerList.next = new ListNode();
                smallerList = smallerList.next;
            }else{
                largerList.val = runner.val;;
                largerList.next = new ListNode();
                largerList = largerList.next;
            }
            runner = runner.next;
        }
        smallerList.next = largerListHolder;
        return smallerListHolder;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
