import React from "react";
import './Sidebar.css';

const Sidebar = () => {

    return(
        <div className="sidebar">
                <a href="" className=" btn-primary btn-block">LISTA DE USUARIOS</a>
                <a href="" className=" btn-primary btn-block">REGITRO DE USUARIOS</a>
                <a href="" className=" btn-primary btn-block">REGISTRO DE ROL</a>
                <a href="" className=" btn-primary btn-block">REGISTRO PERMISO</a>
                <a href="" className=" btn-primary btn-block">ASIGNAR PERMISO</a>
                <a href="roles.html" className=" btn-primary btn-block">ASIGNAR ROL</a>
        </div>
    );


}

export default Sidebar;
