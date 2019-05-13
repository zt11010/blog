package vip.chenliu.springbootmysql.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.chenliu.springbootmysql.dao.AccountDAO;
import vip.chenliu.springbootmysql.entity.Account;
import vip.chenliu.springbootmysql.service.AccountService;

import java.util.List;

/**
 * 描述:
 * 账户服务接口实现类
 *
 * @author zhou
 * @create 2019-05-05 下午10:13
 */

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO accountDAO;
    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}


