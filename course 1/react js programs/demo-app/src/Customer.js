import { useState } from "react";


function Customer(props) {
let [id,setId]=useState(100);   // in function component to declare state variable. 
const [name,setName]=useState("Ajay");
let [age,setAge]=useState(23);

    return(
        <div>
            <h4>Customer function component</h4>
            <p>Id is {id} Name is {name}, age is {age}</p>
            <p>City is {props.scity} Company is {props.company}</p>
        </div>
    )
}

export default Customer;