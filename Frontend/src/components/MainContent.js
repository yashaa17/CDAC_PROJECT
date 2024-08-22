/*import React from 'react';
import './MainContent.css';
import ServiceCard from './ServiceCard';
import car_image from '../images/car_image.jpg'

const MainContent = () => {
  return (
    <main className="main-content">
      <section className="promo">
        <div className="text-content">
          <h2>Few Clicks Away to Book a</h2>
          <h1>Experienced Driver</h1>
        </div>
        <div className="car-image">
          <img src={car_image} alt="Car" />
        </div>
      </section>

      <section className="services">
        <ServiceCard title="Local" />
        <ServiceCard title="Outstation" />
        <ServiceCard title="Outstation Drop" />
        <ServiceCard title="Permanent" />
      </section>
    </main>
  );
};

export default MainContent;*/

  

import React from 'react';
import './MainContent.css';
import ServiceCard from './ServiceCard';
import car_image from '../images/car_image.jpg';
import  newbgimg   from '../images/newbgimg.jpg.jpg';

const MainContent = () => {
  return (
    <main className="main-content">
      <section className="promo">
        <div className="text-content">
          <h2>Few Clicks Away to Book a</h2>
          <h1>Professional Driver</h1>
        </div>
        <div className="car-image">
        <img src={car_image} alt="Car" />
        </div>
      </section>

      <section className="services">
        <ServiceCard title="Local" />
        <ServiceCard title="Outstation" />
        <ServiceCard title="Outstation Drop" />
        <ServiceCard title="Permanent" />
      </section>
    </main>
  );
};

export default MainContent;
