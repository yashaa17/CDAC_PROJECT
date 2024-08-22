import React, { useState } from 'react';

const Review = () => {
  const [rating, setRating] = useState(0);
  const [feedback, setFeedback] = useState('');

  const submitReview = () => {
    // Send review to backend
    alert('Thank you for your feedback!');
  };

  return (
    <div>
      <h3>Review Form</h3>
      <label>
        Rating:
        <select value={rating} onChange={(e) => setRating(e.target.value)}>
          <option value="1">1 - Poor</option>
          <option value="2">2 - Fair</option>
          <option value="3">3 - Good</option>
          <option value="4">4 - Very Good</option>
          <option value="5">5 - Excellent</option>
        </select>
      </label>
      <label>
        Feedback:
        <textarea value={feedback} onChange={(e) => setFeedback(e.target.value)} />
      </label>
      <button onClick={submitReview}>Submit Review</button>
    </div>
  );
};

export default Review;

/*import React, { useState } from 'react';

import './Review.css';
import { useNavigate } from 'react-router-dom';

const review = () => {
  const [rating, setRating] = useState('');
  const [feedback, setFeedback] = useState('');
 
    //const navigate = useNavigate();
  const handleSubmit = (e) => {
    e.preventDefault();

    console.log({
      rating,
      feedback  
    });
    //navigate("/");
    // Handle the booking logic here
  };

  return (
    <div className="container booking-container">
      <div class="row">
      <h1 className="text-center">Give a Rating</h1>
      <form onSubmit={handleSubmit} className="review-form">
        <div className="form-group">
          <label>Rating:</label>
          <input
            type="text"
            className="form-control"
            value={rating}
            onChange={(e) => setRating(e.target.value)}
            placeholder="Enter Rating"
            required
          />
          </div>
        
       
        <div className="form-group">
          <label>Feedback:</label>
          <input
            type="text"
            className="form-control"
            value={feedback}
            onChange={(e) => setFeedback(e.target.value)}
            placeholder="Enter Feedback Text"
            required
          />
        </div>
       
        <button type="submit" className="btn btn-danger btn-block">Submit Feedback</button>
      </form>

      </div>
    </div>
  );
};

export default Review;*/


