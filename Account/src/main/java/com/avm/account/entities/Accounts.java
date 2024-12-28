package com.avm.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Accounts extends BaseEntity{
    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    @Column(name="customer_id")
    private Long customerId;


}
