package com.nura.textiles.entity.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_role")
@Getter
@Setter
@ToString
public class UserRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5154759053757386899L;
	
	@Id
	@GeneratedValue
	private long roleId;
	private String role;
	private String desc;
	private int hierarchy;

}
