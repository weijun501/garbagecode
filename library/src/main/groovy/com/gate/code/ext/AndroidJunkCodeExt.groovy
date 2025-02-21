package com.gate.code.ext

import org.gradle.api.Action
import org.gradle.api.NamedDomainObjectContainer

class AndroidJunkCodeExt {

    NamedDomainObjectContainer<JunkCodeConfig> variantConfig

    AndroidJunkCodeExt(NamedDomainObjectContainer<JunkCodeConfig> variantConfig) {
        this.variantConfig = variantConfig
    }

    void variantConfig(Action<? super NamedDomainObjectContainer<JunkCodeConfig>> action) {
        action.execute(variantConfig)
    }
}