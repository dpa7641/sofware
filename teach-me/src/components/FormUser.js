import React,{Component} from 'react';
import axios from 'axios';

class FormUser extends Component{
    constructor(props){
        super(props);
        this.state= {
            roles:[],
            nombre: '',
            apPaterno: '',
            apMaterno: '',
            ci: '',
            email: '',
            usuario:'',
            contrasenia: '',
            vcontrasenia: '',
            rol: ''
        }
    }

    componentDidMount(){
        
        fetch('http://localhost:8090/roles')
            .then(res => res.json())
            .then(json => {
                this.setState({roles: json})
            });
    }

    handleChange = (event) => {
        this.setState({[event.target.name]:event.target.value})
    }

    handleSubmit = (event) => {
        event.preventDefault();

        console.log(this.state)

        axios.post('http://localhost:8090/usuarios',this.state)
            .then(response =>{console.log(response)
            })
            .catch(error => {
                console.log(error)
            })

    }


    render(){
        const rolList = this.state.roles.map((rol, index) =>
            <option value={rol.idRol} key={index}>{rol.descripcionRol}</option>
        );

        return(

            <div className="col-md-9">
                <h1>Registro de usuario</h1>
                <form onSubmit={this.handleSubmit}>
                    <div className="form-group">
                        <label htmlFor="exampleInputEmail1">Nombre</label>
                        <input name="nombre" onChange={this.handleChange} className="form-control"id="exampleInputEmail1" placeholder="Nombre..." required/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="exampleInputEmail1">Apellido Paterno</label>
                        <input name="apPaterno" onChange={this.handleChange} type="text" className="form-control" id="exampleInputEmail1" placeholder="Apellido Paterno..." required/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="exampleInputEmail1">Apellido Materno</label>
                        <input name="apMaterno" onChange={this.handleChange} type="text" className="form-control" id="exampleInputEmail1" placeholder="Apellido Materno..." required/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="exampleInputEmail1">Cedula Identidad</label>
                        <input name="ci" onChange={this.handleChange} type="text" className="form-control" id="exampleInputEmail1" placeholder="Cedula Identidad..." required/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="exampleInputEmail1">usuario</label>
                        <input name="usuario" onChange={this.handleChange} type="text" className="form-control" id="exampleInputEmail1" placeholder="usuario..." required/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="exampleInputEmail1">Email</label>
                        <input name="email" onChange={this.handleChange} type="email" className="form-control" id="exampleInputEmail1" placeholder="Email..." required/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="exampleInputPassword1">Contraseña</label>
                        <input name="contrasenia" onChange={this.handleChange} type="password" className="form-control" id="exampleInputPassword1" placeholder="Password" required/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="exampleInputPassword1">Repita Contraseña</label>
                        <input name="vcontrasenia" onChange={this.handleChange} type="password" className="form-control" id="exampleInputPassword1" placeholder="Password"/>
                    </div>
                    <div className="form-group">
                        <label>Seleccione Rol</label>
                        <select name="rol" onClick={this.handleChange} onChange={this.handleChange} className="form-control">
                            {rolList}
                        </select>
                    </div>
                    <button type="submit" className="mt-4 btn btn-success">CREAR</button>
                </form>
            </div>
        );
    }

}

export default FormUser;