package com.crtxr.note.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author crtxr
 * @since 2019-08-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId
    private Integer accountId;

    /**
     * 用户名
     */
    private String accountName;

    /**
     * 手机号码
     */
    private String accountPhone;

    /**
     * 密码
     */
    private String accountPassword;

    /**
     * 头像
     */
    private String accountHeadurl;

    /**
     * 账号状态
     */
    private Integer accountStatus;


}
