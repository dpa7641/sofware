import React from "react";
import { Link } from "react-router-dom";
import './Sidebar.css';

class Usuarios extends React.Component {
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
  eliminar(){
    DeleteDbFiles.execute(usuario, user.id, true);
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
        <td><button type="button" class="btn btn-default" aria-label="Left Align" >
  <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
</button></td>
        <td><button type="button" class="btn btn-default" aria-label="Left Align" onClick={eliminar()}>
  <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
</button></td>
      </tr>
    </tbody>);
    return (
    <div className="col-md-9">
      <div className="header">
        <h2 className="col-md-6" >Lista de usuarios</h2>
        <Link to="/agregar-usuario" className="col-md-6"><button className="btn btn-success">Agregar usuario</button></Link>
       </div>
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

export default Usuarios;