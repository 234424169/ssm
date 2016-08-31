package com.ssm.controller;

import com.ssm.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chen on 2016/8/26.
 */
@Controller
@RequestMapping("upload")
public class UploadController {
    @Autowired
    UploadService uploadService;

    @RequestMapping(value="uploadFile",method = RequestMethod.GET)
    public ModelAndView UploadFile(){
        ModelAndView modelAndView=new ModelAndView();
        //uploadService.upload();
        modelAndView.setViewName("upload/upload");
        return modelAndView;
    }

    @RequestMapping(value="upload.do",method=RequestMethod.POST)
    public ModelAndView DoUpload(MultipartFile file, HttpServletRequest httpServletRequest){
        ModelAndView modelAndView=new ModelAndView();
        uploadService.upload(file,httpServletRequest);
        modelAndView.setViewName("upload/result");
        return modelAndView;
    }
}
