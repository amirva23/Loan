package com.Loan.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Loan.review.Model.AdminModel;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Integer>{

}
