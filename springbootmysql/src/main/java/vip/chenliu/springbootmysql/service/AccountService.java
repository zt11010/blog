package vip.chenliu.springbootmysql.service;

import vip.chenliu.springbootmysql.entity.Account;

import java.util.List;

/**
 * 描述:
 * 账户服务层接口
 *
 * @author zhou
 * @create 2019-05-05 下午10:08
 */

public interface AccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}