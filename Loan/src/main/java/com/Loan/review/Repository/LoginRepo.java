package com.Loan.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Loan.review.Model.LoginModel;
@Repository
public interface LoginRepo extends JpaRepository<LoginModel, Integer>{

}
