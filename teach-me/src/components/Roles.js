import React from "react";
import { Link } from "react-router-dom";
import './Sidebar.css';

class Roles extends React.Component {
  constructor(props) {
    super(props);
    this.state = { roles: [] };
  }

  componentDidMount() {
    fetch("http://localhost:8090/roles")
    .then(res => res.json())
    .then(json => {
        this.setState({roles: json})
    });
  }

  render() {
    const rolList = this.state.roles.map((rol, index) =>
    <tbody>
      <tr key={index}>
        <td>{rol.idRol}</td>
        <td>{rol.descripcionRol}</td>
      </tr>
    </tbody>);
    return (
    <div className="col-md-9">
      <div className="header">
        <h3 className="col-md-6" >Lista de roles</h3>
        <Link to="/agregar-rol" className="col-md-6"><button className="btn btn-success">Agregar rol</button></Link>
       </div>
      <table className="table text-left">
      <thead>
        <tr>
          <th>Id</th>
          <th>Descripcion</th>
        </tr>
      </thead>
        {rolList}
      </table>
    </div>
    );
  }
}

export default Roles;