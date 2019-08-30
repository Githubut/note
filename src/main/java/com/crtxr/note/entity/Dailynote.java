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
public class Dailynote implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日迹ID
     */
    @TableId
    private Integer noteId;

    /**
     * 用户ID
     */
    private Integer accountId;

    /**
     * 日迹图片
     */
    private String noteUrl;

    /**
     * 日迹描述
     */
    private String noteDescription;

    /**
     * 日迹时间
     */
    private String noteDate;


}
