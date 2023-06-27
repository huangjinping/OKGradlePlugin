package con.fire.okplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class OKVSPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("hello This custom plugin fom standalone  project!1943")
        project.tasks.create("OKVSPlugin") {

        }
    }
}