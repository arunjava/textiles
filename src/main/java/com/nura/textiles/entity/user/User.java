package com.nura.textiles.entity.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.nura.textiles.entity.ProbeClass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1728130525730047321L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;
	@Column(name = "first_name_v")
	private String firstName;
	@Column(name = "middle_name_v")
	private String middleName;
	@Column(name = "last_name_v")
	private String lastName;
	@Column(name = "is_active")
	private boolean isActive;

	@Embedded
	private ProbeClass probeClass;

	@OneToMany
	private List<UserRole> userRoles;

}
