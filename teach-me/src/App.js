import React from 'react';
import './App.css';
import Sidebar from './components/Sidebar';
import MainContent from './components/MainContent';

function App() {


  return (
    <div className="App">
      <header className="App-header">
        <p className="header-logo m-3">Teach.me</p>

      </header>
      <div>
          <div className="row mt-3">
              <div className="col-md-3">
                  <Sidebar/>
              </div>
              <div className="col-md-9">
                  <MainContent />
              </div>
          </div>


      </div>
    </div>
  );
}

export default App;
