package com.crtxr.note.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crtxr.note.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author crtxr
 * @since 2019-08-30
 */
public interface AccountService extends IService<Account> {
    Page<Account> pageList(Page<Account> page, Map<String, Object> pm);
}
