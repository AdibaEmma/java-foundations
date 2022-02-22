package com.aweperi.solidprinciples.openclosedprinciple.solution;

import com.aweperi.solidprinciples.singleresponsibilityprinciple.solution.Invoice;

interface InvoicePersistence {
    public void save(Invoice invoice);
}
