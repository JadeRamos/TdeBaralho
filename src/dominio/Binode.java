/*
 * Classe Binode também chamada de DEQUE
 */

package dominio;

/**
 * The Class Binode<T>.
 * @param <T>
 */
public class Binode<T> {

  /** The elem.
   * @param prev
   * */
  private Binode<T> prev;
  /** The next.
   * @param next
   * */
  private Binode<T> next;
  /** The elem.
   * @param elem
   * */
  private T elem;

  /**
   * Instantiates a new binode.
   */
  public Binode() {

  }

  public Binode(T pElem) {
    this.elem = pElem;
  }
  
  /**
   * Gets the prev.
   *
   * @return the prev
   */
  public final Binode<T> getPrev() {
    return prev;
  }

  /**
   * Sets the prev.
   * @param pprev the new prev
   */
  public final void setPrev(final Binode<T> pprev) {
    this.prev = pprev;
  }

  /**
   * Gets the next.
   *
   * @return the next
   */
  public final Binode<T> getNext() {
    return next;
  }

  /**
   * Sets the next.
   * @param pnext the new next
   */
  public final void setNext(final Binode<T> pnext) {
    this.next = pnext;
  }

  /**
   * Gets the elem.
   *
   * @return the elem
   */
  public final T getElem() {
    return elem;
  }

  /**
   * Sets the elem.
   *
   * @param pelem the new elem
   */
  public final void setElem(final T pelem) {
    this.elem = pelem;
  }
}
