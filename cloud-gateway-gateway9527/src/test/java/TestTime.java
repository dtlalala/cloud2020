import org.junit.Test;

import java.time.ZonedDateTime;

public class TestTime {

    @Test
    public void testTime () {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt); // 2021-04-22T23:12:16.045+08:00[Asia/Shanghai]
    }

}
