package com.avm.account.services;

import com.avm.account.dto.AccountsDto;
import com.avm.account.dto.CustomerDto;

public interface IAccountService {
    public void createAccount(CustomerDto accountsDto);

    public CustomerDto fetchAccountDetails(String mobileNumber);

    public boolean updateAccount(CustomerDto customerDto);
    public boolean deleteAccount(String mobileNumber);
}
