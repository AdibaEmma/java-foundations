package com.aweperi.design_patterns.strategy_design_pattern;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public void store(String filename, Compressor compressor, Filter filter) {
        compressor.compress(filename);
        filter.apply(filename);
    }

}
