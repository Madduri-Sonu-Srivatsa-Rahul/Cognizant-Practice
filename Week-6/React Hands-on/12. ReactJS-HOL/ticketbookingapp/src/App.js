import React, { Component } from "react";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false,
    };
  }

  handleLogin = () => {
    this.setState({
      isLoggedIn: true,
    });
  };

  handleLogout = () => {
    this.setState({
      isLoggedIn: false,
    });
  };

  render() {
    return (
      <div style={{ textAlign: "center" }}>
        <h1>Ticket Booking App</h1>

        {this.state.isLoggedIn ? (
          <div>
            <LogoutButton onClick={this.handleLogout} />
            <UserPage />
            <button>Book Ticket</button>
          </div>
        ) : (
          <div>
            <LoginButton onClick={this.handleLogin} />
            <GuestPage />
          </div>
        )}
      </div>
    );
  }
}

export default App;