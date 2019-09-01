package com.crtxr.note.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("account")
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
    @TableField("account_name")
    private String accountName;

    /**
     * 手机号码
     */
    @TableField("account_phone")
    private String accountPhone;

    /**
     * 密码
     */
    @TableField("account_password")
    private String accountPassword;

    /**
     * 头像
     */
    @TableField("account_headurl")
    private String accountHeadurl;

    /**
     * 账号状态
     */
    @TableField("account_status")
    private Integer accountStatus;

    /**
     * 账号或手机号
     */
    @TableField(exist = false)
    private Integer accountNumber;

}
