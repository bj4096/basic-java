package com.sljl.basicjava.designpattern.singleton;

import com.sljl.basicjava.dto.UserDto;

/**
 * 枚举的方式实现单例
 *
 * @author L.Y.F
 * @create 2019-03-08 17:18
 */
public enum SingletonF {

    INSTANCE;

    private UserDto userDto;

    public UserDto getInstance() {
        // UserDto为需要单例的类，通过在枚举中创建兑现可实现单例
        if (null == userDto) {
            // 在枚举类中
            userDto = new UserDto();
        }
        return userDto;

    }

}
