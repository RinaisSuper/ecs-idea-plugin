package com.github.rinaissuper.ecsideaplugin.services

import com.intellij.openapi.project.Project
import com.github.rinaissuper.ecsideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
