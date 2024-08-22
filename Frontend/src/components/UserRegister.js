import React from 'react';
import RegisterForm from './RegisterForm';

const UserRegister = () => {
  const fields = [
    { name: 'userName', label: 'Username', type: 'text', required: true },
    { name: 'emailId', label: 'Email', type: 'email', required: true },
    { name: 'phoneNo', label: 'Phone Number', type: 'tel', required: true },
    { name: 'password', label: 'Password', type: 'password', required: true },
    // { name: 'confirm_password', label: 'Confirm Password', type: 'password', required: true },
  ];

  return <RegisterForm fields={fields} role="User" />;
};

export default UserRegister;
