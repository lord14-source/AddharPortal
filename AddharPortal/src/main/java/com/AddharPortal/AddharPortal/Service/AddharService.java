package com.AddharPortal.AddharPortal.Service;


import com.AddharPortal.AddharPortal.Entity.AddharDtls;
import com.AddharPortal.AddharPortal.Entity.AddharRes;

public interface AddharService {
    public String create(AddharDtls addharDtls);
    public AddharRes get(String uuid);
}
