package com.crtxr.note.service.impl;

import com.crtxr.note.entity.Account;
import com.crtxr.note.mapper.AccountMapper;
import com.crtxr.note.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author crtxr
 * @since 2019-08-30
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
