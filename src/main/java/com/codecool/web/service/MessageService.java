package com.codecool.web.service;

import com.codecool.web.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private List<Message> datas = new ArrayList<>();

    public List<Message> getData() {
        return datas;
    }
}
