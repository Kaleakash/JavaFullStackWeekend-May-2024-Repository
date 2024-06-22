class Node {
    constructor(data){
        this.data = data;   // data as instance variable 
        this.next = null;       // next is use to refer to another node 
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
                //console.log("if called..")
                this.head=newNode;// firstNode  data is 100, next is null 
                return;
            }
            //console.log(node.next);
            while(node.next){
                //console.log("while loop")
                node = node.next;
            }       // travels from left to right then add new node in next property 
            node.next=newNode;      // newNode with data as 200 and next is null append to 100 node data.
        }
        printList() {
            let node = this.head;       // first node 
            //console.log("HEAD")
            process.stdout.write("[HEAD->")
                while(node){
                    //console.log(node.data)   // give the value as 100, 200
                    process.stdout.write(node.data+"->")
                    node = node.next;    // it point to 2nd node, it point to 3rd node  
                }
                process.stdout.write("NULL]")
            //console.log("NULL")

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
myList.printList();