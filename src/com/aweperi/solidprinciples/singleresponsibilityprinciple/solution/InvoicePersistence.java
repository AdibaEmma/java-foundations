package com.aweperi.solidprinciples.singleresponsibilityprinciple.solution;

import com.aweperi.solidprinciples.singleresponsibilityprinciple.violation.Invoice;

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}
