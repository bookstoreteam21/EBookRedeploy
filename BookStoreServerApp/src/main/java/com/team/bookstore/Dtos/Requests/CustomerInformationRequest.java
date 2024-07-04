package com.team.bookstore.Dtos.Requests;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerInformationRequest {
    @NotNull
    @Size(max = 100)
    String fullname;
    String email;
    Boolean gender;
    Date birthday;
    String phonenumber;
    String address;
}
