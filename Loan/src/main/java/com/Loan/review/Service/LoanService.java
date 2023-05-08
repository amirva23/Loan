package com.Loan.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Loan.review.Model.AdminModel;
import com.Loan.review.Model.LoanModel;
import com.Loan.review.Model.LoginModel;
import com.Loan.review.Model.UserModel;
import com.Loan.review.Repository.AdminRepo;
import com.Loan.review.Repository.LoanRepo;
import com.Loan.review.Repository.LoginRepo;
import com.Loan.review.Repository.UserRepo;

@Service
public class LoanService {
	@Autowired
    public AdminRepo arepo;
	@Autowired
     public LoanRepo loanrepo;
	@Autowired
     public LoginRepo lrepo;
	@Autowired
     public UserRepo urepo;
     
    //AdminModel
     public AdminModel post1(AdminModel amodel)
     {
    	 return arepo.save(amodel);
     }
     
     public List<AdminModel> get1()
     {
    	 return arepo.findAll();
     }
     
     public AdminModel put1(AdminModel amodel1)
     {
    	 return arepo.saveAndFlush(amodel1);
     }
     
     public void delete1(int admin_id)
     {
    	 arepo.deleteById(admin_id);
     }
     
     //LoanApplicationModel
     public LoanModel post2(LoanModel amodel2)
     {
    	 return loanrepo.save(amodel2);
     }
     
     public List<LoanModel> get2()
     {
    	 return loanrepo.findAll();
     }
     
     public LoanModel put2(LoanModel amodel3)
     {
    	 return loanrepo.saveAndFlush(amodel3);
     }
     
     public void delete2(int loanid)
     {
    	 loanrepo.deleteById(loanid);
     }
     
     //LoginModel
     public LoginModel post3(LoginModel amodel4)
     {
    	 return lrepo.save(amodel4);
     }
     
     public List<LoginModel> get3()
     {
    	 return lrepo.findAll();
     }
     
     public LoginModel put3(LoginModel amodel5)
     {
    	 return lrepo.saveAndFlush(amodel5);
     }
     
     public void delete3(int login_id)
     {
    	 lrepo.deleteById(login_id);
     }
     
     //UserModel
     
     public UserModel post4(UserModel amodel6)
     {
    	 return urepo.save(amodel6);
     }
     
     public List<UserModel> get4()
     {
    	 return urepo.findAll();
     }
     
     public UserModel put4(UserModel amodel7)
     {
    	 return urepo.saveAndFlush(amodel7);
     }
     
     public void delete4(int id)
     {
    	 urepo.deleteById(id);
     }
}
