package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentInvoice;

import java.util.List;

public class FreeAgentInvoiceWrapper {

    @Expose
    private FreeAgentInvoice invoice;

    @Expose
    private List<FreeAgentInvoice> invoices;


    public FreeAgentInvoiceWrapper() {
        super();
    }

    public FreeAgentInvoiceWrapper(FreeAgentInvoice invoice) {
        super();
        this.invoice = invoice;
    }

    public FreeAgentInvoiceWrapper(List<FreeAgentInvoice> invoices) {
        super();
        this.invoices = invoices;
    }

    public boolean hasInvoice() {
        return invoice != null;
    }

    public FreeAgentInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(FreeAgentInvoice invoice) {
        this.invoice = invoice;
    }

    public boolean hasInvoices() {
        return invoices != null;
    }

    public List<FreeAgentInvoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<FreeAgentInvoice> invoices) {
        this.invoices = invoices;
    }
}
