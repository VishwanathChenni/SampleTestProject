$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:ChromeDriver/Features/SanityTest.feature");
formatter.feature({
  "name": "Sanity Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "name": "Sanity Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User launches URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.myStepDef.userLaunchesURL()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 85\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIN55000449\u0027, ip: \u0027192.168.0.178\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.4\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00ACD383+3134339]\n\tOrdinal0 [0x009BA171+2007409]\n\tOrdinal0 [0x0085AEE8+569064]\n\tOrdinal0 [0x007E139F+70559]\n\tOrdinal0 [0x007DCC63+52323]\n\tOrdinal0 [0x00800DFC+200188]\n\tOrdinal0 [0x00800C1D+199709]\n\tOrdinal0 [0x007FEB0B+191243]\n\tOrdinal0 [0x007E2E77+77431]\n\tOrdinal0 [0x007E3E3E+81470]\n\tOrdinal0 [0x007E3DC9+81353]\n\tOrdinal0 [0x009D0CD9+2100441]\n\tGetHandleVerifier [0x00C3B75A+1396954]\n\tGetHandleVerifier [0x00C3B3D9+1396057]\n\tGetHandleVerifier [0x00C47126+1444518]\n\tGetHandleVerifier [0x00C3BCE8+1398376]\n\tOrdinal0 [0x009C7F51+2064209]\n\tOrdinal0 [0x009D22EB+2106091]\n\tOrdinal0 [0x009D2411+2106385]\n\tOrdinal0 [0x009E49C4+2181572]\n\tBaseThreadInitThunk [0x759EFA29+25]\n\tRtlGetAppContainerNamedObjectPath [0x773B7A9E+286]\n\tRtlGetAppContainerNamedObjectPath [0x773B7A6E+238]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinition.myStepDef.userLaunchesURL(myStepDef.java:72)\r\n\tat ✽.User launches URL(file:///C:/VishwanathChenni/AWS/SampleTestProject/claculatortest/ChromeDriver/Features/SanityTest.feature:4)\r\n",
  "status": "failed"
});
});