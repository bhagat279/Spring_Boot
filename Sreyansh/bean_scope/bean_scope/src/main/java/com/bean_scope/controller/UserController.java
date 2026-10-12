package com.bean_scope.controller;

import com.bean_scope.entity.Order;
import com.bean_scope.entity.UserForm;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private ObjectFactory<UserForm> formFactory;  // ✅ factory jo har baar naya degi

    @PostMapping("/set")
    public String setValues(@RequestParam String name, @RequestParam String email) {
        UserForm form = formFactory.getObject(); // ✅ fresh instance
        form.setName(name);
        form.setEmail(email);
        return "✅ Values set: " + name + ", " + email + ", " + form;
    }

    @GetMapping("/get")
    public String getValues() {
        UserForm form = formFactory.getObject(); // ✅ new instance again
        return "📌 Current values: name=" + form.getName() + ", email=" + form.getEmail() + ", " + form;
    }
}

