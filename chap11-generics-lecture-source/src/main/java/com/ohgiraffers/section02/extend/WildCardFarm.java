package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> farm) {

        farm.getAnimal().cry();
    }

    /* 필기. 토끼농장의 토끼는 Bunny 이거나 그의 후손들만 가능하다. */
    public void extendsType(RabbitFarm<? extends Bunny> farm) {

        farm.getAnimal().cry();

    }

    public void superType(RabbitFarm<? super Bunny> farm) {

        farm.getAnimal().cry();
    }

}
