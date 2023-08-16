package com.maindark.livestream.form;

import com.maindark.livestream.domain.LiveStreamUser;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;
@Data
public class LiveStreamUserForm {
    //id equals mobile
    @NotNull(message = "mobile cannot be empty")
    private Long id;
    @NotNull(message = "username cannot be empty")
    private String nickName;
    @NotNull(message = "password can not be empty")
    private String password;
    private String head;
    private Date registerDate;
    @NotNull(message = "area code cannot be empty")
    private String areaCode;



}
