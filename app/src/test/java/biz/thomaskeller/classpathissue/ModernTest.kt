package biz.thomaskeller.classpathissue

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class ModernTest {
    @Mock
    private lateinit var modernDep: ModernDep

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun doStuff() {
        Mockito.`when`(modernDep.stubMe()).thenReturn(true)
        val modern = Modern(modernDep)
        Assert.assertTrue(modern.doStuff())
    }
}
