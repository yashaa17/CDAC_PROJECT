package com.bookmydriver.controller;

import com.bookmydriver.dto.ReviewDTO;
import com.bookmydriver.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<ReviewDTO> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{reviewId}")
    public ReviewDTO getReviewById(@PathVariable Long reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    @PostMapping
    public ReviewDTO createReview(@RequestBody ReviewDTO reviewDTO) {
        return reviewService.createReview(reviewDTO);
    }

    @PutMapping("/{reviewId}")
    public ReviewDTO updateReview(@PathVariable Long reviewId, @RequestBody ReviewDTO reviewDTO) {
        return reviewService.updateReview(reviewId, reviewDTO);
    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
}
