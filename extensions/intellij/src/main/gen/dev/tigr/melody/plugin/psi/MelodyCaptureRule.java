// This is a generated file. Not intended for manual editing.
package dev.tigr.melody.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MelodyCaptureRule extends PsiElement {

  @NotNull
  List<MelodyExpression> getExpressionList();

  @NotNull
  List<MelodyLetRule> getLetRuleList();

  @NotNull
  List<MelodyOfRule> getOfRuleList();

  @Nullable
  PsiElement getCharacter();

  @Nullable
  PsiElement getIdentifier();

}
