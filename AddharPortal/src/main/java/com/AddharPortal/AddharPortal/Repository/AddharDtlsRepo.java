package com.AddharPortal.AddharPortal.Repository;

import com.AddharPortal.AddharPortal.Entity.AddharDtls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddharDtlsRepo extends JpaRepository<AddharDtls,String> {
    AddharDtls findByuuid(String uuid);
}
