package com.williams.kailyn.spring.security.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HealthCheckResource {

    @RequestMapping(value="/healthcheck", method= RequestMethod.GET)
    public ResponseEntity<Object> healthCheck(){
        return ResponseEntity.status(HttpStatus.OK).body("this is ok");
    }
}
