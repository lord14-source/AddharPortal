package com.AddharPortal.AddharPortal.External;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="otp-service",url="${otp-service.url}")
public interface OtpService {

    @GetMapping("/{uuid}")
   public  String getOtp(@PathVariable String uuid);


}
