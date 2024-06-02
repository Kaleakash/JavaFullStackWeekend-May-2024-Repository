import logo from './logo.svg';
import './App.css';
import FirstComponent from './FirstComponent';
import SecondComponent from './SecondComponent';
import SkillSet from './SkillSet';
import IncrementCounter from './IncrementCouter';

function App() {
  return (
    <div className="App">
     <h4>React with Redux Concept</h4>
     <FirstComponent></FirstComponent>
     <SecondComponent></SecondComponent>
     <hr/>
     <SkillSet></SkillSet>
     <hr/>
     <IncrementCounter></IncrementCounter>
    </div>
  );
}

export default App;
