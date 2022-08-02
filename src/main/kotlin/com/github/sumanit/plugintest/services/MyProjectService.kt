package com.github.sumanit.plugintest.services

import com.intellij.openapi.project.Project
import com.github.sumanit.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
