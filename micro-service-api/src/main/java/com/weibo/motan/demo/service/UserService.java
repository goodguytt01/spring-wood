package com.weibo.motan.demo.service;



import com.weibo.api.motan.transport.async.MotanAsync;
import com.weibo.motan.demo.service.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

/**
 * @author Xiaoyue Xiao
 */
@MotanAsync
public interface UserService extends UserDetailsService {

    Optional<User> getUserById(Long id);

    boolean saveUser(User user);

    boolean modifyUserOnPasswordById(User user);

    boolean deleteUserById(Long id);

}
