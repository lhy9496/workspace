package com.kh.spring.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class TestController {
	@RequestMapping("asJson")

	public String inputProc(String data1, String data2) {

	JsonObject obj = new JsonObject();

	obj.addProperty("data1", data1);

	obj.addProperty("data2", data2);

	return new Gson().toJson(obj);

	}
}
