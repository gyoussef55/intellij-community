// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.ide

import com.intellij.openapi.components.Service
import com.intellij.openapi.util.registry.RegistryManager

@Service
class EssentialHighlightingMode {
  companion object {
    fun isEnabled(): Boolean {
      return RegistryManager.getInstance().`is`("ide.highlighting.mode.essential");
    }

    fun setEnabled(value: Boolean) {
      RegistryManager.getInstance().get("ide.highlighting.mode.essential").setValue(value)
    }
  }
}