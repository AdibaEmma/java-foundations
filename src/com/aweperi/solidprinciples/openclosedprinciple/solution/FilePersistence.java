package com.aweperi.solidprinciples.openclosedprinciple.solution;

import com.aweperi.solidprinciples.singleresponsibilityprinciple.solution.Invoice;

public class FilePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}
