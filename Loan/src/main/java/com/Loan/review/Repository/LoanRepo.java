package com.Loan.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Loan.review.Model.LoanModel;
@Repository
public interface LoanRepo extends JpaRepository<LoanModel, Integer> {

}
