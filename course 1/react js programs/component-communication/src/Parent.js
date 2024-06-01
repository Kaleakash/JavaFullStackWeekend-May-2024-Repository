import Child1 from "./Child1";
import Child2 from "./Child2";

function Parent() {


    return(
        <div style={{"backgroundColor":"yellow"}}>
            <h4>Parent Component</h4>
            <Child1></Child1>
            <hr/>
            <Child2></Child2>
        </div>
    )
}

export default Parent;