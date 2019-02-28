package com.vim.rnd.webapp.controller;

import lombok.Builder;

import java.util.List;

@Builder
public class WebResponse {
    String identity;
    List<String> webList;
}