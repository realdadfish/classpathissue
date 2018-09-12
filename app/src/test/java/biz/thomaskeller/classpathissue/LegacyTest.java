package biz.thomaskeller.classpathissue;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareOnlyThisForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareOnlyThisForTest(LegacyDep.class)
@PowerMockIgnore({"org.mockito.*", "android.*", "org.powermock.*"})
public class LegacyTest {

    @Test
    public void doStuff() {
        PowerMockito.mockStatic(LegacyDep.class);
        PowerMockito.when(LegacyDep.stubMe()).thenReturn(true);
        Legacy legacy = new Legacy();
        Assert.assertTrue(legacy.doStuff());
    }
}
