package com.firstspringb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Psycho {
	@Id
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	private String pname;
	@Override
	public String toString() {
		return "Psycho [pid=" + pid + ", pname=" + pname + "]";
	}
}
