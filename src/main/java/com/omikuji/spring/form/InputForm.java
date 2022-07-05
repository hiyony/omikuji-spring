package com.omikuji.spring.form;

import javax.validation.constraints.NotEmpty;

public class InputForm {
	
	@NotEmpty(message = "誕生日を入力してください！")
	private String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
