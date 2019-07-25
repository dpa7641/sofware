import React from 'react';
import './App.css';
import Sidebar from './components/Sidebar';
import MainContent from './components/MainContent';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <p className="header-logo">Teach.me</p>
      </header>
      <div>
        <Sidebar />
        <MainContent />
      </div>
    </div>
  );
}

export default App;
