package com.socialnet.ws.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="username")
	@NotNull(message = "{social.constraint.username.NotNull.message}")
	@Size(min=4, max = 255)
	@UniqueUsername
	private String username;
	
	@Column(name="display_name")
	@NotNull
	@Size(min=4, max = 255)
	private String displayName;
	
	@Column(name="password")
	@NotNull
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "{social.constraint.passwod.pattern.message}")
	@Size(min = 8, max = 255)
	private String password;
		
}
