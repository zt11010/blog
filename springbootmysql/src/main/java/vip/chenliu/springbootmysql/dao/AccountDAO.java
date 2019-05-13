package vip.chenliu.springbootmysql.dao;

import vip.chenliu.springbootmysql.entity.Account;

import java.util.List;

/**
 * 描述:
 * 账户接口
 *
 * @author zhou
 * @create 2019-05-05 下午9:59
 */

public interface AccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}