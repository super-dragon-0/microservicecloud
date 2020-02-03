package com.jl.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
	private Long deptno; // primary key
	private String dname; // department name
	private String db_source; // database source
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
}
