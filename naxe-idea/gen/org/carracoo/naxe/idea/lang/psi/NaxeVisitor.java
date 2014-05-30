// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class NaxeVisitor extends PsiElementVisitor {

  public void visitAccessExp(@NotNull NaxeAccessExp o) {
    visitExp(o);
  }

  public void visitAnnotation(@NotNull NaxeAnnotation o) {
    visitPsiElement(o);
  }

  public void visitArgExp(@NotNull NaxeArgExp o) {
    visitExp(o);
  }

  public void visitArgsExp(@NotNull NaxeArgsExp o) {
    visitExp(o);
  }

  public void visitArrayExp(@NotNull NaxeArrayExp o) {
    visitExp(o);
  }

  public void visitAsExp(@NotNull NaxeAsExp o) {
    visitExp(o);
  }

  public void visitAsgExp(@NotNull NaxeAsgExp o) {
    visitExp(o);
  }

  public void visitBinaryExp(@NotNull NaxeBinaryExp o) {
    visitExp(o);
  }

  public void visitBitExp(@NotNull NaxeBitExp o) {
    visitBinaryExp(o);
  }

  public void visitBooleanLit(@NotNull NaxeBooleanLit o) {
    visitPsiElement(o);
  }

  public void visitBshExp(@NotNull NaxeBshExp o) {
    visitBinaryExp(o);
  }

  public void visitCallArg(@NotNull NaxeCallArg o) {
    visitPsiElement(o);
  }

  public void visitCallExp(@NotNull NaxeCallExp o) {
    visitExp(o);
  }

  public void visitCastExp(@NotNull NaxeCastExp o) {
    visitExp(o);
  }

  public void visitClassBody(@NotNull NaxeClassBody o) {
    visitPsiElement(o);
  }

  public void visitClassExp(@NotNull NaxeClassExp o) {
    visitExp(o);
  }

  public void visitClosureExp(@NotNull NaxeClosureExp o) {
    visitExp(o);
  }

  public void visitClsExp(@NotNull NaxeClsExp o) {
    visitExp(o);
  }

  public void visitCmpExp(@NotNull NaxeCmpExp o) {
    visitBinaryExp(o);
  }

  public void visitComponentName(@NotNull NaxeComponentName o) {
    visitPsiElement(o);
  }

  public void visitComponentType(@NotNull NaxeComponentType o) {
    visitPsiElement(o);
  }

  public void visitDefineExp(@NotNull NaxeDefineExp o) {
    visitExp(o);
  }

  public void visitElvExp(@NotNull NaxeElvExp o) {
    visitExp(o);
  }

  public void visitEndExp(@NotNull NaxeEndExp o) {
    visitExp(o);
  }

  public void visitExp(@NotNull NaxeExp o) {
    visitPsiElement(o);
  }

  public void visitForExp(@NotNull NaxeForExp o) {
    visitExp(o);
  }

  public void visitGetterBody(@NotNull NaxeGetterBody o) {
    visitPsiElement(o);
  }

  public void visitGetterExp(@NotNull NaxeGetterExp o) {
    visitExp(o);
  }

  public void visitIdExp(@NotNull NaxeIdExp o) {
    visitExp(o);
    // visitPsiReference(o);
  }

  public void visitIdentifier(@NotNull NaxeIdentifier o) {
    visitPsiElement(o);
  }

  public void visitIfExp(@NotNull NaxeIfExp o) {
    visitExp(o);
  }

  public void visitImportExp(@NotNull NaxeImportExp o) {
    visitExp(o);
  }

  public void visitInheritsExp(@NotNull NaxeInheritsExp o) {
    visitExp(o);
  }

  public void visitLitExp(@NotNull NaxeLitExp o) {
    visitExp(o);
  }

  public void visitLogExp(@NotNull NaxeLogExp o) {
    visitBinaryExp(o);
  }

  public void visitMetaExp(@NotNull NaxeMetaExp o) {
    visitExp(o);
  }

  public void visitMethodBody(@NotNull NaxeMethodBody o) {
    visitPsiElement(o);
  }

  public void visitMethodExp(@NotNull NaxeMethodExp o) {
    visitExp(o);
  }

  public void visitMulExp(@NotNull NaxeMulExp o) {
    visitBinaryExp(o);
  }

  public void visitNewExp(@NotNull NaxeNewExp o) {
    visitExp(o);
  }

  public void visitNullLit(@NotNull NaxeNullLit o) {
    visitPsiElement(o);
  }

  public void visitNumberLit(@NotNull NaxeNumberLit o) {
    visitPsiElement(o);
  }

  public void visitObjectExp(@NotNull NaxeObjectExp o) {
    visitExp(o);
  }

  public void visitObjectPair(@NotNull NaxeObjectPair o) {
    visitPsiElement(o);
  }

  public void visitPackageExp(@NotNull NaxePackageExp o) {
    visitExp(o);
  }

  public void visitParenExp(@NotNull NaxeParenExp o) {
    visitExp(o);
  }

  public void visitPropertyBody(@NotNull NaxePropertyBody o) {
    visitPsiElement(o);
  }

  public void visitPropertyExp(@NotNull NaxePropertyExp o) {
    visitExp(o);
  }

  public void visitRef(@NotNull NaxeRef o) {
    visitPsiReference(o);
  }

  public void visitRefExp(@NotNull NaxeRefExp o) {
    visitExp(o);
  }

  public void visitRegexpLit(@NotNull NaxeRegexpLit o) {
    visitPsiElement(o);
  }

  public void visitSetterBody(@NotNull NaxeSetterBody o) {
    visitPsiElement(o);
  }

  public void visitSetterExp(@NotNull NaxeSetterExp o) {
    visitExp(o);
  }

  public void visitStringLit(@NotNull NaxeStringLit o) {
    visitPsiElement(o);
  }

  public void visitSumExp(@NotNull NaxeSumExp o) {
    visitBinaryExp(o);
  }

  public void visitSuperExp(@NotNull NaxeSuperExp o) {
    visitExp(o);
    // visitPsiReference(o);
  }

  public void visitThisExp(@NotNull NaxeThisExp o) {
    visitExp(o);
    // visitPsiReference(o);
  }

  public void visitUneDecExp(@NotNull NaxeUneDecExp o) {
    visitExp(o);
  }

  public void visitUneIncExp(@NotNull NaxeUneIncExp o) {
    visitExp(o);
  }

  public void visitUnsDecExp(@NotNull NaxeUnsDecExp o) {
    visitExp(o);
  }

  public void visitUnsIncExp(@NotNull NaxeUnsIncExp o) {
    visitExp(o);
  }

  public void visitUnsMinExp(@NotNull NaxeUnsMinExp o) {
    visitExp(o);
  }

  public void visitUnsNegExp(@NotNull NaxeUnsNegExp o) {
    visitExp(o);
  }

  public void visitUnsNotExp(@NotNull NaxeUnsNotExp o) {
    visitExp(o);
  }

  public void visitUnsOptExp(@NotNull NaxeUnsOptExp o) {
    visitExp(o);
  }

  public void visitUntilExp(@NotNull NaxeUntilExp o) {
    visitExp(o);
  }

  public void visitVarExp(@NotNull NaxeVarExp o) {
    visitExp(o);
  }

  public void visitWhileExp(@NotNull NaxeWhileExp o) {
    visitExp(o);
  }

  public void visitWithExp(@NotNull NaxeWithExp o) {
    visitExp(o);
  }

  public void visitPsiReference(@NotNull NaxePsiReference o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull NaxePsiElement o) {
    visitElement(o);
  }

}
