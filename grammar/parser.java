
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT fatal: not a git repository (or any of the parent directories): .git)
//----------------------------------------------------

package grammar;

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT fatal: not a git repository (or any of the parent directories): .git) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\003\000\002\003" +
    "\002\000\002\003\004\000\002\004\003\000\002\004\003" +
    "\000\002\005\004\000\002\006\006\000\002\006\003\000" +
    "\002\007\004\000\002\007\003\000\002\010\003\000\002" +
    "\011\003\000\002\011\003\000\002\012\010\000\002\012" +
    "\010\000\002\012\010\000\002\012\010\000\002\012\010" +
    "\000\002\012\010\000\002\012\010\000\002\012\004\000" +
    "\002\013\010\000\002\013\010\000\002\013\010\000\002" +
    "\013\010\000\002\013\010\000\002\013\010\000\002\013" +
    "\006\000\002\013\006\000\002\013\006\000\002\014\004" +
    "\000\002\015\003\000\002\015\003\000\002\015\003\000" +
    "\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\165\000\054\002\uffff\010\uffff\011\uffff\012\uffff\013" +
    "\uffff\014\uffff\015\uffff\016\uffff\017\uffff\020\uffff\021\uffff" +
    "\022\uffff\023\uffff\024\uffff\025\uffff\026\uffff\027\uffff\030" +
    "\uffff\031\uffff\032\uffff\035\uffff\001\002\000\004\002\167" +
    "\001\002\000\054\002\000\010\030\011\027\012\026\013" +
    "\025\014\023\015\021\016\024\017\022\020\020\021\017" +
    "\022\016\023\015\024\014\025\013\026\012\027\011\030" +
    "\034\031\033\032\032\035\035\001\002\000\054\002\uffe0" +
    "\010\uffe0\011\uffe0\012\uffe0\013\uffe0\014\uffe0\015\uffe0\016" +
    "\uffe0\017\uffe0\020\uffe0\021\uffe0\022\uffe0\023\uffe0\024\uffe0" +
    "\025\uffe0\026\uffe0\027\uffe0\030\uffe0\031\uffe0\032\uffe0\035" +
    "\uffe0\001\002\000\054\002\ufffc\010\ufffc\011\ufffc\012\ufffc" +
    "\013\ufffc\014\ufffc\015\ufffc\016\ufffc\017\ufffc\020\ufffc\021" +
    "\ufffc\022\ufffc\023\ufffc\024\ufffc\025\ufffc\026\ufffc\027\ufffc" +
    "\030\ufffc\031\ufffc\032\ufffc\035\ufffc\001\002\000\054\002" +
    "\ufffe\010\ufffe\011\ufffe\012\ufffe\013\ufffe\014\ufffe\015\ufffe" +
    "\016\ufffe\017\ufffe\020\ufffe\021\ufffe\022\ufffe\023\ufffe\024" +
    "\ufffe\025\ufffe\026\ufffe\027\ufffe\030\ufffe\031\ufffe\032\ufffe" +
    "\035\ufffe\001\002\000\004\034\162\001\002\000\004\034" +
    "\155\001\002\000\004\034\150\001\002\000\004\034\143" +
    "\001\002\000\004\034\136\001\002\000\004\034\131\001" +
    "\002\000\004\034\126\001\002\000\004\034\123\001\002" +
    "\000\004\034\116\001\002\000\004\034\115\001\002\000" +
    "\004\034\110\001\002\000\006\033\052\035\035\001\002" +
    "\000\004\034\102\001\002\000\004\034\075\001\002\000" +
    "\004\034\067\001\002\000\004\034\062\001\002\000\054" +
    "\002\ufff7\010\030\011\027\012\026\013\025\014\023\015" +
    "\021\016\024\017\022\020\020\021\017\022\016\023\015" +
    "\024\014\025\013\026\012\027\011\030\034\031\033\032" +
    "\032\035\ufff7\001\002\000\054\002\uffe1\010\uffe1\011\uffe1" +
    "\012\uffe1\013\uffe1\014\uffe1\015\uffe1\016\uffe1\017\uffe1\020" +
    "\uffe1\021\uffe1\022\uffe1\023\uffe1\024\uffe1\025\uffe1\026\uffe1" +
    "\027\uffe1\030\uffe1\031\uffe1\032\uffe1\035\uffe1\001\002\000" +
    "\004\034\047\001\002\000\004\034\042\001\002\000\004" +
    "\004\041\001\002\000\054\002\uffdf\010\uffdf\011\uffdf\012" +
    "\uffdf\013\uffdf\014\uffdf\015\uffdf\016\uffdf\017\uffdf\020\uffdf" +
    "\021\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\026\uffdf\027" +
    "\uffdf\030\uffdf\031\uffdf\032\uffdf\035\uffdf\001\002\000\054" +
    "\002\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd\014\ufffd\015" +
    "\ufffd\016\ufffd\017\ufffd\020\ufffd\021\ufffd\022\ufffd\023\ufffd" +
    "\024\ufffd\025\ufffd\026\ufffd\027\ufffd\030\ufffd\031\ufffd\032" +
    "\ufffd\035\ufffd\001\002\000\054\002\uffde\010\uffde\011\uffde" +
    "\012\uffde\013\uffde\014\uffde\015\uffde\016\uffde\017\uffde\020" +
    "\uffde\021\uffde\022\uffde\023\uffde\024\uffde\025\uffde\026\uffde" +
    "\027\uffde\030\uffde\031\uffde\032\uffde\035\uffde\001\002\000" +
    "\054\002\ufffb\010\ufffb\011\ufffb\012\ufffb\013\ufffb\014\ufffb" +
    "\015\ufffb\016\ufffb\017\ufffb\020\ufffb\021\ufffb\022\ufffb\023" +
    "\ufffb\024\ufffb\025\ufffb\026\ufffb\027\ufffb\030\ufffb\031\ufffb" +
    "\032\ufffb\035\ufffb\001\002\000\004\007\043\001\002\000" +
    "\004\034\044\001\002\000\004\007\045\001\002\000\004" +
    "\034\046\001\002\000\054\002\ufff2\010\ufff2\011\ufff2\012" +
    "\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2" +
    "\021\ufff2\022\ufff2\023\ufff2\024\ufff2\025\ufff2\026\ufff2\027" +
    "\ufff2\030\ufff2\031\ufff2\032\ufff2\035\ufff2\001\002\000\004" +
    "\007\050\001\002\000\006\033\052\035\035\001\002\000" +
    "\054\002\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5\014\ufff5" +
    "\015\ufff5\016\ufff5\017\ufff5\020\ufff5\021\ufff5\022\ufff5\023" +
    "\ufff5\024\ufff5\025\ufff5\026\ufff5\027\ufff5\030\ufff5\031\ufff5" +
    "\032\ufff5\035\ufff5\001\002\000\056\002\ufff6\005\056\010" +
    "\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6" +
    "\017\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\024\ufff6\025" +
    "\ufff6\026\ufff6\027\ufff6\030\ufff6\031\ufff6\032\ufff6\035\ufff6" +
    "\001\002\000\054\002\uffe4\010\uffe4\011\uffe4\012\uffe4\013" +
    "\uffe4\014\uffe4\015\uffe4\016\uffe4\017\uffe4\020\uffe4\021\uffe4" +
    "\022\uffe4\023\uffe4\024\uffe4\025\uffe4\026\uffe4\027\uffe4\030" +
    "\uffe4\031\uffe4\032\uffe4\035\uffe4\001\002\000\054\002\ufff4" +
    "\010\ufff4\011\ufff4\012\ufff4\013\ufff4\014\ufff4\015\ufff4\016" +
    "\ufff4\017\ufff4\020\ufff4\021\ufff4\022\ufff4\023\ufff4\024\ufff4" +
    "\025\ufff4\026\ufff4\027\ufff4\030\ufff4\031\ufff4\032\ufff4\035" +
    "\ufff4\001\002\000\054\002\ufff9\010\ufff9\011\ufff9\012\ufff9" +
    "\013\ufff9\014\ufff9\015\ufff9\016\ufff9\017\ufff9\020\ufff9\021" +
    "\ufff9\022\ufff9\023\ufff9\024\ufff9\025\ufff9\026\ufff9\027\ufff9" +
    "\030\ufff9\031\ufff9\032\ufff9\035\ufff9\001\002\000\004\034" +
    "\057\001\002\000\004\006\060\001\002\000\054\002\ufffa" +
    "\010\ufffa\011\ufffa\012\ufffa\013\ufffa\014\ufffa\015\ufffa\016" +
    "\ufffa\017\ufffa\020\ufffa\021\ufffa\022\ufffa\023\ufffa\024\ufffa" +
    "\025\ufffa\026\ufffa\027\ufffa\030\ufffa\031\ufffa\032\ufffa\035" +
    "\ufffa\001\002\000\054\002\ufff8\010\ufff8\011\ufff8\012\ufff8" +
    "\013\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\021" +
    "\ufff8\022\ufff8\023\ufff8\024\ufff8\025\ufff8\026\ufff8\027\ufff8" +
    "\030\ufff8\031\ufff8\032\ufff8\035\ufff8\001\002\000\004\007" +
    "\063\001\002\000\004\034\064\001\002\000\004\007\065" +
    "\001\002\000\004\034\066\001\002\000\054\002\ufff3\010" +
    "\ufff3\011\ufff3\012\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3" +
    "\017\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3\024\ufff3\025" +
    "\ufff3\026\ufff3\027\ufff3\030\ufff3\031\ufff3\032\ufff3\035\ufff3" +
    "\001\002\000\004\007\070\001\002\000\004\034\071\001" +
    "\002\000\004\007\072\001\002\000\004\033\074\001\002" +
    "\000\054\002\uffeb\010\uffeb\011\uffeb\012\uffeb\013\uffeb\014" +
    "\uffeb\015\uffeb\016\uffeb\017\uffeb\020\uffeb\021\uffeb\022\uffeb" +
    "\023\uffeb\024\uffeb\025\uffeb\026\uffeb\027\uffeb\030\uffeb\031" +
    "\uffeb\032\uffeb\035\uffeb\001\002\000\054\002\ufff6\010\ufff6" +
    "\011\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6\017" +
    "\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\024\ufff6\025\ufff6" +
    "\026\ufff6\027\ufff6\030\ufff6\031\ufff6\032\ufff6\035\ufff6\001" +
    "\002\000\004\007\076\001\002\000\004\034\077\001\002" +
    "\000\004\007\100\001\002\000\004\034\101\001\002\000" +
    "\054\002\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1" +
    "\015\ufff1\016\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\023" +
    "\ufff1\024\ufff1\025\ufff1\026\ufff1\027\ufff1\030\ufff1\031\ufff1" +
    "\032\ufff1\035\ufff1\001\002\000\004\007\103\001\002\000" +
    "\004\034\104\001\002\000\004\007\105\001\002\000\004" +
    "\033\074\001\002\000\054\002\uffe9\010\uffe9\011\uffe9\012" +
    "\uffe9\013\uffe9\014\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9" +
    "\021\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9\026\uffe9\027" +
    "\uffe9\030\uffe9\031\uffe9\032\uffe9\035\uffe9\001\002\000\054" +
    "\002\uffe2\010\uffe2\011\uffe2\012\uffe2\013\uffe2\014\uffe2\015" +
    "\uffe2\016\uffe2\017\uffe2\020\uffe2\021\uffe2\022\uffe2\023\uffe2" +
    "\024\uffe2\025\uffe2\026\uffe2\027\uffe2\030\uffe2\031\uffe2\032" +
    "\uffe2\035\uffe2\001\002\000\004\007\111\001\002\000\004" +
    "\034\112\001\002\000\004\007\113\001\002\000\006\033" +
    "\052\035\035\001\002\000\054\002\uffe6\010\uffe6\011\uffe6" +
    "\012\uffe6\013\uffe6\014\uffe6\015\uffe6\016\uffe6\017\uffe6\020" +
    "\uffe6\021\uffe6\022\uffe6\023\uffe6\024\uffe6\025\uffe6\026\uffe6" +
    "\027\uffe6\030\uffe6\031\uffe6\032\uffe6\035\uffe6\001\002\000" +
    "\054\002\uffec\010\uffec\011\uffec\012\uffec\013\uffec\014\uffec" +
    "\015\uffec\016\uffec\017\uffec\020\uffec\021\uffec\022\uffec\023" +
    "\uffec\024\uffec\025\uffec\026\uffec\027\uffec\030\uffec\031\uffec" +
    "\032\uffec\035\uffec\001\002\000\004\007\117\001\002\000" +
    "\004\034\120\001\002\000\004\007\121\001\002\000\006" +
    "\033\052\035\035\001\002\000\054\002\uffe7\010\uffe7\011" +
    "\uffe7\012\uffe7\013\uffe7\014\uffe7\015\uffe7\016\uffe7\017\uffe7" +
    "\020\uffe7\021\uffe7\022\uffe7\023\uffe7\024\uffe7\025\uffe7\026" +
    "\uffe7\027\uffe7\030\uffe7\031\uffe7\032\uffe7\035\uffe7\001\002" +
    "\000\004\007\124\001\002\000\004\033\074\001\002\000" +
    "\054\002\uffe5\010\uffe5\011\uffe5\012\uffe5\013\uffe5\014\uffe5" +
    "\015\uffe5\016\uffe5\017\uffe5\020\uffe5\021\uffe5\022\uffe5\023" +
    "\uffe5\024\uffe5\025\uffe5\026\uffe5\027\uffe5\030\uffe5\031\uffe5" +
    "\032\uffe5\035\uffe5\001\002\000\004\007\127\001\002\000" +
    "\006\033\052\035\035\001\002\000\054\002\uffe3\010\uffe3" +
    "\011\uffe3\012\uffe3\013\uffe3\014\uffe3\015\uffe3\016\uffe3\017" +
    "\uffe3\020\uffe3\021\uffe3\022\uffe3\023\uffe3\024\uffe3\025\uffe3" +
    "\026\uffe3\027\uffe3\030\uffe3\031\uffe3\032\uffe3\035\uffe3\001" +
    "\002\000\004\007\132\001\002\000\004\034\133\001\002" +
    "\000\004\007\134\001\002\000\004\034\135\001\002\000" +
    "\054\002\ufff0\010\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0" +
    "\015\ufff0\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022\ufff0\023" +
    "\ufff0\024\ufff0\025\ufff0\026\ufff0\027\ufff0\030\ufff0\031\ufff0" +
    "\032\ufff0\035\ufff0\001\002\000\004\007\137\001\002\000" +
    "\004\034\140\001\002\000\004\007\141\001\002\000\004" +
    "\033\074\001\002\000\054\002\uffea\010\uffea\011\uffea\012" +
    "\uffea\013\uffea\014\uffea\015\uffea\016\uffea\017\uffea\020\uffea" +
    "\021\uffea\022\uffea\023\uffea\024\uffea\025\uffea\026\uffea\027" +
    "\uffea\030\uffea\031\uffea\032\uffea\035\uffea\001\002\000\004" +
    "\007\144\001\002\000\004\034\145\001\002\000\004\007" +
    "\146\001\002\000\004\033\074\001\002\000\054\002\uffef" +
    "\010\uffef\011\uffef\012\uffef\013\uffef\014\uffef\015\uffef\016" +
    "\uffef\017\uffef\020\uffef\021\uffef\022\uffef\023\uffef\024\uffef" +
    "\025\uffef\026\uffef\027\uffef\030\uffef\031\uffef\032\uffef\035" +
    "\uffef\001\002\000\004\007\151\001\002\000\004\034\152" +
    "\001\002\000\004\007\153\001\002\000\004\034\154\001" +
    "\002\000\054\002\uffed\010\uffed\011\uffed\012\uffed\013\uffed" +
    "\014\uffed\015\uffed\016\uffed\017\uffed\020\uffed\021\uffed\022" +
    "\uffed\023\uffed\024\uffed\025\uffed\026\uffed\027\uffed\030\uffed" +
    "\031\uffed\032\uffed\035\uffed\001\002\000\004\007\156\001" +
    "\002\000\004\034\157\001\002\000\004\007\160\001\002" +
    "\000\004\033\074\001\002\000\054\002\uffe8\010\uffe8\011" +
    "\uffe8\012\uffe8\013\uffe8\014\uffe8\015\uffe8\016\uffe8\017\uffe8" +
    "\020\uffe8\021\uffe8\022\uffe8\023\uffe8\024\uffe8\025\uffe8\026" +
    "\uffe8\027\uffe8\030\uffe8\031\uffe8\032\uffe8\035\uffe8\001\002" +
    "\000\004\007\163\001\002\000\004\034\164\001\002\000" +
    "\004\007\165\001\002\000\004\033\074\001\002\000\054" +
    "\002\uffee\010\uffee\011\uffee\012\uffee\013\uffee\014\uffee\015" +
    "\uffee\016\uffee\017\uffee\020\uffee\021\uffee\022\uffee\023\uffee" +
    "\024\uffee\025\uffee\026\uffee\027\uffee\030\uffee\031\uffee\032" +
    "\uffee\035\uffee\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\165\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\020\004\007\005\030\007\036\012\005\013\035" +
    "\014\037\015\006\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\005" +
    "\054\006\053\010\050\011\106\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\012\005\013\035\014\037\015\060\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\005\054\006\053\010\050\011\052\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\072\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\105\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\005\054\006\053\010\050\011\113\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\005\054\006\053\010\050\011" +
    "\121\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\124\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\005\054\006\053\010\050\011\127\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\141\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\146\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\160\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\165\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  public grammar.Absyn.Program pProgram() throws Exception
  {
	java_cup.runtime.Symbol res = parse();
	return (grammar.Absyn.Program) res.value;
  }

public <B,A extends java.util.LinkedList<? super B>> A cons_(B x, A xs) { xs.addFirst(x); return xs; }

public void syntax_error(java_cup.runtime.Symbol cur_token)
{
	report_error("Syntax Error, trying to recover and continue parse...", cur_token);
}

public void unrecovered_syntax_error(java_cup.runtime.Symbol cur_token) throws java.lang.Exception
{
	throw new Exception("Unrecoverable Syntax Error");
}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT =null;
		grammar.Absyn.Program start_val = (grammar.Absyn.Program)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= ListStmt 
            {
              grammar.Absyn.Program RESULT =null;
		grammar.Absyn.ListStmt p_1 = (grammar.Absyn.ListStmt)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.PDefs(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ListStmt ::= 
            {
              grammar.Absyn.ListStmt RESULT =null;
		 RESULT = new grammar.Absyn.ListStmt(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListStmt",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ListStmt ::= ListStmt Stmt 
            {
              grammar.Absyn.ListStmt RESULT =null;
		grammar.Absyn.ListStmt p_1 = (grammar.Absyn.ListStmt)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		grammar.Absyn.Stmt p_2 = (grammar.Absyn.Stmt)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = p_1; p_1.addLast(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListStmt",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Stmt ::= LblInstr 
            {
              grammar.Absyn.Stmt RESULT =null;
		grammar.Absyn.LblInstr p_1 = (grammar.Absyn.LblInstr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EStmtLbl(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Stmt ::= Instr 
            {
              grammar.Absyn.Stmt RESULT =null;
		grammar.Absyn.Instr p_1 = (grammar.Absyn.Instr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EStmtInstr(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Label ::= LineLabel _SYMB_0 
            {
              grammar.Absyn.Label RESULT =null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new grammar.Absyn.ELbl(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Label",3, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Offset ::= _INTEGER_ _SYMB_1 Reg _SYMB_2 
            {
              grammar.Absyn.Offset RESULT =null;
		Integer p_1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		String p_3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new grammar.Absyn.OffRel(p_1,p_3); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Offset",4, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Offset ::= Label 
            {
              grammar.Absyn.Offset RESULT =null;
		grammar.Absyn.Label p_1 = (grammar.Absyn.Label)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.OffLbl(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Offset",4, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // LblInstr ::= Label Instr 
            {
              grammar.Absyn.LblInstr RESULT =null;
		grammar.Absyn.Label p_1 = (grammar.Absyn.Label)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		grammar.Absyn.Instr p_2 = (grammar.Absyn.Instr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.LbledStmt(p_1,p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LblInstr",5, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // LblInstr ::= Label 
            {
              grammar.Absyn.LblInstr RESULT =null;
		grammar.Absyn.Label p_1 = (grammar.Absyn.Label)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.LbledLine(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LblInstr",5, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Imm ::= _INTEGER_ 
            {
              grammar.Absyn.Imm RESULT =null;
		Integer p_1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.Immi(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Imm",6, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Addr ::= Imm 
            {
              grammar.Absyn.Addr RESULT =null;
		grammar.Absyn.Imm p_1 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.AddAbs(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Addr",7, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Addr ::= Offset 
            {
              grammar.Absyn.Addr RESULT =null;
		grammar.Absyn.Offset p_1 = (grammar.Absyn.Offset)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.AddRel(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Addr",7, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // RInstr ::= _SYMB_4 Reg _SYMB_3 Reg _SYMB_3 Reg 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		String p_6 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EAdd(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // RInstr ::= _SYMB_20 Reg _SYMB_3 Reg _SYMB_3 Reg 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		String p_6 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ESub(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // RInstr ::= _SYMB_6 Reg _SYMB_3 Reg _SYMB_3 Reg 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		String p_6 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EAnd(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // RInstr ::= _SYMB_14 Reg _SYMB_3 Reg _SYMB_3 Reg 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		String p_6 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EOr(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // RInstr ::= _SYMB_16 Reg _SYMB_3 Reg _SYMB_3 Imm 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Imm p_6 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ESll(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // RInstr ::= _SYMB_19 Reg _SYMB_3 Reg _SYMB_3 Imm 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Imm p_6 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ESrl(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // RInstr ::= _SYMB_17 Reg _SYMB_3 Reg _SYMB_3 Reg 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		String p_6 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ESlt(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // RInstr ::= _SYMB_11 Reg 
            {
              grammar.Absyn.RInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EJr(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RInstr",8, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // IInstr ::= _SYMB_5 Reg _SYMB_3 Reg _SYMB_3 Imm 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Imm p_6 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EAddi(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // IInstr ::= _SYMB_15 Reg _SYMB_3 Reg _SYMB_3 Imm 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Imm p_6 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EOri(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // IInstr ::= _SYMB_7 Reg _SYMB_3 Reg _SYMB_3 Imm 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Imm p_6 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EAndi(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // IInstr ::= _SYMB_18 Reg _SYMB_3 Reg _SYMB_3 Imm 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Imm p_6 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ESlti(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // IInstr ::= _SYMB_9 Reg _SYMB_3 Reg _SYMB_3 Addr 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Addr p_6 = (grammar.Absyn.Addr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EBne(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // IInstr ::= _SYMB_8 Reg _SYMB_3 Reg _SYMB_3 Addr 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		String p_4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Addr p_6 = (grammar.Absyn.Addr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EBeq(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // IInstr ::= _SYMB_12 Reg _SYMB_3 Imm 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Imm p_4 = (grammar.Absyn.Imm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ELui(p_2,p_4); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // IInstr ::= _SYMB_21 Reg _SYMB_3 Addr 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Addr p_4 = (grammar.Absyn.Addr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ESw(p_2,p_4); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // IInstr ::= _SYMB_13 Reg _SYMB_3 Addr 
            {
              grammar.Absyn.IInstr RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		grammar.Absyn.Addr p_4 = (grammar.Absyn.Addr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ELw(p_2,p_4); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IInstr",9, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // JInstr ::= _SYMB_10 Addr 
            {
              grammar.Absyn.JInstr RESULT =null;
		grammar.Absyn.Addr p_2 = (grammar.Absyn.Addr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EJ(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("JInstr",10, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Instr ::= _SYMB_22 
            {
              grammar.Absyn.Instr RESULT =null;
		 RESULT = new grammar.Absyn.ESyscall(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Instr",11, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Instr ::= RInstr 
            {
              grammar.Absyn.Instr RESULT =null;
		grammar.Absyn.RInstr p_1 = (grammar.Absyn.RInstr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.ERInstr(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Instr",11, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Instr ::= IInstr 
            {
              grammar.Absyn.Instr RESULT =null;
		grammar.Absyn.IInstr p_1 = (grammar.Absyn.IInstr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EIInstr(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Instr",11, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Instr ::= JInstr 
            {
              grammar.Absyn.Instr RESULT =null;
		grammar.Absyn.JInstr p_1 = (grammar.Absyn.JInstr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new grammar.Absyn.EJInstr(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Instr",11, RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
