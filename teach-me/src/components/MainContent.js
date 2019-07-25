import React from "react";
import './Sidebar.css';

class MainContent extends React.Component {
  constructor(props) {
    super(props);
    this.state = { users: [] };
  }

  componentDidMount() {
    fetch("http://localhost:8090/usuarios")
    .then(res => res.json())
    .then(json => {
        this.setState({users: json})
    });
  }

  render() {
    const usersList = this.state.users.map((user, index) => <li key={index}>{user.nombre}</li>);
    return (
      <ul className="user-list">
          {usersList}
      </ul>
    );
  }
}

export default MainContent;