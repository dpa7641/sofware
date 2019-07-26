import React from 'react';
import PropTypes from "prop-types";
import './App.css';
import Sidebar from './components/Sidebar';
import MainContent from './components/MainContent';

class App extends React.Component {
  static propTypes = {
    children: PropTypes.object.isRequired
  };

  render() {
    const { children } = this.props;
    return (
    <div className="App">
        <header className="App-header">
          <p className="header-logo">Teach.me</p>
        </header>
        <div>
          <Sidebar />
          <MainContent body={children}/>
        </div>
      </div>
    );
  }

}

export default App;
