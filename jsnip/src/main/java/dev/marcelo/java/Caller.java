
package dev.marcelo.java;

import dev.marcelo.dep.DummyAPI;
import dev.marcelo.blib.RandomAPI;

import dev.marcelo.java.pck.Callee;
import dev.marcelo.java.pck.MEnum;

// This is a test 
public class Caller {
  private int someInt;
  private final MEnum e = MEnum.ENUMA;

  public Caller(int someInt) {
    this.someInt = 6;
  }

  public int getSomeInt() {
    int cena = 3;
    return someInt;
  }

  public void setSomeInt(int someInt) {
  }

  public void testAPI() {
    int k = getSomeInt();
    DummyAPI api = new DummyAPI(k+1);
    RandomAPI rapi = new RandomAPI();
    String s = rapi.toString();
    setSomeInt(api.getNum());
  }
}