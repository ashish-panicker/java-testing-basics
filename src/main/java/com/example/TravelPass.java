package com.example;

public enum TravelPass {

  NONE(0.0F),
  SERVICE_MEMBER(10.0f),
  STUDENT(5.0f),
  PUBLIC_SERVANT(4.0f);

  private float discount;

  TravelPass(float discount) {
    this.discount = discount;
  }

  public float getDiscount() {
    return discount;
  }
}
