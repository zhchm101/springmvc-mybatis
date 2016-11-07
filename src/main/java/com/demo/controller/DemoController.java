package com.demo.controller;

import com.demo.domain.UsrInfo;
import com.demo.service.UsrInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class DemoController {

    @Resource
    private UsrInfoService usrInfoService;

    @RequestMapping(value = "/usrInfoList.do")
    public ModelAndView usrInfoList(HttpServletRequest request, Model model) {
        List<UsrInfo> usrInfoList = usrInfoService.findAll();
        System.out.println("Size:" + usrInfoList.size());
        model.addAttribute("usrInfoList", usrInfoList);
        model.addAttribute("test", "测试");
        request.setAttribute("test1", "测试1");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("test2", "测试2");
        return new ModelAndView("usrInfoList", map);
    }
}
