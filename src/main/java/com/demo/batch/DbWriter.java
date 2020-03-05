/**
 * 
 */
package com.demo.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.User;
import com.demo.repository.UserRepository;

/**
 * @author Mehul
**/

@Component
public class DbWriter implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> users) throws Exception {

		userRepository.saveAll(users);
		System.out.println("saved data is ------ "+users);
	}

}
