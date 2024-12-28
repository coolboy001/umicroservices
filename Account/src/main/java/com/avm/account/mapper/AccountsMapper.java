package com.avm.account.mapper;

import com.avm.account.dto.AccountsDto;
import com.avm.account.entities.Accounts;

public class AccountsMapper {
    public static AccountsDto toAccountsDto(Accounts account, AccountsDto dto) {
        dto.setAccountNumber(account.getAccountNumber());
        dto.setAccountType(account.getAccountType());
        dto.setBranchAddress(account.getBranchAddress());
        return dto;

    }

    public static Accounts toAccount(Accounts account, AccountsDto dto) {
        account.setAccountNumber(dto.getAccountNumber());
        account.setAccountType(dto.getAccountType());
        account.setBranchAddress(dto.getBranchAddress());
        return account;

    }
}
