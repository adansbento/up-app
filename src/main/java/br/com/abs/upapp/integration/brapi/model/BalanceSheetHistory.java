package br.com.abs.upapp.integration.brapi.model;

import java.util.List;

public class BalanceSheetHistory{
    private List<BalanceSheetStatement> balanceSheetStatements;

    public List<BalanceSheetStatement> getBalanceSheetStatements() {
        return balanceSheetStatements;
    }

    public void setBalanceSheetStatements(List<BalanceSheetStatement> balanceSheetStatements) {
        this.balanceSheetStatements = balanceSheetStatements;
    }
}
