import React, { useState } from 'react';
import './Auth.css';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const RegisterForm = ({ fields, role }) => {
  const [formData, setFormData] = useState(
    fields.reduce((acc, field) => {
      acc[field.name] = '';
      return acc;
    }, {})
  );
  const navigate = useNavigate();
  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // if (formData.password !== formData.confirm_password) {
    //   alert("Passwords do not match!");
    //   return;
    // }
    console.log(`Register  with:`, formData);
    
    if(role==="Driver"){
      const url = "http://localhost:8080/v1/drivers"
      const token = document.cookie.split('=')[1]
      console.log("document.cookie ",document.cookie);
      // return;
      axios.post(url, formData, {
        headers: {
          
          Authorization:`Bearer ${token}`,
          'Content-Type':'application/json', // Add the Bearer token to the Authorization header
          
        },
      }).then(resp=>resp.data)
      .then(d=>console.log(d))
    }else{
      const url = "http://localhost:8080/auth/create"
      axios.post(url, formData, {
        headers: {
          'Content-Type':'application/json', // Add the Bearer token to the Authorization header
        },
      }).then(resp=>resp.data)
      .then(d=>{
        console.log(d);
        navigate("/")
      })
    }
    
  };

  return (
    <div className="auth-container">
      <h2>{role} Registration</h2>
      <form onSubmit={handleSubmit}>
        {fields.map((field) => (
          <div className="form-group" key={field.name}>
            <label>{field.label}</label>
            <input
              type={field.type}
              name={field.name}
              value={formData[field.name]}
              onChange={handleChange}
              required={field.required}
            />
          </div>
        ))}
        <button type="submit" className="btn">Register</button>
      </form>
    </div>
  );
};

export default RegisterForm;
