import React from 'react';
import RegisterForm from './RegisterForm';

const DriverRegister = () => {
  const fields = [
    { name: 'driverName', label: 'Driver Name', type: 'text', required: true },
    { name: 'email', label: 'Email', type: 'email', required: true },
    { name: 'phoneNo', label: 'Phone Number', type: 'tel', required: true },
    { name: 'rating', label: 'Rating', type: 'number', required: true },
    { name: 'password', label: 'Password', type: 'password', required: true },
    { name: 'confirm_password', label: 'Confirm Password', type: 'password', required: true },
  ];

  return <RegisterForm fields={fields} role="Driver" />;
};

export default DriverRegister;
