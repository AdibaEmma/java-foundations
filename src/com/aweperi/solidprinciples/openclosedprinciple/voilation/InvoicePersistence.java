package com.aweperi.solidprinciples.openclosedprinciple.voilation;

import com.aweperi.solidprinciples.singleresponsibilityprinciple.violation.Invoice;

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        // Saves the invoice to database
    }
}

// save to database method modifies the class, hence it violates the open-close principle
