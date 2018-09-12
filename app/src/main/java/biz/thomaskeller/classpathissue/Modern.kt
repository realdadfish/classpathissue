package biz.thomaskeller.classpathissue

class Modern(private val modernDep: ModernDep) {
    fun doStuff(): Boolean = modernDep.stubMe()
}
