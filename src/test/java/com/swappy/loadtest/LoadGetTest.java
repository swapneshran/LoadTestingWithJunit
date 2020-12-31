package com.swappy.loadtest;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeLoadRunner;
import org.junit.runner.RunWith;
import com.swappy.loadtest.tests.get.*;

@LoadWith("load_generation.properties")
@TestMapping(testClass = GetScreeningServiceTest.class, testMethod = "testGetScreeningLocalAndGlobal")
@RunWith(ZeroCodeLoadRunner.class)
public class LoadGetTest {

}
