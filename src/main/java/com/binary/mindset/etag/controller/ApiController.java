package com.binary.mindset.etag.controller;

import com.binary.mindset.etag.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ResponseBody
    public Response ping() {
        return new Response("pong");
    }

}
