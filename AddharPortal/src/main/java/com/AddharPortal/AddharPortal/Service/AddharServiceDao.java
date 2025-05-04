package com.AddharPortal.AddharPortal.Service;

import com.AddharPortal.AddharPortal.Entity.AddharDtls;
import com.AddharPortal.AddharPortal.Entity.AddharRes;
import com.AddharPortal.AddharPortal.External.OTP;
import com.AddharPortal.AddharPortal.External.OtpService;
import com.AddharPortal.AddharPortal.Repository.AddharDtlsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AddharServiceDao implements AddharService {
    @Autowired
    private AddharDtlsRepo addharDtlsRepo;
    @Autowired
    private OtpService otpService;
    public AddharServiceDao(AddharDtlsRepo addharDtlsRepo){

        this.addharDtlsRepo=addharDtlsRepo;
    }
    @Override
    public String create(AddharDtls addharDtls) {
        System.out.println("Here");
          String ref= UUID.randomUUID().toString();
          addharDtls.setRefNo(ref);

          addharDtlsRepo.save(addharDtls);
          return "Success";


    }

    @Override
    public AddharRes get(String uuid) {
       AddharRes addharRes=new AddharRes();
       AddharDtls addharDtls=addharDtlsRepo.findByuuid(uuid);
       addharRes.setAddharData(addharDtls.getAddharData());
       addharRes.setUuid(uuid);

       String otp=otpService.getOtp(uuid);
       System.out.println(otp+"this is the otp");
       addharRes.setOtp(otp);

        return addharRes;
    }
}
