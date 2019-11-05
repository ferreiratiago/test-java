package dev.marcelo.java;

import dev.marcelo.dep.DummyAPI;
import dev.marcelo.blib.RandomAPI;

import dev.marcelo.java.pck.Callee;
import dev.marcelo.java.pck.MEnum;

// This is another test
public class Caller {
  private int someInt;
  private final MEnum e = MEnum.ENUMA;

  public Caller(int someInt) {
    this.someInt = someInt;
  }

  public int getSomeInt() {
    return someInt;
  }

  public void setSomeInt(int someInt) {
    this.someInt = Callee.someInt + someInt;
  }

  public void testAPI() {
    int k = getSomeInt();
    DummyAPI api = new DummyAPI(k+1);
    RandomAPI rapi = new RandomAPI();
    String s = rapi.toString();
    setSomeInt(api.getNum());
  }

}
