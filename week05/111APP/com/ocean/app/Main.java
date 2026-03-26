package com.ocean.app;

import com.ocean.model.Ship;          // 匯入單一類別

public class Main {
    public static void main(String[] args) {
        Ship s = new Ship("test");  // 因為有 import，可以直接用
    }
}