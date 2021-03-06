package com.cts.corda.etf.contract;

import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import net.corda.core.contracts.TypeOnlyCommandData;
import net.corda.core.transactions.LedgerTransaction;

public class EtfIssueContract implements Contract {

    public static final String SELF_ISSUE_ETF_CONTRACT_ID = "com.cts.bfs.etf.corda.contract.EtfIssueContract";

    @Override
    public void verify(LedgerTransaction tx) {
        System.out.println("Inside contract. inputs " + tx.getInputs());
        System.out.println("Inside contract. outputs " + tx.getOutputs());
    }

    public interface Commands extends CommandData {

        class SelfIssueEtf extends TypeOnlyCommandData implements com.cts.corda.etf.contract.EtfIssueContract.Commands {

        }

        class EtfBuyCommand extends TypeOnlyCommandData implements com.cts.corda.etf.contract.EtfIssueContract.Commands {

        }


    }


}