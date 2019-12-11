package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class ROper implements java.io.Serializable {
  public abstract <R,A> R accept(ROper.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.ROper_add p, A arg);
    public R visit(grammar.Absyn.ROper_sub p, A arg);
    public R visit(grammar.Absyn.ROper_and p, A arg);
    public R visit(grammar.Absyn.ROper_or p, A arg);
    public R visit(grammar.Absyn.ROper_sll p, A arg);
    public R visit(grammar.Absyn.ROper_slt p, A arg);
    public R visit(grammar.Absyn.ROper_jr p, A arg);
    public R visit(grammar.Absyn.ROper_syscall p, A arg);

  }

}
