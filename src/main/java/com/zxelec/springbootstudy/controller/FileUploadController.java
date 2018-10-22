package com.zxelec.springbootstudy.controller;

import com.zxelec.springbootstudy.domain.ResultDate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


@RestController
public class FileUploadController {

    @RequestMapping("upload")
    public Object fileUpload(@RequestParam(value = "head_img") MultipartFile file, HttpServletRequest request) {

        //获取文件的全名
        String originalFilename = file.getOriginalFilename();

        int index = originalFilename.lastIndexOf(".");

        String suffix = originalFilename.substring(index);

        String newFileName = UUID.randomUUID().toString().substring(0, 5).replace("-", "") + suffix;

        File newFile = new File("D://file/test/" + newFileName);

        try {
            file.transferTo(newFile);
            return new ResultDate(0, "", newFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
            return new ResultDate(-1, "", e.getMessage());
        }
    }
}
