package com.AddharPortal.AddharPortal.Controller;

import com.AddharPortal.AddharPortal.Entity.AddharDtls;
import com.AddharPortal.AddharPortal.Entity.AddharRes;
import com.AddharPortal.AddharPortal.Service.AddharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddharService")

public class AddharController {
    @Autowired
    private AddharService addharService;
    @PostMapping
    public ResponseEntity<String>create(@RequestBody AddharDtls addharDtls){
        System.out.println("fort");
        return ResponseEntity.status(HttpStatus.CREATED).body(addharService.create(addharDtls));

    }

    @GetMapping("/{uuid}")
    public ResponseEntity<AddharRes>get(@PathVariable String uuid){
        return ResponseEntity.status(HttpStatus.OK).body(addharService.get(uuid));
    }
}
