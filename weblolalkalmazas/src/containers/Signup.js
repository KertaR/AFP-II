import React, {Component} from "react";
import "./Signup.css";

export default class Singup extends Component{
  render(){
    return (
      <form>
        <h3>Sign up</h3>

        <div className="from-group">
          <label>First name</label>
          <input type="text" className="from-control" placeholder="First name"/>

          <label>Last name</label>
          <input type="text" className="from-control" placeholder="Last name"/>

          <label>Username</label>
          <input type="text" className="from-control" placeholder="Username"/>

          <label>Email address</label>
          <input type="email" className="from-control" placeholder="Email"/>

          <label>Password</label>
          <input type="password" className="from-control" placeholder="Password"/>

          <button type="submit" className="btn btn-primary btn-block">Sign up</button>
        </div>
      </form>
    );
  }
}