import { useContext } from "react";
import MyContext from "./Context";

function Child8() {

    let data = useContext(MyContext);   // access context reference 
    return(
        <div>
            <h4>Child8 Component</h4>
            <p>Name is child8 is {data}</p>
        </div>
    )
}

export default Child8;