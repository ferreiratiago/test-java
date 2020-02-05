package dev.marcelo.dep;

public class NewFile {
  private int num;


  public DummyAPI(int num) {
    // This is version 2.0
    this.num = num + 1;
  }

  public int getNum() {
    return num;
  }
}