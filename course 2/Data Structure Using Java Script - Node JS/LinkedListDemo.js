class Node {
    constructor(data){
        this.data = data;   // data as instance variable 
        this.next = null;
    }
}
class LinkedList {
        constructor(head=null){
            console.log("linked list constructor called...")
            this.head=head;    // first node with head null value. 
        }
        appendNode(newNode){
            let node = this.head;    // head is null 1st time head is null 
            if(node==null){
                this.head=newNode;// firstNode
                return;
            }
            console.log(node.next);
            while(node.next){
                node = node.next;
            }       // travels from left to right then add new node in next property 
            node.next=newNode;
        }
}

let myList = new LinkedList();
let firstNode = new Node(100);
let secondNode = new Node(200);
let thirdNode = new Node(300);
let fourthNode = new Node(400);
myList.appendNode(firstNode);
myList.appendNode(secondNode);      // 200
myList.appendNode(thirdNode);
myList.appendNode(fourthNode);