import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-pac4j-java-demo"
    val appVersion      = "1.1-SNAPSHOT"

    val appDependencies = Seq(
      "org.pac4j" % "play-pac4j_java" % "1.1.2-SNAPSHOT",
	  "org.pac4j" % "pac4j-http" % "1.4.1-SNAPSHOT",
      "org.pac4j" % "pac4j-cas" % "1.4.1-SNAPSHOT",
      "org.pac4j" % "pac4j-openid" % "1.4.1-SNAPSHOT",
      "org.pac4j" % "pac4j-oauth" % "1.4.1-SNAPSHOT"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      resolvers ++= Seq("Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/",
    		  			"Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository")
    )
}
