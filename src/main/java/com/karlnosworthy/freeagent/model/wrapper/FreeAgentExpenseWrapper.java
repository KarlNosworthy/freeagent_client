package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentExpense;
import com.karlnosworthy.freeagent.model.FreeAgentInvoice;

import java.util.List;

/**
 * Created by karl on 15/07/2016.
 */
public class FreeAgentExpenseWrapper {

    @Expose
    private FreeAgentExpense expense;

    @Expose
    private List<FreeAgentExpense> expenses;


    public FreeAgentExpenseWrapper() {
        super();
    }

    public FreeAgentExpenseWrapper(FreeAgentExpense expense) {
        super();
        this.expense = expense;
    }

    public FreeAgentExpenseWrapper(List<FreeAgentExpense> expenses) {
        super();
        this.expenses = expenses;
    }

    public boolean hasExpense() {
        return expense != null;
    }

    public FreeAgentExpense getExpense() {
        return expense;
    }

    public void setExpense(FreeAgentExpense expense) {
        this.expense = expense;
    }

    public boolean hasExpenses() {
        return expenses != null;
    }

    public List<FreeAgentExpense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<FreeAgentExpense> expenses) {
        this.expenses = expenses;
    }
}
