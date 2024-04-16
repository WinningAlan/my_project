package org.example.my_project_app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.my_project_app.dao.UserDao;
import org.example.my_project_app.entity.User;
import org.example.my_project_app.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2024-04-16 17:45:25
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}

