package com.ap.provider.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	private int index;
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_mail;
}
