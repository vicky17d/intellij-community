// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

// This is a generated file. Not intended for manual editing.
package org.editorconfig.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.editorconfig.language.psi.EditorConfigDoubleAsteriskPattern;
import org.editorconfig.language.psi.EditorConfigVisitor;
import org.editorconfig.language.psi.base.EditorConfigHeaderElementBase;
import org.jetbrains.annotations.NotNull;

public class EditorConfigDoubleAsteriskPatternImpl extends EditorConfigHeaderElementBase implements EditorConfigDoubleAsteriskPattern {

  public EditorConfigDoubleAsteriskPatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EditorConfigVisitor visitor) {
    visitor.visitDoubleAsteriskPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EditorConfigVisitor) {
      accept((EditorConfigVisitor)visitor);
    }
    else {
      super.accept(visitor);
    }
  }

}
