package com.biosimilarity.validation.model.trace.Absyn; // Java Package generated by the BNF Converter.

public class Stipulation extends Expression {
  public final VariableExpr variableexpr_;
  public final Expression expression_;

  public Stipulation(VariableExpr p1, Expression p2) { variableexpr_ = p1; expression_ = p2; }

  public <R,A> R accept(com.biosimilarity.validation.model.trace.Absyn.Expression.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.validation.model.trace.Absyn.Stipulation) {
      com.biosimilarity.validation.model.trace.Absyn.Stipulation x = (com.biosimilarity.validation.model.trace.Absyn.Stipulation)o;
      return this.variableexpr_.equals(x.variableexpr_) && this.expression_.equals(x.expression_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.variableexpr_.hashCode())+this.expression_.hashCode();
  }


}
