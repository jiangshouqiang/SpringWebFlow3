package com.gr.jiang.project.controller;

import com.gr.jiang.project.dto.ResponeDto;
import com.gr.jiang.project.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.portlet.ModelAndView;

import java.io.File;
import java.io.IOException;


/**
 * Created by jiang on 15/12/19.
 */
@RestController
public class TestController {
    @Autowired
    protected ContentService contentService;
    @RequestMapping("/greeting")
    public ResponeDto getTest(String str){
        ResponeDto dto = new ResponeDto();
        dto.setId(contentService.queryRownum()+"");
        dto.setName("jiang");
        System.out.println(dto.getId());
        return dto;
    }
    @RequestMapping({"/"})
    public String homePage(
            @RequestParam("spitter") String usrname, Model model
    ){
        return usrname;
    }
    @RequestMapping("/filePage")
    public ModelAndView FilePage(){
        ModelAndView view = new ModelAndView();
        view.setViewName("/h5/index.jsp");
        return view;
    }
}
