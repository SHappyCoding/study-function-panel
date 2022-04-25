package com.smz.study.function.panel.util;

import com.smz.study.function.panel.dao.entity.UserEntity;
import com.smz.study.function.panel.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: smz
 * @Date: Created in 2022/4/24 08:20
 * @Description:
 */

@Component
public class ConvertDTOUtils {
    private Logger logger = LoggerFactory.getLogger(ConvertDTOUtils.class);

    private static ConvertDTOUtils instance = new ConvertDTOUtils();

    private ConvertDTOUtils() {
    }

    public static List<UserDTO> UserEntity2DTO(List<UserEntity> allUser) {
        List<UserDTO> result = new ArrayList<>();
        if (CollectionUtils.isEmpty(allUser)) return result;
        for (UserEntity user : allUser) {
            UserDTO userDto = new UserDTO();
            BeanUtils.copyProperties(user, userDto);
            result.add(userDto);
        }
        return result;
    }


}
