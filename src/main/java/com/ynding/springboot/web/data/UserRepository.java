package com.ynding.springboot.web.data;

import com.ynding.springboot.entity.Book;
import com.ynding.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, Long>,JpaSpecificationExecutor<Book> {

    User findUserByUsername(String username);
}
