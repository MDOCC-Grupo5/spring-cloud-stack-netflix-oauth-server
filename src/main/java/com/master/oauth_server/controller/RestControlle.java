package com.master.oauth_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControlle {

  @RequestMapping("/algo")
  public ResponseEntity<String> responseEntity() {
    return ResponseEntity.ok("jeje");
  }

}
