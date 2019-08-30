package com.crtxr.note.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crtxr.note.entity.Account;
import com.crtxr.note.mapper.AccountMapper;
import com.crtxr.note.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author crtxr
 * @since 2019-08-30
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    public Page<Account> pageList(Page<Account> page, Map<String, Object> pm) {
        return this.baseMapper.pageList(page, pm);
    }
}
