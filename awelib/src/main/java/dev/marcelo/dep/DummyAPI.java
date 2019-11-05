package dev.marcelo.dep;

public class DummyAPI {
  private int num;


  public DummyAPI(int num) {
    // This is version 3.0
    this.num = num + 2;
  }

  public int getNum() {
    return num;
  }
}
