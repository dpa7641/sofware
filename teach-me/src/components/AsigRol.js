import React, { Component } from 'react';
import axios from 'axios';


class AsigRol extends Component {
	render() {
		return(
			<div className="col-md-12">
                <h1>Registro de usuario</h1>
			<div class="row">
  				<div class="col-md-4">
  					<label>Usuario</label>
  				</div>
  				<div class="col-md-4">
  					<label>rol</label>
  				</div>
  				<div class="col-md-4">
  					<div class="btn-group" role="group" aria-label="...">
  						<button type="button" class="btn btn-default">Leer</button>
  						<button type="button" class="btn btn-default">Escrivir</button>
  						<button type="button" class="btn btn-default">Ambos</button>
					   </div>
  				</div>
			</div>
           </div>
        );
    }
}



export default AsigRol;