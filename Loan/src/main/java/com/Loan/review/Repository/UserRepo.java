package com.Loan.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Loan.review.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{

}
