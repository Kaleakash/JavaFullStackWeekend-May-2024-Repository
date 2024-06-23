class Node {
    constructor(data){
        this.data = data;
        this.left  = null;
        this.right = null;
    }
}
class BinaryTree {
    constructor(){
        this.root = null;       // root is null 

    }
    insert(data){
        let newNode = new Node(data);   //100

        if(this.root==null){
            this.root=newNode;
            console.log("root node created..")
        }else {
            //console.log("logic to write the node may be left or right")
            this.insertNode(this.root,newNode);
        }
    }

    insertNode(node,newNode){
        if(node.left==null){
            node.left=newNode;
            console.log("added left of root node")
        }else {
            console.log("added right of root node")
            node.right=newNode;
        }   
    }
}
let tree = new BinaryTree();
tree.insert(100);
tree.insert(10);
tree.insert(50);
console.log(tree);