package com.aweperi.design_patterns.strategy_design_pattern;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String filename) {
        compressor.compress(filename);
        filter.apply(filename);
    }

    public Compressor getCompressor() {
        return compressor;
    }

    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
