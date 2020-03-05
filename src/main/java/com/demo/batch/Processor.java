/**
 * 
 */
package com.demo.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.demo.model.User;

/**
 * @author Mehul
**/

@Component
public class Processor implements ItemProcessor<User, User> {

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();
	
	public Processor() {
		DEPT_NAMES.put("101", "dept1");
		DEPT_NAMES.put("102", "dept2");
		DEPT_NAMES.put("103", "dept3");
	}

	@Override
	public User process(User user) throws Exception {
		
		String deptName = DEPT_NAMES.get(user.getDepartment());
		user.setDepartment(deptName);
		return user;
	}
	
}
