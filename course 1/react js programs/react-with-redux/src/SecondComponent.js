import { useSelector } from "react-redux";

function SecondComponent() {

let lname = useSelector(gs=>gs.name)
    return(
        <div>
            <h3>Second Component</h3>
            <p>Name in second component as global variable {lname}</p>
        </div>
    )
}

export default SecondComponent;