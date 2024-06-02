import { useContext } from "react";
import MyContext from "./Context";

function Child5() {
let data = useContext(MyContext);   // access context reference 

    return(
        <div>
            <h4>Child5 Component</h4>
            <p>Name in child5 component is {data}</p>
        </div>
    )
}

export default Child5;