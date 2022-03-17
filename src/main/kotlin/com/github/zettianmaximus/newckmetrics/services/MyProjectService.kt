package com.github.zettianmaximus.newckmetrics.services

import com.intellij.openapi.project.Project
import com.github.zettianmaximus.newckmetrics.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
