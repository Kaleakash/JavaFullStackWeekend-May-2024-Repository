class Graph {

       constructor(){
        this.adjacencyList={}           // empty object literal objects.            
       } 

       addVertex(vertex){
            if(!this.adjacencyList[vertex]){
                this.adjacencyList[vertex]=[];
                //console.log("Added information ")
            }else {
                console.log("Already information present")
            }
       }
       addEdge(vertex1,vertex2) {
                this.adjacencyList[vertex1].push(vertex2);
                this.adjacencyList[vertex2].push(vertex1);
       }
}

let graph  = new Graph();
graph.addVertex("A");
graph.addVertex("B");
graph.addVertex("C");
graph.addVertex("D");
graph.addVertex("E");
graph.addVertex("F");
graph.addVertex("G");

graph.addEdge("A","B");
graph.addEdge("B","C");
graph.addEdge("C","E");
graph.addEdge("E","G");
graph.addEdge("G","B");
graph.addEdge("G","F");
graph.addEdge("F","D");
graph.addEdge("D","A");

console.log(graph.adjacencyList)



