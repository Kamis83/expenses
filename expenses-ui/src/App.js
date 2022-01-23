import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import {useState, } from "react";

function App() {
  let [expense, setExpense] =useState({
    description: '',
    price: 0
  });
  let [name, setName] = useState('Kamil')
  function onHello() {
    axios.get('/hello/' + name).then(res => setExpense(res.data))
  }
  function onNameChange(newNameEvent) {
    setName(newNameEvent.target.value)
  }

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h>TO BEDZIE MOJA STRONA</h>
        <input type="text" value={name} onChange={onNameChange} />
        <div>{expense.description}</div>
        <div>{expense.price}</div>
        <div>
          <button onClick={onHello}>OK</button>
        </div>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>

    </div>
  );
}

export default App;
