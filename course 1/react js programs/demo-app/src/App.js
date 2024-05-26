import { useState } from "react";
import Customer from "./Customer";
import Employee from "./Employee";
function Header() {
  return <h2>This is Header Component</h2>
}
function Footer() {

  return <h2>This is Footer Component</h2>
}
function App() {
let [city,setCity]=useState("Bangalore");  
 return(<div>
  <Header></Header>
  <p>Welcome to My Web Page</p>
      Welcome to React JS
      <p>City in App component is {city}</p>
      <Employee scity={city} company="IBM"></Employee>
      <hr/>
     <Customer scity={city} company="IBM"></Customer>
  <Footer></Footer>
  </div>) 
}

export default App;