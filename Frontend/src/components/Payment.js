import React, { useState } from 'react';

import './Payment.css';
import { useNavigate } from 'react-router-dom';

const Payment = () => {
  const [creditCardNo, setCreditCardNo] = useState('');
  //const [, setTripType] = useState('');
  //const [packageType, setPackageType] = useState('');
  const [expirationDate, setExpirationDate] = useState('');
 const [cvv, setCvv] = useState('');
  const [name, setName] = useState('');
    const navigate = useNavigate();
  const handleSubmit = (e) => {
    e.preventDefault();

    console.log({
      creditCardNo,
      expirationDate,
      cvv,
      name,
      
    });
    navigate("/");
    // Handle the booking logic here
  };

  return (
    <div className="container booking-container">
      <div class="row">
      <h1 className="text-center">Make a Payment</h1>
      <form onSubmit={handleSubmit} className="booking-form">
        <div className="form-group">
          <label>Credit Card No:</label>
          <input
            type="text"
            className="form-control"
            value={creditCardNo}
            onChange={(e) => setCreditCardNo(e.target.value)}
            placeholder="Enter your Credit Card No"
            required
          />
        </div>
        
       
        <div className="form-group">
          <label>Expiration Date:</label>
          <input
            type="datetime-local"
            className="form-control"
            value={expirationDate}
            onChange={(e) => setExpirationDate(e.target.value)}
            required
          />
        </div>
       
        <div className="form-group">
          <label>Code cvv:</label>
          <input
            type="text"
            className="form-control"
            value={cvv}
            onChange={(e) => setCvv(e.target.value)}
            placeholder="Enter cvv"
            required
          />
        </div>
        <button type="submit" className="btn btn-danger btn-block">Make Payment</button>
      </form>

      </div>
    </div>
  );
};

export default Payment;
