package com.vim.rnd.webapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequestMapping("/web")
@RestController
public class WebAppController {

    @RequestMapping("/list")
    public ResponseEntity<WebResponse> getWebResponse(@PathVariable String identity) {

        return new ResponseEntity(
                WebResponse.builder()
                        .identity(identity)
                        .webList(Arrays.asList("A","B","C","D","E"))
                        .build()
                , HttpStatus.OK);
    }
}