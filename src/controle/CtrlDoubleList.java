package controle;

import dominio.DoubleList;

public class CtrlDoubleList {

  private DoubleList<String> deque;
  public CtrlDoubleList() {
    
    deque = new  DoubleList<String>();
    deque.insertBinode("marcus");
    deque.insertBinode("raquel");
    deque.insertBinode("gian lucca");
    
  }

}
