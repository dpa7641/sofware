import React from "react";
import { Route, Switch} from "react-router-dom";

import App from "./App";
import Usuarios from "./components/Usuarios";
import Roles from "./components/Roles";
import Permisos from "./components/Permisos";

const AppRoutes = () => (
  <App>
    <Switch>
      <Route path="/usuarios" component={Usuarios} />
      <Route path="/roles" component={Roles} />
      <Route path="/permisos" component={Permisos} />
    </Switch>
  </App>
);

export default AppRoutes;

