package com.dyx.spring.type;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class User {
	private String username;
	public String toString(){
		return "User name="+username;
	}
}
