package com.crtxr.note.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crtxr.note.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author crtxr
 * @since 2019-08-30
 */
public interface AccountMapper extends BaseMapper<Account> {
    Page<Account> pageList(IPage page, Map<String, Object> mp);
}
