import React,{Component} from 'react';
import axios from 'axios';

class FormRol extends Component{
    constructor(props){
        super(props);
        this.state= {
            descripcionRol:""
        }
    }

    handleChange = (event) => {
        this.setState({[event.target.name]:event.target.value})
    }

    handleSubmit = (event) => {
        event.preventDefault();

        console.log(this.state)

        axios.post('http://localhost:8090/roles',this.state)
            .then(response =>{console.log(response)
            })
            .catch(error => {
                console.log(error)
            })

    }


    render(){
        return(

            <div className="col-md-9">
                <h1>Registro de usuario</h1>
                <form onSubmit={this.handleSubmit}>
                    <div className="form-group">
                        <label htmlFor="exampleInputEmail1">Nombre</label>
                        <input name="descripcionRol" onChange={this.handleChange} className="form-control"id="exampleInputEmail1" placeholder="Descripcion..." required/>
                    </div>
                    <button type="submit" className="mt-4 btn btn-success">CREAR</button>
                </form>
            </div>
        );
    }

}

export default FormRol;