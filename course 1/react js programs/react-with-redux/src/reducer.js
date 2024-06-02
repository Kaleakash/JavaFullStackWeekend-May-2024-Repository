let initialState = {
    name:"Akash",        // global state variable.
    skillset:["Java","Angular","ReactJS","HTML","JS"],
    counter:100
}


function reducer(state=initialState,action) {
    console.log(action)
    // we can do some action 
    if(action.type=="INCREMENT"){
        //return {...state,counter:state.counter+1}
        return {...state,counter:state.counter+action.payload}
    }
    return state;
}


// function reducer(state,action){
//     // using axios.get("url")
//     return state;
// }
export default reducer;

