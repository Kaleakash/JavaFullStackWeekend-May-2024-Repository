import { useState } from "react"
function Login() {
let [emailid,setEmaiId]=useState("");
let [password,setPassword]=useState("");
let fun1 = (event)=>{
    //console.log("event fired in fun1")
    let vemailid = event.target.value;  // to get email field value 
    //console.log(vemailid)
    setEmaiId(vemailid);
}
let fun2 = (event)=> {
    //console.log("event fired in fun2")
    let vpassword = event.target.value;
   // console.log(vpassword);
   setPassword(vpassword)
}
let checkLoginDetails = (event)=> {
    event.preventDefault();
    console.log(emailid)
    console.log(password)
    if(emailid=="akash@gmail.com" && password=="123"){
        alert("successfully login")
    }else {
        alert("failure try once again")
    }
}
    return(
        <div>
            <h2>Login Page</h2>
            <form onSubmit={checkLoginDetails}>
                <label>EmailId</label>
                <input type="email" name="emailid" onChange={fun1}/><br/>
                <label>Password</label>
                <input type="password" name="password" onChange={fun2}/><br/>
                <input type="submit" value="SignIn"/>
                <input type="reset" value="reset"/>
            </form>
        </div>
    )
}

export default Login