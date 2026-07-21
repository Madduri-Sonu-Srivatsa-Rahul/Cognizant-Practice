import React, { Component } from "react";

class CurrencyConvertor extends Component {

    constructor() {
        super();

        this.state = {
            rupees: "",
            euro: ""
        };
    }

    handleChange = (event) => {
        this.setState({
            rupees: event.target.value
        });
    }

    handleSubmit = () => {
        const euro = (this.state.rupees / 90).toFixed(2);

        this.setState({
            euro: euro
        });
        alert("Euro :" + euro);
    }

    render() {
        return (
            <div>
                <h2>Currency Convertor</h2>
                <input
                    type="number"
                    placeholder="Enter Rupees"
                    onChange={this.handleChange}
                />
                <h3>Convert to: Euro</h3>
                <button onClick={this.handleSubmit}>
                    Convert
                </button>
                <br /><br />
            </div>
        );
    }
}

export default CurrencyConvertor;