import React, { Component } from 'react';

const RUPEES_PER_EURO = 80;

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: ''
    };

    this.handleAmountChange = this.handleAmountChange.bind(this);
    this.handleCurrencyChange = this.handleCurrencyChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleAmountChange(event) {
    this.setState({ amount: event.target.value });
  }

  handleCurrencyChange(event) {
    this.setState({ currency: event.target.value });
  }

  handleSubmit(event) {
    event.preventDefault();
    const { amount, currency } = this.state;
    const convertedAmount = Number(amount) * RUPEES_PER_EURO;
    alert(`Converting to  ${currency} Amount is ${convertedAmount}`);
  }

  render() {
    return (
      <div>
        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Amount: </label>
            <input
              type="text"
              value={this.state.amount}
              onChange={this.handleAmountChange}
            />
          </div>
          <br />
          <div>
            <label>Currency: </label>
            <textarea
              value={this.state.currency}
              onChange={this.handleCurrencyChange}
            />
          </div>
          <br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConverter;