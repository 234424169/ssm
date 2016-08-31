package com.ssm.service;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chen on 2016/8/26.
 */
public interface UploadService {
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file,HttpServletRequest httpServletRequest);

}
