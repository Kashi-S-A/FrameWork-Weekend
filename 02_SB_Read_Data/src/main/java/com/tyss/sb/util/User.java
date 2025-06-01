package com.tyss.sb.util;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data
public class User {

	@Size(min = 3, max = 10, message = "Name should min 3 and max 10 chars")
	private String userName;

	@Email(message = "Email id is invalid")
	private String userEmail;

	private Long phone;

	@NotEmpty
	private String address;

}
