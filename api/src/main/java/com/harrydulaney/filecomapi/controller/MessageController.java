package com.harrydulaney.filecomapi.controller;

import com.harrydulaney.filecomapi.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/public")
public class MessageController {

    private final MessageService messageService;

    public MessageController(final MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/greeting")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("content", "Welcome Back!");
        return model;
    }


    @GetMapping("message/{keys}")
    public Map<String, String> home(@PathVariable List<String> keys) {
        Map<String, String> model = messageService.getMessage(keys);
        model.put("content", "Welcome Back!");
        return model;
    }

//
//  private UserPreferences user;
//  private FileService fileService;
//
//  /***************************************************************
//   * Autowire Beans
//   ***************************************************************/
//  @Autowired
//  void setUser(UserPreferences user) {
//    this.user = user;
//  }
//
//
//  @Autowired
//  private void setFileService(FileService fileService) {
//    this.fileService = fileService;
//  }

}
