package com.bookmydriver.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmydriver.dto.ReviewDTO;
import com.bookmydriver.entity.Review;
import com.bookmydriver.repository.ReviewRepository;
import com.bookmydriver.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<ReviewDTO> getAllReviews() {
        return reviewRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public ReviewDTO getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).map(this::convertToDTO).orElse(null);
    }

    @Override
    public ReviewDTO createReview(ReviewDTO reviewDTO) {
        Review review = convertToEntity(reviewDTO);
        Review savedReview = reviewRepository.save(review);
        return convertToDTO(savedReview);
    }

    @Override
    public ReviewDTO updateReview(Long reviewId, ReviewDTO reviewDTO) {
        Review review = convertToEntity(reviewDTO);
        review.setReviewId(reviewId);
        Review updatedReview = reviewRepository.save(review);
        return convertToDTO(updatedReview);
    }

    @Override
    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    private ReviewDTO convertToDTO(Review review) {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setReviewId(review.getReviewId());
        reviewDTO.setBookingId(review.getBooking().getBookingId());
        reviewDTO.setUserId(review.getUser().getUserId());
        reviewDTO.setDriverId(review.getDriver().getDriverId());
        reviewDTO.setRating(review.getRating());
        reviewDTO.setReviewText(review.getFeedback());
        return reviewDTO;
    }

    private Review convertToEntity(ReviewDTO reviewDTO) {
        Review review = new Review();
        // Set fields from reviewDTO to review entity
        return review;
    }
}
