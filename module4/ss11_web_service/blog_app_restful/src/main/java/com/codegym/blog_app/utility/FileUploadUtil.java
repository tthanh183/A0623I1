package com.codegym.blog_app.utility;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUploadUtil {
    private static final String UPLOAD_DIRECTORY = "src/main/resources/static/blog";
    public static String uploadFile(MultipartFile multipartFile) {
        String fileName = multipartFile.getOriginalFilename();
        String filePath = UPLOAD_DIRECTORY + File.separator + fileName;
        try {
            FileCopyUtils.copy(multipartFile.getBytes(), new File(filePath));
        }catch (IOException e) {
            e.printStackTrace();
        }
        return "/blog/" + fileName;
    }
}
