// This is a generated file. Not intended for manual editing.
package dev.tigr.melody.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MelodyNotRule extends PsiElement {

  @Nullable
  MelodyAheadRule getAheadRule();

  @Nullable
  MelodyBehindRule getBehindRule();

  @Nullable
  MelodySymbolsRule getSymbolsRule();

  @Nullable
  MelodyToRule getToRule();

}
