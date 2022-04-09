package ru.job4j.bank;

import java.util.*;

/**
 * Сервис по работе со счетом пользователя
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет пользователя в систему если его еще нет
     *
     * @param user пользователь на добавление
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Создание аккаунта пользователю, если такого еще не существует
     *
     * @param passport номер паспорта - ключ, по которому будет создан аккаунт
     * @param account  аккаунт пользователя в системе
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(passport)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Поиск пользователя по ключу - паспорту
     *
     * @param passport номер паспорта для поиска
     * @return пользователь в системе, если такой существует
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(p -> p.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Поиск пользователя и его аккаунта по реквизитам
     *
     * @param passport  номер паспорта - ключ
     * @param requisite реквизиты для поиска Аккаунта пользователя
     * @return аккаунт пользователя в системе
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(u -> u.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Операция перевода денег между счетами
     *
     * @param srcPassport   номер паспорта(ключ) счета с которого будет перевод
     * @param srcRequisite  реквизиты аккаунта с которого будет списание
     * @param destPassport  номер паспорта(ключ) счета на который будет перевод
     * @param destRequisite реквизиты аккаунта на который будет зачисление
     * @param amount        сумма перевода
     * @return TRUE если перевод выполнен / FALSE если перевод не выполнен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent() && src.get().getBalance() >= amount) {
            src.get().setBalance(src.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

