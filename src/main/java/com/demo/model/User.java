/**
 * 
 */
package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Mehul
**/

@Entity
@Table(name = "user_master")
@Data
public class User {

	@Id
	private int id;
	private String name;
	private String department;
	private int salary;
}
