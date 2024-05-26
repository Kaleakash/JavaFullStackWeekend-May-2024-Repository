import React from "react";

class Employee extends React.Component {
    constructor(props) {
        super(props);       // it is use to call super class constructor 
        this.state = {id:100,name:"Ravi",age:21}
    }
    render() {



        return(
            <div>
                <h4>Employee class component</h4>
                <h5>Id is {this.state.id} Name is {this.state.name} Age is {this.state.age}</h5>
                <h5>City is {this.props.scity} and Company is {this.props.company}</h5>
            </div>
        )
    }
}

export default Employee;