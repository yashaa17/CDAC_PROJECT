import React, { useState } from 'react';

import './Booking.css';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';

const Booking = () => {
  const [location, setLocation] = useState('');
  const [tripType, setTripType] = useState('');
  const [packageType, setPackageType] = useState('');
  const [startTime, setStartTime] = useState('');
  const [endTime, setEndTime] = useState('');
  const [vehicleName, setVehicleName] = useState('');
    const navigate = useNavigate();
  const handleSubmit = (e) => {
    e.preventDefault();
    console.log({
      location,
      tripType,
      packageType,
      startTime,
      endTime,
      vehicleName,
    });
// "bookingId":10,
//     "userId":4,
//     "driverId":1,
//     "vehicleName":"tata",
//     "startTime":"2024-08-16T18:26:42",
//     "endTime":"2024-08-16T18:26:42",
//     "destination":"USA"
    const data = {
      "destination":location,
      startTime,
      endTime,
      "vehicleName":vehicleName,
    };
    const token = document.cookie.split('=')[1]

    axios.post("http://localhost:8080/v1/bookings/add",data,{
      headers:{
        "Content-Type":"application/json",
        Authorization:`Bearer ${token}`
      }
    })

    navigate("/payment")
    // Handle the booking logic here
  };

  return (
    <div className="container booking-container">
      <div class="row">
      <h1 className="text-center">Book A Driver</h1>
      <form onSubmit={handleSubmit} className="booking-form">
        <div className="form-group">
          <label>User Location:</label>
          <input
            type="text"
            className="form-control"
            value={location}
            onChange={(e) => setLocation(e.target.value)}
            placeholder="Enter your location"
            required
          />
        </div>
        
        <div className="form-group">
          <label>Start Time:</label>
          <input
            type="datetime-local"
            className="form-control"
            value={startTime}
            onChange={(e) => setStartTime(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label>End Time:</label>
          <input
            type="datetime-local"
            className="form-control"
            value={endTime}
            onChange={(e) => setEndTime(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label>Vehicle Name:</label>
          <input
            type="text"
            className="form-control"
            value={vehicleName}
            onChange={(e) => setVehicleName(e.target.value)}
            placeholder="Enter vehicle name"
            required
          />
        </div>
        <button type="submit" className="btn btn-danger btn-block">Book Driver</button>
      </form>

      </div>
    </div>
  );
};

export default Booking;
