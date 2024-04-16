package org.example.my_project_app.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.my_project_app.entity.User;
import org.example.my_project_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.io.Serializable;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2024-04-16 17:45:24
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param user 查询实体
     * @return 所有数据
     */
//    @GetMapping
//    public R selectAll(Page<User> page, User user) {
//        return success(this.userService.page(page, new QueryWrapper<>(user)));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public User selectOne(@PathVariable Serializable id) {
        return this.userService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
//    @PostMapping
//    public R insert(@RequestBody User user) {
//        return success(this.userService.save(user));
//    }

    /**
     * 修改数据
     *
     * @param user 实体对象
     * @return 修改结果
     */
//    @PutMapping
//    public R update(@RequestBody User user) {
//        return success(this.userService.updateById(user));
//    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.userService.removeByIds(idList));
//    }
}

