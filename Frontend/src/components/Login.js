import React, { useState } from 'react';
import './Auth.css';
import { Link, useNavigate } from 'react-router-dom';
import axios from 'axios';
import { TOKEN_EXPIRY_day } from '../Constants';

const Login = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const handleLogin = (e) => {
    e.preventDefault();
    console.log('Login with:', { email, password });
    axios.post('http://localhost:8080/auth/login',{ email, password },{
      'headers':{
        'Access-Control-Allow-Origin':'*',
        "Content-Type":'application/json'
      }
    }).then(resp=>resp.data).then(d=>{
      console.log(d);
      const date = new Date();
      date.setTime(date.getTime() + (TOKEN_EXPIRY_day * 24 * 60 * 60 * 1000)); // Set expiration date
      const expires = "expires=" + date.toUTCString();
      console.log(`token=${d?.token}; ${expires};`
      )
      document.cookie = `token=${d?.token}; expires=${expires};`;
      console.log("document.cookie ",document.cookie)
      document.location.href = "http://localhost:3000/booking";
    }).catch(err=>console.log(err))
  };

  return (
    <div className="auth-container">
      <h2>Login</h2>
      <form onSubmit={handleLogin}>
        <div className="form-group">
          <label>Email</label>
          <input
            type="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label>Password</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        <button type="submit" className="btn">Login</button>
      </form>
      <p>
        Don't have an account? <Link to="/register-user">Register User here</Link> / 
        <Link to="/register-driver">Register Driver here</Link>
      </p>
    </div>
  );
};

export default Login;
