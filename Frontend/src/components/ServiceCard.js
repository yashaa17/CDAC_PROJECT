import React from 'react';
import './ServiceCard.css';

const ServiceCard = ({ title }) => {
  return (
    <div className="service-card">
      {title}
    </div>
  );
};

export default ServiceCard;
