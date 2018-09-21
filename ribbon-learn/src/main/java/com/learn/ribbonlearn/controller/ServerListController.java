package com.learn.ribbonlearn.controller;

import com.learn.ribbonlearn.service.ServerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author :lwy
 * @Date : 2018/9/21 10:43
 * @Description :
 */
@RestController
public class ServerListController {

    @Autowired
    private ServerListService serverListService;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/all")
    public String getAllList() {
        return serverListService.getAllServerList();
    }

    @GetMapping("/one")
    public String getone() {
        return restTemplate.getForObject("http://localhost:8080/one1",String.class);
    }

    @GetMapping("/one1")
    public String getone1() {
        return serverListService.getOneServer();
    }
}
