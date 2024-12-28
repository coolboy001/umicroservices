package com.avm.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
@Data
public class CustomerDto {
    @Schema(
            description = "Name of the customer", example = "Eazy Bytes"
    )
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 30, message = "Name can't be less than 2 characters or more than 30 characters")
    private String name;
    @Schema(
            description = "Email address of the customer", example = "tutor@eazybytes.com"
    )
    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;
    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number should be 10 digits")
    private String mobileNumber;
    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
