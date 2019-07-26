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
    const usersList = this.state.users.map((user, index) =>
    <tbody>
      <tr key={index}>
        <td>{user.id}</td>
        <td>{user.nombre}</td>
        <td>{user.apPaterno}</td>
        <td>{user.apMaterno}</td>
        <td>{user.ci}</td>
        <td>{user.email}</td>
      </tr>
    </tbody>);
    return (
    <div className="col-md-9">
      <h2>Lista de usuarios</h2>
      <table className="table text-left">
      <thead>
        <tr>
          <th>Id</th>
          <th>Nombre</th>
          <th>Apellido Paterno</th>
          <th>Apellido Materno</th>
          <th>Cedula</th>
          <th>Email</th>
        </tr>
      </thead>
        {usersList}
      </table>
    </div>
    );
  }
}

export default MainContent;