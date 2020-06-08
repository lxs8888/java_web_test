package com.lxs.eduservice.controller;


import com.lxs.eduservice.entity.EduTeacher;
import com.lxs.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * 讲师 前端控制器
 *
 * @author testjava
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @GetMapping(value = "/list")
    public List<EduTeacher> queryAll() {
        return eduTeacherService.list(null);
    }

    @DeleteMapping(value = "{id}")
    public boolean deleteTeacher(@PathVariable String id) {
        return eduTeacherService.removeById(id);
    }

}

