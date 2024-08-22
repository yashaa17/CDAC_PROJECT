import React, { useEffect, useState } from 'react';
import './Header.css';
import { Link } from 'react-router-dom';

const Header = () => {
  const [isLogin,setIsLogin] = useState(false)

  useEffect(()=>{
    setIsLogin(document.cookie?true:false)
  },[isLogin])
  return (
    <header className="header">
      <div className="logo">Book My Driver</div>
      <nav className="nav">
        <ul>
          <li><Link to="/">Home</Link></li>
          <li><Link to="/services">Driver Service</Link></li>
          <li><Link to="/city">City</Link></li>
          <li><Link to="/company">Company</Link></li>
          {/* <li><Link to="/register-driver">Driver-Register</Link></li> */}
         {isLogin?(<li><span onClick={()=>{
          console.log("Logout clicked")
          setIsLogin(false)
          document.cookie = "token" + '=; expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/';
          document.location.reload()
         }}>Logout</span></li>):<li><Link to="/login">Login</Link>/<Link to="/register-user">Register</Link></li>} 
        </ul>
      </nav>
      <div className="contact-buttons">
        <button className="call-us">Call Us - 022434309090</button>
        <button className="download-app">Download Our App</button>
      </div>
    </header>
  );
};

export default Header;
