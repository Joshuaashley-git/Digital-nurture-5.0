import React, { Component } from 'react';
import CurrencyConverter from './CurrencyConverter';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 5
    };

    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleClick = this.handleClick.bind(this);
  }

  increment() {
    this.setState((prevState) => ({
      counter: prevState.counter + 1
    }));
    this.sayHello();
  }

  sayHello() {
    alert('Hello! Member!');
  }

  decrement() {
    this.setState((prevState) => ({
      counter: prevState.counter - 1
    }));
  }

  sayWelcome(message) {
    alert(message);
  }

  handleClick(event) {
    // event here is React's SyntheticEvent wrapper around the native DOM event
    alert('I was clicked');
  }

  render() {
    return (
      <div className="App">
        <h1>{this.state.counter}</h1>

        <button onClick={this.increment}>Increment</button>
        <br />
        <button onClick={this.decrement}>Decrement</button>
        <br />
        <button onClick={() => this.sayWelcome('welcome')}>Say welcome</button>
        <br />
        <button onClick={this.handleClick}>Click on me</button>

        <CurrencyConverter />
      </div>
    );
  }
}

export default App;