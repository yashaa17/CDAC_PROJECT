/*import React from 'react';
import './App.css';
import Header from './components/Header';
import MainContent from './components/MainContent';
import { Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import Register from './components/Register';


function App() {
  return (
    <div className="App">
      <Header />
      <Routes>
        <Route path="/" element={<MainContent />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
      </Routes>
    </div>
  );
}*/

//export default App;

import React from 'react';
import './App.css';
import Header from './components/Header';
import MainContent from './components/MainContent';
import { Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import DriverRegister from './components/DriverRegister';
import UserRegister from './components/UserRegister';
import Booking from './components/Booking';
import Payment from './components/Payment';
import Review from './components/Review';

function App() {
  return (
    <div className="App">
      <Header />
      <Routes>
        <Route path="/" element={<MainContent />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register-driver" element={<DriverRegister />} />
        <Route path="/register-user" element={<UserRegister />} />
        <Route path="/booking" element={<Booking />} />
        <Route path="/payment" element={<Payment />} />
        <Route path="/review" element={<Review />} />
        
      </Routes>
    </div>
  );
}

export default App;

