package com.aweperi.design_patterns.strategy_design_pattern;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new JPEGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("cat");

    }

}
