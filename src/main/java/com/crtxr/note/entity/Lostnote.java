package com.crtxr.note.entity;

import java.time.LocalDate;
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
public class Lostnote implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自暴自弃ID
     */
    @TableId
    private Integer lostId;

    /**
     * 自暴自弃用户ID
     */
    private Integer accountId;

    /**
     * 自暴自弃时间
     */
    private LocalDate lostDate;


}
