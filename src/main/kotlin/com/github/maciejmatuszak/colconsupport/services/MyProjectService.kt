package com.github.maciejmatuszak.colconsupport.services

import com.intellij.openapi.project.Project
import com.github.maciejmatuszak.colconsupport.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
