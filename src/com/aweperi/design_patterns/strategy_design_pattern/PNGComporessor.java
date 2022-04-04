package com.aweperi.design_patterns.strategy_design_pattern;

public class PNGComporessor implements Compressor {

    @Override
    public void compress(String filename) {
        System.out.println("Compressed using PNG");
    }
}
