package com.example.helloworld.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("Default Name")
    private String defaultName;

//    @Value("${app.host}")
//    private String host;
//
//    @Value("${app.email}")
//    public String email;
//
//    @Value("${app.password}")
//    public String password;

    @Value("${java.home}")
    private String javaHome;

    @Value("${HOME}")
    private String homeDir;


    public String getDefaultName() {
        return defaultName;
    }

//    public String getHost() {
//        return host;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getHomeDir() {
        return homeDir;
    }
}
