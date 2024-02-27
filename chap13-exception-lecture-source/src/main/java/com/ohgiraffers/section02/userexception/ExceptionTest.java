package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;
import com.ohgiraffers.section02.userexception.exception.notEnoughMoneyException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, notEnoughMoneyException {

        if(price < 0) {
            throw new PriceNegativeException("상품의 가격은 음수일 수 없습니다.");

        }
        if(money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if(money < price) {
            throw new notEnoughMoneyException("가진 돈보다 상품가격이 더 높습니다.");

            }
        System.out.println();
        ;
    }

    }
}
