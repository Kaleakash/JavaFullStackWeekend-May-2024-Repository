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
    appendNode(node){
        //logic to append node. 
    }
    printList() {
        displayAll account details 
    }
}
// to hold type of account : saving, current account, loan account, salary account etc. 
class TreeNode {
    constructor(data){
        this.root = new Node(data);      
        this.children = [];            // root node can have more than on children. 
    }
    searchNode(accno) baseUpvalue ie accno1 with accno as 100 
}
// this class contains 3 to 4 method 
//1 : method create the account : accno,name, amount , typeofaccount(with treenode reference.)
class Bank {
    constructor(accno,name,amount,typeofaccount){}
    transferammont(to,from,amount)
    checkBalance(accno)
}
let accobj1 = new Account(accno,name,amount,typeofaccount);
let accobj2 = new Account(accno,name,amount,typeofaccount);
let accobj3 = new Account(accno,name,amount,typeofaccount);

let list = new LinkedList();
let node1 = new Node(accobj1);   // in place of 100 we are passing account objects. 
list.appendNode(node1);



let rootNode = new TreeNode("root account ")
let saving=new TreeNode("saving account");
let loan=new TreeNode("loan account");



