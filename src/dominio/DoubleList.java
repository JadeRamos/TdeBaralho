/*
 *
 */

package dominio;

import dominio.enums.OrderType;
import dominio.enums.SearchType;
import dominio.enums.SortType;
import dominio.interfaces.Lista;

/**
 * The Class DoubleList.
 * 
 * @param <T>
 *          o tipo de dados
 */
public class DoubleList<T extends Comparable<T>> implements Lista<T> {

  /** The ponteiro. */
  private Binode<T> head;

  /**
   * isListVoid - Verifica se a lista est� vazia.
   *
   * @see dominio.interfaces.Lista#isVoid() Verifica se a lista est� vazia;
   * @return boolean true or false
   */
  public final boolean isListVoid() {
    return (head == null);
  }

  /**
   * @see dominio.interfaces.Lista#insertNod(dominio.Binode) insertNod - Insere
   *      um n� na lista
   * @param info
   * */

  public final void insertBinode(final T pElem) {
    Binode<T> ins = new Binode<T>(pElem);
    Binode<T> prev = new Binode<T>();
    // Se alista for vazia ou o elemento inserido for maior que o ponteiro
    if (this.isListVoid() || head.getElem().compareTo(pElem) > 0) {
      ins.setNext(head);
      if (ins.getNext() != null) {
        ins.getNext().setPrev(ins);
      }
      head = ins;
    } else {
      //Insere no final
      prev = this.posInsert(head, pElem); //M�todo para percorrer a lista e achar o �ltimo elemento
      if(prev != null){
        ins.setPrev(prev);
        ins.setNext(prev.getNext());
        prev.setNext(ins);
        if (ins.getNext() != null) {
          ins.getNext().setPrev(ins);
        }
      }
    }
  }
  
  private Binode<T> posInsert(Binode<T> pHead, T pElem){
    Binode<T> atual = pHead;
    Binode<T> prev = null;
    while(atual != null && pElem.compareTo(atual.getElem()) > 0){
      prev = atual;
      atual = atual.getNext();
    }
    return prev;
  }
  
  
  /**
   * @see dominio.interfaces.Lista#removebinode(dominio.Binode)
   * @param info
   *          Dado a ser inserido no n� duplo
   * @return Binode<T> or null
   */
  public final Binode<T> removeBinode(final T pElem) {
    // TODO c�digo incompleto
    Binode<T> del = posDelete(head, pElem);
    if(del == null){
      return null;
    }
    if(del == head){
      if(del.getNext() == null){
        del.getNext().setPrev(null);
      }
    }
    return del;
  }

  private Binode<T> posDelete(Binode<T> pHead, T pElem){
    Binode<T> atual = pHead;
    while(atual != null && pElem.compareTo(atual.getElem()) != 0){
      atual = atual.getNext();
    }
    return atual;
  }
  
  /**
   * @see dominio.interfaces.Lista#searchbinode(dominio.enums.SearchType,
   *      dominio.Binode)
   * @param tipo
   *          - Tipo do algor�tmo de busca
   * @param info
   *          - Informa��o a ser buscada
   * @return Binode<T> ou null
   */
  public final Binode<T> searchBinode(final SearchType tipo, final T info) {
    return null;
  }

  /**
   * @see dominio.interfaces.Lista#orderList(dominio.enums.SortType,
   *      dominio.enums.OrderType)
   * @param ordem
   *          - Tipo do algor�tmo de ordena��o
   * @param sentido
   *          - Sentido Ascendente / Descendente
   */
  public final void orderList(final SortType ordem, final OrderType sentido) {

  }

}
