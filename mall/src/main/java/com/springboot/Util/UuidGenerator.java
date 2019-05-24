package com.springboot.Util;

import java.util.UUID;

public class UuidGenerator {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","").toLowerCase();
    }
}
