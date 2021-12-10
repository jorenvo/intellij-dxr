package com.github.jorenvo.intellijdxr.services

import com.intellij.openapi.project.Project
import com.github.jorenvo.intellijdxr.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
