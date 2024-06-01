import axios from "axios";
import { useState } from "react";

function AddProduct() {
let [id,setId]=useState("");
let [pname,setPname]=useState("");
let [price,setPrice]=useState("");

let storeProduct=(event)=> {
    event.preventDefault();
    let product = {"id":id,"pname":pname,"price":price}
    //console.log(product)
    axios.post("http://localhost:3000/products",product).then(result=> {
        console.log(result)
    }).catch(error=>console.log(error))
    reset();
}
let reset = (event)=> {
    setId("")
    setPname("")
    setPrice("")
}
    return(
        <div>
            <h4>Add Product</h4>
            <form onSubmit={storeProduct}>
                <label>PId</label>
    <input type="number" name="id" onChange={(event)=>setId(event.target.value)} value={id}/><br/>
                <label>PName</label>
    <input type="text" name="pname" onChange={(event)=>setPname(event.target.value)} value={pname}/><br/>
                <label>Price</label>
    <input type="number" name="price" onChange={(event)=>setPrice(event.target.value)} value={price}/><br/>
                <input type="submit" value="Add Product"/>
                <input type="reset" value="reset" onClick={reset}/>
            </form>
        </div>
    )
}
export default AddProduct;