import { useState } from "react";

function Child2(props) {
    let [child2Name,setChild2Name]=useState("John");    // state 

    return(
        <div style={{"backgroundColor":"gray"}}>
            <h4>Child2 Component</h4>
            <p>Parent name in child1 component is <b>{props.pname}</b></p>
            <p>Child2 name in child2 component is <b>{child2Name}</b></p>
            <p>{props.handleName(child2Name)}</p>
        </div>
    )
}

export default Child2;