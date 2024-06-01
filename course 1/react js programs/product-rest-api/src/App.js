import logo from './logo.svg';
import './App.css';
import DisplayProduct from './DisplayProduct';
import AddProduct from './AddProduct';

function App() {
  return (
    <div className="App">
      <h2>Product Management System Using json-server with axios</h2>
      <AddProduct></AddProduct>
      <DisplayProduct></DisplayProduct>
    </div>
  );
}

export default App;
