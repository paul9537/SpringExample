package com.paul9537.ex.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.paul9537.ex.lesson03.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(@Param("id") int id);
	
	public int insertReviewByObject(Review review);
	
	public int insertReviewByField(
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") double point,
			@Param("review") String review);
	
}
