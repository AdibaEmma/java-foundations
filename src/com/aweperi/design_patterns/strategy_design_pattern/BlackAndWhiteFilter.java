package com.aweperi.design_patterns.strategy_design_pattern;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Applying B&W Filter");
    }
}
