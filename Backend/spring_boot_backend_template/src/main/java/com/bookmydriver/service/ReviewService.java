package com.bookmydriver.service;

import java.util.List;

import com.bookmydriver.dto.ReviewDTO;

public interface ReviewService {
    List<ReviewDTO> getAllReviews();
    ReviewDTO getReviewById(Long reviewId);
    ReviewDTO createReview(ReviewDTO reviewDTO);
    ReviewDTO updateReview(Long reviewId, ReviewDTO reviewDTO);
    void deleteReview(Long reviewId);
}
