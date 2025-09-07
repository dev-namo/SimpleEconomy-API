package io.github.dev_namo.se.api;

/**
 * SimpleEconomy 플러그인의 API 인터페이스입니다.
 * 다른 플러그인에서 이 인터페이스를 통해 경제 기능을 사용합니다.
 */
public interface SimpleEconomyAPI {

    /**
     * 플레이어의 현재 잔고를 가져옵니다.
     *
     * @param playerUuid 잔고를 확인할 플레이어의 UUID
     * @return 플레이어의 잔고
     */
    double getBalance(String playerUuid);

    /**
     * 플레이어의 잔고에 금액을 입금합니다.
     *
     * @param playerUuid 잔고를 입금할 플레이어의 UUID
     * @param amount 입금할 금액
     */
    void deposit(String playerUuid, double amount);

    /**
     * 플레이어의 잔고에서 금액을 출금합니다.
     *
     * @param playerUuid 잔고를 출금할 플레이어의 UUID
     * @param amount 출금할 금액
     * @return 출금이 성공하면 true, 잔고가 부족하면 false
     */
    boolean withdraw(String playerUuid, double amount);

    /**
     * 플레이어의 잔고를 설정합니다.
     *
     * @param playerUuid 잔고를 설정할 플레이어의 UUID
     * @param amount 설정할 금액
     */
    void setBalance(String playerUuid, double amount);

    /**
     * 모든 플레이어의 잔고를 초기 잔고로 재설정합니다.
     */
    void resetAllBalances();
}
