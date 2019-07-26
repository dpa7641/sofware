import React from "react";
import { Link } from "react-router-dom";
import './Sidebar.css';

const Sidebar = () => (
    <div className="col-md-3">
        <div className="sidebar">
            <Link to="/usuarios"><button className="btn btn-primary btn-block">Lista de usuarios</button></Link>
            <Link to="/roles"><button className="btn btn-primary btn-block">Lista de roles</button></Link>
            <Link to="/permisos"><button className="btn btn-primary btn-block">Lista de permisos</button></Link>
            <Link><button className="btn btn-primary btn-block">Asignar rol a usuario</button></Link>
            <Link><button className="btn btn-primary btn-block">Asignar permiso a rol</button></Link>
        </div>
    </div>
);

export default Sidebar;
