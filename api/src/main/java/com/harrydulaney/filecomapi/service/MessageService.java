package com.harrydulaney.filecomapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("MessageService")
public class MessageService {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    private final String M_DISPLAY_NAME = "d_name";
    private final String M_ADMIN_INFO = "adm_info";
    private final String M_USER_HISTORY = "usr_his";

    public Map<String, String> getMessage(List<String> keys) {
        Map<String, String> messageMap = new HashMap<>();
        for (String key : keys) {
            switch (key) {
                case M_DISPLAY_NAME:
                    break;
                case M_ADMIN_INFO:
                    break;
                case M_USER_HISTORY:
                    break;
            }
        }
        return messageMap;
    }


}
